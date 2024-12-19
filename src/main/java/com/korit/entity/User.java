package com.korit.entity;

import lombok.*;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Builder
public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
}
