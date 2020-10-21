package com.example.MyDataBase.controller;

import com.example.MyDataBase.entity.Advert;
import com.example.MyDataBase.entity.MyUser;
import com.example.MyDataBase.servise.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdvertController {

    @Autowired
    AdvertService advertService;

    @GetMapping("/user")
    @ResponseBody
    public MyUser user(@RequestParam Long id) {
        return advertService.getUserById(id);
    }

    @GetMapping("/")
    public String advertList(Model model) {
        List<Advert> advertList = advertService.getAdvertList();
        model.addAttribute("advertList", advertList);
        return "advert-list";
    }


}
