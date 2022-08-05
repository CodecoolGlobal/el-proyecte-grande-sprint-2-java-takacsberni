package com.codecool.timebuyers.controller;

import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.service.HireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HireController {
    @Autowired
    private HireService hireService;


    @PostMapping(value = "api/add-buyer")
    public void addBuyer(@RequestBody UserProfile buyer){
        System.out.println("oiuoiu");
        hireService.addBuyer(buyer);
    }

    @PostMapping(value="api/add-payment-method/{paymentMethod}")
    public void addPaymentMethod(@PathVariable PaymentMethod paymentMethod){
        hireService.addPaymentMethod(paymentMethod);
    }

    @PostMapping(value="api/add-task-to-buy/{taskToBuy}")
    public void addTaskToBuy(@PathVariable Task taskToBuy){
        hireService.addTaskToBuy(taskToBuy);
    }

    @PostMapping(value = "api/set-tasker")
    public void setTasker(@RequestBody UserProfile tasker) {
        hireService.setTasker(tasker);
    }

    @GetMapping(value="api/get-possible-taskers")
    public List<UserProfile> getPossibleTaskers(){
        System.out.println("lkjls");
        return hireService.getPossibleTaskers();
    }
}
