package com.dysonn.WebSpring.mapper;

import com.dysonn.WebSpring.dto.request.PermissionRequest;
import com.dysonn.WebSpring.dto.request.UserCreationRequest;
import com.dysonn.WebSpring.dto.request.UserUpdateRequest;
import com.dysonn.WebSpring.dto.response.PermissionResponse;
import com.dysonn.WebSpring.dto.response.UserResponse;
import com.dysonn.WebSpring.entity.Permission;
import com.dysonn.WebSpring.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
