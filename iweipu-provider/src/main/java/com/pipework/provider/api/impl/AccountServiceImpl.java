package com.pipework.provider.api.impl;

import com.pipework.api.account.IAccountService;

/**
 * User: lixiang
 * Date: 2014/7/8
 * Time: 16:52
 */
public class AccountServiceImpl implements IAccountService {
    @Override
    public String sayHello(String name) {
        return name+=" say  hello";
    }
}
