package com.cmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by cmtHD on 2016/12/15.
 */
@Controller
public class UserController {

    @GetMapping("/user/detail/{id}")
    public String detail(@PathVariable String id){
        return "";
    }
}
