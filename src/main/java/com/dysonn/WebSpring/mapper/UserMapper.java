package com.dysonn.WebSpring.mapper;

import com.dysonn.WebSpring.dto.request.UserCreationRequest;

import com.dysonn.WebSpring.dto.request.UserUpdateRequest;
import com.dysonn.WebSpring.dto.response.UserResponse;
import com.dysonn.WebSpring.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface UserMapper{
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user , UserUpdateRequest request);
}
