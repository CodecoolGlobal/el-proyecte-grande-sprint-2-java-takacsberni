package com.codecool.timebuyers.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@Getter
public class UserProfile implements UserDetails {


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
    @Enumerated(EnumType.STRING)
    private Role role;

    @Override
    public String toString() {
        return "userName: " + userName;
    }

    @Override
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role.getGrantedAuthorities();
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
