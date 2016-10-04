package com.example.controller;

import com.example.RequestDTO;
import com.example.ServiceController;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InnerController implements ServiceController {

    @Override
    @RequestMapping(value = "/justSend/")
    public void justSend(@NotBlank RequestDTO requestDTO) {
        System.out.println("asdasdasd");
    }

    //@Override
    //public ResponseDTO sendAndGetResponse(RequestDTO requestDTO) {
    //    return null;
    //}
}
