package com.codecool.timebuyers.payment;

import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.service.UserStorageService;

import java.util.List;

public interface Pay {
    List<UserProfile> getResultList(UserProfile buyer, UserProfile tasker, Task taskToBuy, Task taskToGive, UserStorageService userStorageService);
    //TODO: void pay(); - miután megkapjuk a lehetséges usereket, vásároljunk

    void sendEmail(UserProfile buyer, UserProfile tasker, PaymentMethod paymentMethod, Task taskToBuy, Task taskToOffer);
}

