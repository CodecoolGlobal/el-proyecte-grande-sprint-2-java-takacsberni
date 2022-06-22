package com.codecool.timebuyers.service;

import com.codecool.timebuyers.factory.PaymentFactory;
import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.payment.Pay;
import org.apache.catalina.User;

import java.util.Arrays;
import java.util.List;

public class HireService {
    private UserProfile buyer;
    private UserProfile tasker;
    private Task task;
    private PaymentMethod paymentMethod;

    private PaymentFactory paymentFactory;
    private Pay pay;



    public HireService(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public void hireUser(UserProfile buyer, User tasker, Task task, PaymentMethod paymentMethod) {
        this.buyer = buyer;
        this.paymentMethod = paymentMethod;
        this.task = task;
        this.pay = paymentFactory.createByPaymentMethod(paymentMethod);
    }

        /** kap egy buyer usert és egy paymentMethodot,
         * buyer lát egy listát a választható Taskokról
         * kiválaszt egyet azokból
         *
         * - ha cash:
         * végigiterálunk a tasker usereken (userStorage.getAllUser -ben az a user.getUserStatus == TASKER || BOTH,  && user.getCity == buyer.getCity, az a user megy egy result listbe
         * visszaadjuk a result listet
         * buyer választ egy taskert
         * és mehet a kétféle email: egy a buyernek, egy a taskernek
         *
         * - ha service:
         * buyer kiválasztja azt a taskot, amit felkínál cserébe (buyer.getTasksToTake),
         * végigiterálunk a tasker usereken (userStorage.getAllUser -ben az a user.getUserStatus == TASKER || BOTH,
         *  && user.getCity == buyer.getCity, && user.getTasksToNeed-ben benne van a buyer által választott task
         * ha a fentiek igazak, az a tasker kerüljön a search resultba
         * **/


        //TODO: factory design a fentiekre; ne ifekkel csináljuk!

}
