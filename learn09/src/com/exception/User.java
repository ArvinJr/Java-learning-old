package com.exception;

/**
 * @author arvin
 * @date 2021/2/18
 */
public class User {

    public void login(String username,String password) {
        if (!"a".equals(username) || !"b".equals(password)){
            throw new UserNameOrPasswordNotFoundException();
        }
        if (4 > 3){
            throw new FreezeUserException("您的账户被冻结了");
        }
    }

}
