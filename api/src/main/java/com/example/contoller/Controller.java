package com.example.contoller;

import com.example.RequestDTO;
import com.example.impl.ServiceControllerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ServiceControllerFeign serviceControllerFeign;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "IM ALIVE!";
    }

    @RequestMapping("/send")
    @ResponseBody
    public String send() {
        serviceControllerFeign.justSend(new RequestDTO("one", "two", 1));
        return "ok";
    }
}
