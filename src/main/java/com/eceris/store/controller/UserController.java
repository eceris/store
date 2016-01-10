package com.eceris.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eceris.store.domain.User;
import com.eceris.store.domain.model.UserModel;
import com.eceris.store.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody UserModel model) {
        return new ResponseEntity<User>(userService.createUser(model), HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(value = "/user", method = {RequestMethod.PUT})
    public ResponseEntity<User> updateUser(@RequestBody UserModel model) {
        return new ResponseEntity<User>(userService.updateUser(model), HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(value = "/user", method = {RequestMethod.DELETE})
    public ResponseEntity deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(value = "/user")
    public ResponseEntity<User> getUser(@RequestParam Long id) {
        return new ResponseEntity<User>(userService.getUser(id), HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(value = "/users")
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<List<User>>(userService.getUsers(), HttpStatus.OK);
    }
}
