package com.codecool.timebuyers.factory;

import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.payment.Pay;
import com.codecool.timebuyers.payment.PayWithCash;
import com.codecool.timebuyers.payment.PayWithTask;

public class PaymentFactory {
    /** responsible for getting proper pay implementation based on the provided format */

    public Pay createByPaymentMethod(PaymentMethod paymentMethod){
        switch (paymentMethod){
            case CASH: return new PayWithCash();
            case TASK: return new PayWithTask();
            default: throw new IllegalArgumentException();
        }
    }
}
