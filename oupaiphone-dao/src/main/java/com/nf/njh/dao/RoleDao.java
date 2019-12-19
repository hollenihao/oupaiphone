package com.nf.njh.dao;

import com.nf.njh.entity.Role;

import java.util.List;

public interface RoleDao {
    void deleteRole(String role);
    List<Role> getAllRole();
    boolean addRole(Role role);

}
