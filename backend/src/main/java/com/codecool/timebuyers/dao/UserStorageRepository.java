package com.codecool.timebuyers.dao;

import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.model.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface UserStorageRepository extends JpaRepository<UserProfile, UUID> {
    UserProfile findByEmail(String email);
    UserProfile findByUserName(String username);
    List<UserProfile> findAllByUserStatus(UserStatus userStatus);

    @Query(value="SELECT * FROM user_profile\n" +
            "JOIN tasks_to_take ttt on user_profile.id = ttt.user_id\n" +
            "WHERE ttt.interest = :task", nativeQuery = true)
    List<UserProfile> usersByTask(@Param("task") String task);


    List<UserProfile> findAllByTaskToTakeAndUserStatus(Task task, UserStatus userStatus);
}
