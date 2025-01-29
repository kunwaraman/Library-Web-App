package com.Library.LibraryManagmentSystem.service;

import com.Library.LibraryManagmentSystem.constant.UserType;
import com.Library.LibraryManagmentSystem.dto.request.UserRequestDto;
import com.Library.LibraryManagmentSystem.dto.response.UserResponseDto;
import com.Library.LibraryManagmentSystem.model.User;
import com.Library.LibraryManagmentSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponseDto createUser(UserRequestDto userRequestDto) {
//        User user = new User(userRequestDto.getEmail(),userRequestDto.getPhoneNumber());
//        user =userRepository.save(user);
//        User
        User user = new User(userRequestDto.getEmail(),userRequestDto.getPhoneNumber(),userRequestDto.getName());
        user.setUserType(UserType.STUDENT);
        user =userRepository.save(user);
        /*
        model mapper things
        object mapper (conversion dto to entiutty entity to dto)
         */

        UserResponseDto userResponseDto = new UserResponseDto(user.getEmail(),user.getPhoneNumber(),user.getBooks(),user.getName(),user.getTxns());
        return userResponseDto;

    }
}
