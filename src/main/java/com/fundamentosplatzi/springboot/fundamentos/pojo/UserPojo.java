package com.fundamentosplatzi.springboot.fundamentos.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@Setter
@ConfigurationProperties(prefix = "user")
@ConstructorBinding
public class UserPojo {
    private String email;
    private String password;
    private int age;

    public UserPojo(String email, String password, int age) {
        this.email = email;
        this.password = password;
        this.age = age;
    }

    @Override
     public String toString(){
        //System.out.println(getEmail() + "-" + getPassword());
         return getEmail() + "-" + getPassword();
     }

}
