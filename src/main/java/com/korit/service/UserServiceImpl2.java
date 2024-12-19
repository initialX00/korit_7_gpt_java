package com.korit.service;

import com.korit.entity.User;
import com.korit.repository.UserRepository;

public class UserServiceImpl2 implements UserService {
    //ctrl + I 임플리먼츠 자동작성
    //ctrl + O 오버라이드 자동작성
    @Override
    public void add(User user) {
        UserRepository userRepository = UserRepository.getInstance();
        userRepository.addUser(user);
        //UserRepository.getInstance().addUser(user);
    }

    @Override
    public void remove() {

    }

    @Override
    public void printInfo() {

    }
}
