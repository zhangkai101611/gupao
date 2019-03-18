package com.zk.gupao.Prototype_pattern.simple;

import lombok.Data;

import java.util.List;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-03-18 21:50
 **/
@Data
public class ConcretePrototypeA implements Prototype {
    private int age;
    private String name;
    private List hobbies;
    public Prototype clone() {
        ConcretePrototypeA concretePrototypeA=new ConcretePrototypeA();
        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setHobbies(this.hobbies);
        concretePrototypeA.setName(this.name);
        return concretePrototypeA;
    }
}
