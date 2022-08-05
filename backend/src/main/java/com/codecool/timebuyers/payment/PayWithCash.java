package com.codecool.timebuyers.payment;

import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.model.UserStatus;
import com.codecool.timebuyers.service.UserStorageService;

import java.util.ArrayList;
import java.util.List;

public class PayWithCash implements Pay {

    @Override
    public List<UserProfile> getResultList(UserProfile buyer, UserProfile tasker, Task taskToBuy, Task taskToGive, UserStorageService userStorageService) {
        List<UserProfile> resultList = new ArrayList<>();

        List<UserProfile> allUsers = userStorageService.getAllUser();
        for (UserProfile user : allUsers){
            if (user.getUserStatus().equals(UserStatus.TASKER) || user.getUserStatus().equals(UserStatus.BOTH)){
                if (user.getTaskToTake().contains(taskToBuy)){
                    if (user.getTown().equals(buyer.getTown())){
                        resultList.add(user);
                    }
                }
            }
        }
        return resultList;
    }

    @Override
    public void sendEmail(UserProfile buyer, UserProfile tasker, PaymentMethod paymentMethod, Task taskToBuy, Task taskToOffer) {
        System.out.println("This message is from sendEmail method if you pay with cash");
    }
}
