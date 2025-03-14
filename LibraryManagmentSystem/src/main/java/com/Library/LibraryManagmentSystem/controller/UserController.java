package com.Library.LibraryManagmentSystem.controller;

import com.Library.LibraryManagmentSystem.constant.Operator;
import com.Library.LibraryManagmentSystem.constant.UserFilterType;
import com.Library.LibraryManagmentSystem.dto.request.UserRequestDto;
import com.Library.LibraryManagmentSystem.dto.response.UserResponseDto;
import com.Library.LibraryManagmentSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Filter;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserResponseDto createUser(@RequestBody @Validated UserRequestDto userRequestDto) {
        return userService.createUser(userRequestDto);
    }

    @GetMapping("/filter")
    public List<UserResponseDto> getUser(@RequestParam("filterBy")UserFilterType filterType
            , @RequestParam("Operator")Operator operator, @RequestParam("value")String value) {
        return null;
        // not they can be filter by name phone number etc
    }


    /*
    when ever i have a request to crate a user i will just pass to my user service and it si responsibity to service
    to make sure that the object is created
     */

}
/*
CRUD
CREATE USER;
APPLY FILTER
READ USER
UPDATE USER
DELETE USER
 */
