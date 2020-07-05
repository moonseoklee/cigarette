package com.example.cigarettesmakeshower.Dao;

import com.example.cigarettesmakeshower.Model.SomeModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface SomeDao{
    List<SomeModel> getSome();

    void uploadFile(SomeModel some);
}
