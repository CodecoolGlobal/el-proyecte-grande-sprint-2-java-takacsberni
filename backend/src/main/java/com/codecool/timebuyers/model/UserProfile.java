package com.codecool.timebuyers.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class UserProfile {


    @Id
    @GeneratedValue
    private UUID id;
    private String userName;
    private String password;
    private String phoneNumber;
    private String email;
    private String town;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    @ElementCollection(targetClass = Task.class)
    @JoinTable(name = "tasks_to_need", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "task_to_need", nullable = false)
    @Enumerated(EnumType.STRING)
    private List<Task> taskToNeed;
    @ElementCollection(targetClass = Task.class)
    @JoinTable(name = "tasks_to_take", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "interest", nullable = false)
    @Enumerated(EnumType.STRING)
    private List<Task> taskToTake;
    private int rating;
    private String photo;


    @Override
    public String toString() {
        return "userName: " + userName;
    }

}
