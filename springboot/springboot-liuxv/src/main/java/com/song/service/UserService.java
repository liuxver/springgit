package com.song.service;

import com.song.entity.User;
import com.song.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 444 on 2018/5/2.
 */

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserByName(String name){
        User user = null;
        try{
            user = userRepository.findByUserName(name);
        }catch (Exception e){}
        return user;
    }
}






/*@Service
public class UserService {
    @Autowired
    privite UserRepository userRepository;

    public User findUserByName(String name){
        User user=null;
        try{

            user=userRepository.findByUserName(name);
        }
        catch(Exception e){

        }
        return user;
    }

}
*/
