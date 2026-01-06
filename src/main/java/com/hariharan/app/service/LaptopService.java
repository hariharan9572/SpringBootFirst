package com.hariharan.app.service;

import com.hariharan.app.repo.LaptopRepository;
import com.hariharan.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
     private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public  boolean isGoodForProg(Laptop lap){
        return true;
    }
}
