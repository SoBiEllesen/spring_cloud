package com.example.impl;

import com.example.RequestDTO;
import com.example.ServiceController;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service")
public interface ServiceControllerFeign extends ServiceController {

    @RequestMapping(method = RequestMethod.POST, value = "/justSend/",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    void justSend(RequestDTO requestDTO);
}
