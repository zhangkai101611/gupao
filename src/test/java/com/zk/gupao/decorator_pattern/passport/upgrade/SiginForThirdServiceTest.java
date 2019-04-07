package com.zk.gupao.decorator_pattern.passport.upgrade;

import com.zk.gupao.decorator_pattern.passport.old.SigninService;

public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SigninService());
        siginForThirdService.loginForQQ("as");
    }
}