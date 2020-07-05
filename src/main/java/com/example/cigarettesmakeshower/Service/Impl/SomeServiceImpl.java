package com.example.cigarettesmakeshower.Service.Impl;

import com.example.cigarettesmakeshower.Dao.SomeDao;
import com.example.cigarettesmakeshower.Model.SomeModel;
import com.example.cigarettesmakeshower.Service.SomeService;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
    public void uploadFile(String title,Integer price,MultipartFile file) throws IOException {
        SomeModel model = new SomeModel();
        model.setPrice(price);
        model.setTitle(title);
        model.setUrl("images/"+file.getOriginalFilename());
        file.transferTo(new File("C:\\Users\\winny\\Desktop\\MS\\coding\\cigarettesmakeshower\\src\\main\\resources\\static\\images\\"+file.getOriginalFilename()));
        dao.uploadFile(model);
        System.out.println(model.getId());
    }


}
