package kr.ac.kopo.wnddjgld.springboot_jdbctest.domain;

import lombok.Data;

@Data
public class Person {
    private int id;
    private String name;
    private int age;
    private String email;
}
