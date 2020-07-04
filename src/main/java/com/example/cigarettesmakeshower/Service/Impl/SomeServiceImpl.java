package com.example.cigarettesmakeshower.Service.Impl;

import com.example.cigarettesmakeshower.Dao.SomeDao;
import com.example.cigarettesmakeshower.Model.SomeModel;
import com.example.cigarettesmakeshower.Service.SomeService;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SomeServiceImpl implements SomeService {


    @Autowired
    private SomeDao dao;

    @Override
    public List<SomeModel> getSome(){

        List<SomeModel> some = dao.getSome();


        return some;
    }

    @Override
    public void insertSome(String title,Integer price){
        SomeModel model = new SomeModel();
        model.setPrice(price);
        model.setTitle(title);


        dao.insertSome(model);
        System.out.println(model.getId());
    }

}
