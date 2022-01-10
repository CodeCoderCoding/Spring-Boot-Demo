package com.supremepole.b04springbootredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class WebsiteController {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @GetMapping("/supremepole")
    public void test1() {
        ValueOperations<String, String> ops1 = stringRedisTemplate.opsForValue();
        ops1.set("website", "supremepole");
        String website1 = ops1.get("website");
        System.out.println(website1);
        ValueOperations ops2 = redisTemplate.opsForValue();
        Website w2 = new Website();
        w2.setId(1);
        w2.setName("supremepole");
        w2.setUrl("https://cs.supremepole.com");
        ops2.set("w2", w2);
        Website website2 = (Website) ops2.get("w2");
        System.out.println(website2);
    }
}
