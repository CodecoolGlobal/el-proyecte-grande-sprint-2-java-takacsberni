package com.codecool.timebuyers.controller;

import com.codecool.timebuyers.utils.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class SendEmailController {
    private String senderEmailAddress;

    public SendEmailController() throws IOException  {
    }

    @Autowired
    private EmailSender sendEmailObject;

    @GetMapping(value="api/getit")
    public String getit(){
        return "this";
    }

    @PostMapping(value = "api/send-email/{emailaddress}")
    public String sendEmailRoute(@PathVariable String emailaddress) {
        System.out.println("It's from sendEmailRoute class");

        //TODO: this.senderEmailAddress = buyer.getEmail;
//TODO:         HashMap orderDetails = buyer.adatai, tasker.adatai

        try {
            sendEmailObject.sendMail(emailaddress);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "POST";
    }
}
