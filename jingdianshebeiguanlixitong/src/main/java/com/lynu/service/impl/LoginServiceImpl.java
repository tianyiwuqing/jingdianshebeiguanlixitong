package com.lynu.service.impl;

import com.lynu.dao.TableEmployeeMapper;
import com.lynu.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 28449
 * @since 2019-01-28 17:19
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private TableEmployeeMapper tableEmployeeMapper;

    @Override
    public boolean login(String user, String password) {
        return false;
    }
}
