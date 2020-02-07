package com.joole.fans.service;

import com.joole.fans.model.Fans;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FansService {


    void emptyFans();

    List<Fans> getAllFans();

}
