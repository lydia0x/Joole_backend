package com.joole.fans.controller;


import com.joole.fans.model.Fans;
import com.joole.fans.service.impl.FansServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "*", allowedHeaders = "*")
@CrossOrigin()
@RestController
public class FansController {
    @Autowired
    private FansServiceImpl service;


    @RequestMapping(value = "/getAllFans", method = RequestMethod.GET)
    public ResponseEntity<?> getAllFans() {
        List<Fans> resources = service.getAllFans();
        return new ResponseEntity<>(resources, HttpStatus.OK);
    }


    @RequestMapping(value = "/deleteAllFans", method = RequestMethod.GET)
    public ResponseEntity<?> deleteAllFans(){
        service.emptyFans();
        List<Fans> resources = service.getAllFans();
        return new ResponseEntity<>(resources, HttpStatus.OK);
    }



}

