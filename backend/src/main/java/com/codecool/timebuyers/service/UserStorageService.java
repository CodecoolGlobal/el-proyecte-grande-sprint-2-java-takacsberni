
package com.codecool.timebuyers.service;

import com.codecool.timebuyers.dao.UserStorageRepository;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.model.UserStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Component
public class UserStorageService {
    @Autowired
    UserStorageRepository userStorageRepository;

    public UserProfile getUserByEmail(String email){
        return userStorageRepository.findByEmail(email);
    }

    public UserProfile getUserByUsername(String username){
        return userStorageRepository.findByUserName(username);
    }

    public List<UserProfile> getAllUser(){
        return userStorageRepository.findAll();
    }
    public void addUser(UserProfile newUserProfile) {
        userStorageRepository.save(newUserProfile);
    }
    public void deleteUser(String userName){
        userStorageRepository.delete(userStorageRepository.findByUserName(userName));
    }
    public UserProfile updateUserByUserName(UUID id, UserProfile updatedUserProfile){
        if (getUserProfileById(id) != null){
            updatedUserProfile.setId(id);
            userStorageRepository.save(updatedUserProfile);
        }
        return updatedUserProfile;
    }
    public UserProfile getUserProfileById(UUID id) {
        Optional<UserProfile> UserProfileById = userStorageRepository.findById(id);
        if (UserProfileById.isEmpty()){
            return null;
        }
        return UserProfileById.get();
    }

    public List<UserProfile> getBuyers() {
        List<UserProfile> buyers = userStorageRepository.findAllByUserStatus(UserStatus.BUYER);
        List<UserProfile> both = userStorageRepository.findAllByUserStatus(UserStatus.BOTH);
        return Stream.concat(buyers.stream(), both.stream())
                .collect(Collectors.toList());
    }

    public List<UserProfile> getTaskers() {
        List<UserProfile> takers = userStorageRepository.findAllByUserStatus(UserStatus.TASKER);
        List<UserProfile> both = userStorageRepository.findAllByUserStatus(UserStatus.BOTH);
        return Stream.concat(takers.stream(), both.stream())
                .collect(Collectors.toList());
    }

    public List<UserProfile> getTaskersByTaskToTake(String task){
        List<UserProfile> usersByTaskToTake = userStorageRepository.usersByTask(task);
        System.out.println(usersByTaskToTake);
        return userStorageRepository.usersByTask(task);
    }

    public List<UserProfile> getUsersByPaymentMethod(String task, String userStatus) {
        List<UserProfile> usersByTask = getTaskersByTaskToTake(task);
        UserStatus status = UserStatus.valueOf(userStatus);
        return usersByTask.stream().filter(userProfile -> userProfile.getUserStatus() == status)
                .collect(Collectors.toList());
    }

}