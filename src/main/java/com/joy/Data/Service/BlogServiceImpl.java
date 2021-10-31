package com.joy.Data.Service;

import com.joy.Data.DataStore.AdminRepo;
import com.joy.Data.Model.Admin;
import com.joy.Data.Model.Post;
import com.joy.Data.Model.ROLE;

public class BlogServiceImpl implements BlogService{
    private AdminRepo adminRepo;

    public BlogServiceImpl(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }

    @Override
    public void addPost(Admin admin, Post post) {
        if(admin!= null && admin.getRole()==ROLE.ADMIN){
        }

    }

    @Override
    public void createAdmin(String username, String password) {
        Admin admin = new Admin(username, password);
          this.adminRepo.addAdmin(username,admin);
        }
    }
