package com.korit.controller;

import com.korit.entity.User;
import com.korit.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class UserController {
    @Setter
    private UserService userService; //생성자를 통한 의존성주입.

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void signIn() {

    }

    public void signUp() { //매개변수로 서비스를 불러서 의존성 감소. 외부에서 따로 객체생성을 요구한다.
                                                //업캐스팅을 이용하여 UserServiceImpl보단 UserService를 사용하여 다형성을 활용한다.
        String username = "test";
        String password = "1234";
        String email = "test@gmail.com";

        User user = User.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();

        //객체생성으로 인해 컨트롤러가 서비스를 의존한다. 높은 결합도로 인해 부적절하다.
        //UserServiceImpl userService = new UserServiceImpl();
        userService.add(user);
    }
}
