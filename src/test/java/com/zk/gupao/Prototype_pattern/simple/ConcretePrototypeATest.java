package com.zk.gupao.Prototype_pattern.simple;

import java.util.ArrayList;
import java.util.List;

public class ConcretePrototypeATest {
    public static void  main(String[] args) {
        ConcretePrototypeA concretePrototypeA=new ConcretePrototypeA();
        concretePrototypeA.setAge(18);
        List<String> list =new ArrayList<String>();
        list.add("sd");
        concretePrototypeA.setHobbies(list);
        concretePrototypeA.setName("zk");

        Client client=new Client();
        ConcretePrototypeA p=(ConcretePrototypeA)client.startClone(concretePrototypeA);
        System.out.println("克隆完成之后的对象值："+p.getHobbies());
        System.out.println("原对象的值："+concretePrototypeA.getHobbies());
        System.out.println(p.getHobbies()==concretePrototypeA.getHobbies());
        //返回为true，此时就把原对象引用对象的地址也克隆了，这是与我们的需求相违背的，浅克隆，只做了引用类型地址的克隆，存在一定的隐患？
    }
}