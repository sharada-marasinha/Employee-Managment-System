package org.emp.controller;

import lombok.RequiredArgsConstructor;
import org.emp.dto.Role;
import org.emp.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {

    final RoleService service;
    @PostMapping("/add-role")
    public void addRole(@RequestBody Role role){
        service.addRole(role);
    }
    @GetMapping("/get-all")
    public List<Role> getRole(){
        return service.getAll();
    }

    @DeleteMapping("/delete-by-id/{id}")
    public boolean deleteRoleById(@PathVariable Long id){
        return service.deleteRoleById(id);
    }
}
