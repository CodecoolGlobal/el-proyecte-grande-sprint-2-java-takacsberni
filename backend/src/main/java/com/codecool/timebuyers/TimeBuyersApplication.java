package com.codecool.timebuyers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimeBuyersApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeBuyersApplication.class, args);
//        UserStorageService userStorageService = new UserStorageService();
//
//        UserProfile buyer = new UserProfile("Buyer1", "password", UserStatus.BUYER);
//        buyer.addTaskToNeed(Task.COOKING);
//        buyer.addTaskToNeed(Task.CAT_SITTING);
//        buyer.addTaskToNeed(Task.GARDENING);
//        buyer.setTown("Budapest");
//        UserProfile tasker = new UserProfile("Tasker1", "taskerPassword", UserStatus.TASKER);
//        tasker.addTaskToTake(Task.GARDENING);
//        tasker.setTown("Budapest");
//        UserProfile both = new UserProfile("Both1", "bothPassword", UserStatus.BOTH);
//        both.addTaskToTake(Task.GARDENING);
//        both.addTaskToNeed(Task.COOKING);
//        both.setTown("Budapest");
//
//        userStorageService.addUser(buyer);
//        userStorageService.addUser(tasker);
//        userStorageService.addUser(both);
//
//        HireService hireService = new HireService(new PaymentFactory(), buyer, Task.GARDENING, PaymentMethod.CASH);
//        hireService.setPossibleTaskers(userStorageService);
//        System.out.println(hireService.getPossibleTaskers());
//        hireService.setTasker(tasker);
//        hireService.sendEmail();
    }
}
