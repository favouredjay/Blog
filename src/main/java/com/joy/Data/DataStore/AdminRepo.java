package com.joy.Data.DataStore;

import com.joy.Data.Model.Admin;

import java.util.HashMap;
import java.util.Map;

public class AdminRepo {
   private   Map<String, Admin> adminStore = new HashMap<>();

    public Map<String, Admin> getAdminStore(){
        return adminStore;
    }
    public void addAdmin(String username,Admin admin){
       adminStore.put(username,admin);
    }

    @Override
    public String toString() {
        return "AdminRepo{" +
                "admin=" + adminStore +
                '}';
    }
}






