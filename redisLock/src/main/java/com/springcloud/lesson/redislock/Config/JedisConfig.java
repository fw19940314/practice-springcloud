//package com.springcloud.lesson.redislock.Config;
//
//import com.springcloud.lesson.redislock.common.BaseCommon;
//
//import com.springcloud.lesson.redislock.domain.User;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import redis.clients.jedis.JedisPool;
//import redis.clients.jedis.JedisPoolConfig;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//
///**
// * @Auther: jerry.feng
// * @Date: 2019/8/14
// * @Description:
// */
//@Configuration
//@ConfigurationProperties("redis")
//@PropertySource("classpath:/redis.properties")
//public class JedisConfig extends BaseCommon {
//
////    @Bean("jRedisGenerator")
////    public JRedisGenerator jRedisGenerator(){
////        return new JRedisGenerator();
////    }
//
//
////    @Value("${redis.host}")
//    private String host;
//
////    @Value("${redis.port}")
//    private int port;
//
////    @Value("${redis.timeout}")
//    private int timeout;
//
//
//    @Bean
//    public JedisPool redisPoolFactory()  throws Exception{
//        log.info("JedisPool注入成功！！");
//        log.info("redis地址：" + host + ":" + port);
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        // 是否启用pool的jmx管理功能, 默认true
//        jedisPoolConfig.setJmxEnabled(true);
//        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout);
//        return jedisPool;
//    }
//
//    public String getHost() {
//        return host;
//    }
//
//    public void setHost(String host) {
//        this.host = host;
//    }
//
//    public int getPort() {
//        return port;
//    }
//
//    public void setPort(int port) {
//        this.port = port;
//    }
//
//    public int getTimeout() {
//        return timeout;
//    }
//
//    public void setTimeout(int timeout) {
//        this.timeout = timeout;
//    }
//
//}
