package com.codecool.timebuyers.service;

import com.codecool.timebuyers.factory.PaymentFactory;
import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.payment.Pay;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HireService {
    private UserProfile buyer;
    private Task taskToBuy;
    private UserProfile tasker;
    private Task taskToOffer;
    private PaymentMethod paymentMethod;
    private Pay pay;
    private List<UserProfile> PossibleTaskers = new ArrayList<>();
    private final PaymentFactory paymentFactory = new PaymentFactory();

    public HireService() {
    }

    public void addPaymentMethod(PaymentMethod paymentMethod){ //important to call this, to choose a paymentMethod (it triggers the paymentFactory)
        PaymentFactory paymentFactory = new PaymentFactory();
        this.pay = paymentFactory.createByPaymentMethod(paymentMethod);
        this.paymentMethod = paymentMethod;
    }
    public void addBuyer(UserProfile buyer) {
        this.buyer = buyer;
    }

    public void addTaskToBuy(Task taskToBuy){
        this.taskToBuy = taskToBuy;
    }

    public void setPossibleTaskers(UserStorageService userStorageService) {
        this.PossibleTaskers = pay.getResultList(buyer, tasker, taskToBuy, taskToOffer, userStorageService);
    }

    public List<UserProfile> getPossibleTaskers(){
        return PossibleTaskers;
    }

    public void setTasker(UserProfile tasker) {
        this.tasker = tasker;
    }

    public void setTaskToOffer(Task taskToOffer) {
        this.taskToOffer = taskToOffer;
    }

    public void sendEmail(){
        pay.sendEmail(buyer, tasker, paymentMethod, taskToBuy, taskToOffer);
    }
}
