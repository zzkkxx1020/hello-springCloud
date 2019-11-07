package com.funtl.hello.spring.cloud.web.admin.feign.server.hystrix;

import com.funtl.hello.spring.cloud.web.admin.feign.server.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHai(String message) {
        return String.format("Hi your message is %s but request bad",message);
    }
}
