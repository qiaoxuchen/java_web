package com.demo9;

import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Test9
{

    public static void excuteJob(StringRedisTemplate redisTemplate, String key,
                                 long expire, TimeUnit timeUnit, Callable<Void> callable) {
        String uuid = UUID.randomUUID().toString();
        ValueOperations<String, String> operations = redisTemplate
                .opsForValue();
        try {
            Boolean setIfAbsent = operations.setIfAbsent(key, uuid, expire,
                    timeUnit);
            if (setIfAbsent != null && setIfAbsent) {
                log.info("获取到互斥锁！开始执行任务");
                // 执行回调方法
                callable.call();
                log.info("执行任务完成");

            } else {
                log.info("获取互斥锁失败！");
            }
        } catch (Exception e) {
            log.error("服务出现异常：", e);
        } finally {
            String string = operations.get(key);
            if (StringUtils.equals(string, uuid)) {
                redisTemplate.delete(key);
            }
        }
    }

}
