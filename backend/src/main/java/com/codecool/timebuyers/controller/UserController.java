package com.codecool.timebuyers.controller;


import com.codecool.timebuyers.dao.UserStorageRepository;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.service.UserStorageService;
import com.codecool.timebuyers.utils.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserStorageService userStorageService;
    private UserStorageRepository userStorageRepository;

    @GetMapping(value = "api/users/get/{email}")
    public UserProfile getUserByEmail(@PathVariable String email) {
        return userStorageService.getUserByEmail(email);
    }

    @GetMapping(value = "api/users/get/username/{username}")
    public UserProfile getUserByUsername(@PathVariable String username) {
        return userStorageService.getUserByUsername(username);
    }

    @GetMapping(value = "api/users/all")
    public List<UserProfile> getAllUser() {
        return userStorageService.getAllUser();
    }

    @GetMapping(value = "api/users/taskers")
    public List<UserProfile> getTaskers() {
        return userStorageService.getTaskers();
    }

    @GetMapping(value = "api/users/buyers")
    public List<UserProfile> getBuyers() {
        return userStorageService.getBuyers();
    }

//    @PostMapping(value = "api/new-user")
//    public void addUser(@RequestBody UserProfile newUser) {
//        userStorageService.addUser(newUser);
//    }

    @PostMapping(value = "api/new-user")
    public void addUser(@RequestBody UserProfile newUser, @RequestParam("image") MultipartFile multipartFile) throws IOException {

        String fileName = StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        newUser.setPhoto(fileName);

        UserProfile savedUser = userStorageRepository.save(newUser);

        String uploadDir = "user-photos/" + savedUser.getUserName();

        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        userStorageService.addUser(newUser);
    }

    @DeleteMapping(value = "api/delete/{username}")
    public void deleteUser(@PathVariable String username){
        userStorageService.deleteUser(username);
    }

    @PutMapping(value = "api/update/{id}")
    public void updateUser(@PathVariable UUID id,
                           @RequestBody UserProfile updatedUserProfile){
        userStorageService.updateUserByUserName(id, updatedUserProfile);
    }

    @GetMapping(value = "api/users/{task}")
    public List<UserProfile> usersByTask(@PathVariable String task){
        return userStorageService.getTaskersByTaskToTake(task);
    }

    @GetMapping(value = "api/users/{task}/{status}")
    public List<UserProfile> getUsersByPayment(@PathVariable String task, @PathVariable String status){
        return userStorageService.getUsersByPaymentMethod(task, status);
    }
}
