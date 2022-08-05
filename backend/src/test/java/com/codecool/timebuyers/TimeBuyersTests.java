package com.codecool.timebuyers;

import com.codecool.timebuyers.dao.UserStorageRepository;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.model.UserStatus;
import com.codecool.timebuyers.service.UserStorageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.UUID;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase
class TimeBuyersTests {

    private final UserStorageRepository userStorageRepository;
    private final UserStorageService userStorageService;
    private UserProfile testUserProfile;

    @Autowired
    public TimeBuyersTests(UserStorageRepository userStorageRepository, UserStorageService userStorageService) {
        this.userStorageRepository = userStorageRepository;
        this.userStorageService = userStorageService;
    }

    @BeforeEach
    void setUpUser() {
        this.testUserProfile = UserProfile.builder()
                .id(UUID.fromString("e7636f4e-1255-11ed-861d-0242ac120010"))
                .userName("Josh33")
                .password("password")
                .phoneNumber("06203564534")
                .email("josh33@gmail.com")
                .town("Budapest")
                .userStatus(UserStatus.BOTH)
                .taskToTake(List.of(Task.COOKING))
                .taskToNeed(List.of(Task.WAIT_IN_LINE))
                .rating(5)
                .build();
        userStorageRepository.save(testUserProfile);
    }

    @Test
    void getAllUserTest(){
        Assertions.assertFalse(userStorageRepository.findAll().isEmpty());
    }

    @Test
    void getuserByIdTest(){
        Assertions.assertEquals(UUID.fromString("e7636f4e-1255-11ed-861d-0242ac120010"), testUserProfile.getId());
    }

    @Test
    void addUserTest() {
        userStorageService.addUser(testUserProfile);
        Assertions.assertFalse(userStorageRepository.findAll().isEmpty());
    }

    // not working --> itthagyom érdekességként
    @Test
    void deleteUserByNameTest() {
        userStorageService.deleteUser(testUserProfile.getUserName());
        Assertions.assertTrue(userStorageRepository.findAll().isEmpty());
    }

    @Test
    void getTaskersTest(){
        Assertions.assertFalse((userStorageService.getTaskers()).isEmpty());
    }

    @Test
    void getBuyersTest(){
        Assertions.assertFalse((userStorageService.getBuyers()).isEmpty());
    }
}
