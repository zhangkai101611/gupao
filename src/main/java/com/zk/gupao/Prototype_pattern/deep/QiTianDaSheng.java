package com.zk.gupao.Prototype_pattern.deep;


import java.io.*;
import java.util.Date;

/**
 * Created by Tom.
 */
//深克隆与单例相反的逻辑
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {

    public JinGuBang jinGuBang;

    public  QiTianDaSheng(){
        //只是初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }


    public Object deepClone(){
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            copy.birthday = new Date();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }


    public QiTianDaSheng shallowClone(QiTianDaSheng target){

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.height;

        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = new Date();
        return  qiTianDaSheng;
    }

    public static void main(String[] args) {
        String gitUrl="asda/hhhh/git.git";
        int k=gitUrl.lastIndexOf("/");
        int l=gitUrl.indexOf(".");
        String str=gitUrl.substring(k+1,l);
        System.out.println(str);
    }


}
