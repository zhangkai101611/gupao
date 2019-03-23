package com.zk.gupao.proxy_pattern.staticProxy;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-03-23 15:14
 **/
//缺点：对于要代理的对象，若对象增加/更新的方法，其代理的对象也需要对应的更新，违背了开闭原则
public class Father {
    private Son son;
    Father(Son son){
        this.son=son;
    }
    public void findLove(){
        System.out.println("父亲物色对象");
        this.son.findLove();
        System.out.println("双方父母同意，确立关系");
    }

}
