package com.dysonn.WebSpring.service;

import com.dysonn.WebSpring.dto.request.PermissionRequest;
import com.dysonn.WebSpring.dto.request.RoleRequest;
import com.dysonn.WebSpring.dto.response.PermissionResponse;
import com.dysonn.WebSpring.dto.response.RoleResponse;
import com.dysonn.WebSpring.entity.Permission;
import com.dysonn.WebSpring.entity.Role;
import com.dysonn.WebSpring.mapper.PermissionMapper;
import com.dysonn.WebSpring.mapper.RoleMapper;
import com.dysonn.WebSpring.respository.PermissionRepository;
import com.dysonn.WebSpring.respository.RoleRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RoleService {
    RoleRepository roleRepository;
    PermissionRepository permissionRepository;
    RoleMapper roleMapper;

    public RoleResponse createRole(RoleRequest request) {
        var role = roleMapper.toRole(request);
        var permissions = permissionRepository.findAllById(request.getPermissions());
        role.setPermissions(new HashSet<>(permissions));
        role = roleRepository.save(role);
        return roleMapper.toRoleResponse(role);
    }

    public List<RoleResponse> getAllRoles() {
        return roleRepository.findAll().stream().map(roleMapper::toRoleResponse).toList();
    }

    public void deleteRole(String roleId) {
        roleRepository.deleteById(roleId);
    }

}
