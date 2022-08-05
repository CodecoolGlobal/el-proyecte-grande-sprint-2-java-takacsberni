package com.codecool.timebuyers.payment;

import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.model.UserStatus;
import com.codecool.timebuyers.service.UserStorageService;

import java.util.ArrayList;
import java.util.List;

public class PayWithTask implements Pay {

    @Override
    public List<UserProfile> getResultList(UserProfile buyer, UserProfile tasker, Task taskToBuy, Task taskToOffer, UserStorageService userStorageService) {

        List<UserProfile> resultList = new ArrayList<>();
        List<UserProfile> allUsers = userStorageService.getAllUser();
        for (UserProfile user : allUsers){
            if (user.getUserStatus().equals(UserStatus.TASKER) || user.getUserStatus().equals(UserStatus.BOTH)){
                if (user.getTown().equals(buyer.getTown())){
                    if (user.getTaskToTake().contains(taskToBuy)){
                        if (user.getTaskToNeed().contains(taskToOffer)){ //returns with boolean
                            resultList.add(user);
                        }
                    }
                }
            }
        }
        return resultList;
    }

    @Override
    public void sendEmail(UserProfile buyer, UserProfile tasker, PaymentMethod paymentMethod, Task taskToBuy, Task taskToOffer) {

    }
}
