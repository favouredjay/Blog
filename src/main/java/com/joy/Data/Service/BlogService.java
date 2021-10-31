package com.joy.Data.Service;

import com.joy.Data.DataStore.AdminRepo;
import com.joy.Data.Model.Admin;
import com.joy.Data.Model.Post;
import com.joy.Data.Model.ROLE;

public interface BlogService {

    public void addPost(Admin admin, Post post);
    public void createAdmin(String username, String password);


}
