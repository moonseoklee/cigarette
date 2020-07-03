package com.example.cigarettesmakeshower.Service.Impl;

import com.example.cigarettesmakeshower.Dao.SomeDao;
import com.example.cigarettesmakeshower.Model.SomeModel;
import com.example.cigarettesmakeshower.Service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SomeServiceImpl implements SomeService {

    @Autowired
    private SomeDao dao;

    @Override
    public SomeModel getSome(){
        SomeModel some = dao.getSome();

        return some;
    }

    @Override
    public void insertSome(String title,Integer price){
        System.out.println(title+price);
        dao.insertSome(title,price);
    }

}
