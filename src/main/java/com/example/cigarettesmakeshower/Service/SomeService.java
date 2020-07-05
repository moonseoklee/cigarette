package com.example.cigarettesmakeshower.Service;


import com.example.cigarettesmakeshower.Model.SomeModel;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


public interface SomeService {

    List<SomeModel> getSome();

    void uploadFile(String title,Integer price,MultipartFile file) throws IOException;


}
