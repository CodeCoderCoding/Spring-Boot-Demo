package com.supremepole.springboottest;

import org.springframework.stereotype.Service;

/**
 * @author CodeCoderCoding
 */
@Service
public class TestService {
    public String testService(String website) {
        return website;
    }
}
