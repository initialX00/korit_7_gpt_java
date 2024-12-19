package com.korit.main;

import com.korit.controller.UserController;
import com.korit.service.UserServiceImpl;
import com.korit.service.UserServiceImpl2;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl(); //서비스와 컨트롤러 내부에서 객체를 생성하지 않고 외부에서 만듦으로써,
        UserServiceImpl2 userService2 = new UserServiceImpl2(); //서비스와 컨트롤러의 의존성 감소.
        UserController userController = new UserController(userService); //
        userController.signUp();
        userController.signIn();
        userController.setUserService(userService);
    }
}
