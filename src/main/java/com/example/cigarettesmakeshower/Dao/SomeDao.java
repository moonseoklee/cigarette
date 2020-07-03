package com.example.cigarettesmakeshower.Dao;

import com.example.cigarettesmakeshower.Model.SomeModel;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SomeDao{
    SomeModel getSome();

    void insertSome(String title,Integer price);
}
