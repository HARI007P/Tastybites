package com.TasyBites.Tasty_Bites;
@Entity
public class User {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String password;
    // getters/setters
}
