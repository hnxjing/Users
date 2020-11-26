package edu.nf.users.entity;

import lombok.Data;

/**
 * @author 戏精
 * @Date: 2020/11/25/16:19
 */
@Data
public class Users {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String email;
    private String address;

    public Users(){

    }

    public Users(Integer id, String name, Integer age, String sex, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.address = address;
    }
}
