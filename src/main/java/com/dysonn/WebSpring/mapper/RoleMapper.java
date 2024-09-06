package com.dysonn.WebSpring.mapper;

import com.dysonn.WebSpring.dto.request.RoleRequest;
import com.dysonn.WebSpring.dto.response.RoleResponse;
import com.dysonn.WebSpring.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);
    RoleResponse toRoleResponse(Role role);
}
