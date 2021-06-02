package com.findambrose.springtestapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    ResponseRepository responseRepository;


    @PostMapping()
    public MyResponse save(@RequestBody MyResponse r){
       return  responseRepository.save(r);
    }

    @GetMapping()
    public List<MyResponse> index(){

        List<MyResponse> myResponses = new ArrayList();

        responseRepository.findAll().forEach(u->myResponses.add(u));
        return  myResponses;
    }
}
