/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehiresolution;

import Data.AppDbContext;
import Entities.User;
import Enums.UserType;
import Repositories.UserRepository;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dhiaeddsn
 */
public class EHireSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        UserRepository userRepo = UserRepository.GetInstance(); 
        
        /*
         *  To Test Post User
        userRepo.Post(new User("dhiaeddsn1", "123456789", "dhia1@email.com",UserType.RH , "imguri", new Date(1999,7,29), "CTO")); 
         */
        
        /*
         *  To Test Post Get All Users
        //userRepo.GetAll().forEach(u -> System.out.println(u.toString()));
        */
        
        /*
         *  To Test Get User By Id
        //System.out.println(userRepo.GetById(1).toString()); 
         */

       
        
        /*
         * To Test Put User
        User user = userRepo.GetById(1); 
        System.out.println("user before update"); 
        System.out.println(user.toString()); 
        System.out.println("user after update"); 
        user.setPassword("1234");
        userRepo.Put(user); 
        System.out.println(userRepo.GetById(1).toString()); 
         */
        
        /*
         * To Test Delete User
        System.out.println("List Before Deleting one item size is " + userRepo.GetAll().size());
        userRepo.Delete(1); 
        System.out.println("List after Deleting one item size is " + userRepo.GetAll().size());
        */
        
            
        userRepo.GetAll().forEach(u -> System.out.println(u.toString()));
    }
    
}
