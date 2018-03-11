package com.hwadee.demo.mapper;

import com.hwadee.demo.model.Account;

public interface AccountMapper {

    /**
     * 
     * @param aid
     * @return
     */
    Account findById(int aid);
}
