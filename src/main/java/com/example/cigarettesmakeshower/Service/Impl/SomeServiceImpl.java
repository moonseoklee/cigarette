package com.example.cigarettesmakeshower.Service.Impl;

import com.example.cigarettesmakeshower.Dao.SomeDao;
import com.example.cigarettesmakeshower.Model.SomeModel;
import com.example.cigarettesmakeshower.Service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService {


    private SomeDao dao;

    @Override
    public SomeModel printSomething() {
        SomeModel something = dao.getTitle();
        return something;
    }
}
