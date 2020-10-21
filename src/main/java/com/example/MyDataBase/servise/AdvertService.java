package com.example.MyDataBase.servise;

import com.example.MyDataBase.entity.Advert;
import com.example.MyDataBase.entity.MyUser;
import com.example.MyDataBase.repository.AdvertRepository;
import com.example.MyDataBase.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertService {

    @Autowired
    MyUserRepository myUserRepository;
    @Autowired
    AdvertRepository advertRepository;

    public MyUser getUserById(Long id) {
        return myUserRepository.findById(id).orElse(null);
    }

    public List<Advert> getAdvertList() {
        List<Advert> advertList = advertRepository.findAll();
        return advertList;
    }
}
