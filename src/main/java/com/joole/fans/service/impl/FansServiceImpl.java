package com.joole.fans.service.impl;

import com.joole.fans.model.Fans;
import com.joole.fans.repository.FansRepository;
import com.joole.fans.service.FansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FansServiceImpl implements FansService {

    @Autowired
    private FansRepository fansRepository;

    public void emptyFans(){
        fansRepository.deleteAll();
    }

    public List<Fans> getAllFans() {
        return (List<Fans>) fansRepository.findAll();
    }



}
