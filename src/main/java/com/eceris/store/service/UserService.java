package com.eceris.store.service;

import java.util.List;

import com.eceris.store.domain.User;
import com.eceris.store.domain.model.UserModel;

public interface UserService {

    User createUser(UserModel model);

    User updateUser(UserModel model);

    void deleteUser(Long id);

    User getUser(Long id);

    List<User> getUsers();

}
