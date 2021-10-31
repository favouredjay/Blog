package com.joy.Data.Service;

import com.joy.Data.DataStore.AdminRepo;
import com.joy.Data.Model.Admin;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class blogServiceImplTest {
    AdminRepo adminRepo = new AdminRepo();
    @Test
    public void testThatAdminCanBeCreated(){
        String userName = "joy";
        String password = "1234";

        BlogServiceImpl blogService = new BlogServiceImpl(adminRepo);
        blogService.createAdmin(userName,password);
        System.out.println(adminRepo);

        assertEquals("joy",adminRepo.getAdminStore().get(userName).getUserName());

    }

}