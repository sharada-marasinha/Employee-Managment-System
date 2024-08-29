package org.emp.service.impl;

import lombok.RequiredArgsConstructor;
import org.emp.dto.Role;
import org.emp.entity.RoleEntity;
import org.emp.repository.RoleRepository;
import org.emp.service.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    final RoleRepository repository;
    final ModelMapper mapper;

    @Override
    public void addRole(Role role) {
        repository.save(mapper.map(role, RoleEntity.class));
    }

    @Override
    public List<Role> getAll() {
       List<Role> roleList= new ArrayList<>();
        repository.findAll().forEach(obj->{
            roleList.add(mapper.map(obj, Role.class));
        });
        return roleList;
    }
}
