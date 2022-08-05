package com.codecool.timebuyers.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

public enum Task {
    IKEA_ASSEMBLY(2000),
    MOVE_BOXES_WITHOUT_CAR(2000),
    MOVE_BOXES_WITH_CAR(3000),
    SHOPPING(2500),
    GARDENING(2500),
    HOUSE_CLEANING(2000),
    WAIT_IN_LINE(1700),
    COOKING(1700),
    RETURN_ITEMS(1200),
    BABY_SITTING(2500),
    GET_KIDS_FROM_SCHOOL(2500),
    DOG_WALKING(2300),
    CAT_SITTING(2000),
    DOG_SITTING(2000);

    int price;

    Task(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}