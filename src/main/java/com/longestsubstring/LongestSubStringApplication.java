package com.longestsubstring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class LongestSubStringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LongestSubStringApplication.class, args);
    }

    @RequestMapping(value="/longestSubString", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int lengthOfLongestSubstring(String s)
    {
        int result = 0;
        
        return result;
    }

}
