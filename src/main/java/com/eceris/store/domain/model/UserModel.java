package com.eceris.store.domain.model;

import com.eceris.store.domain.User.UserType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private Long id;
    private String email;
    private String password;
    private UserType type;
}
