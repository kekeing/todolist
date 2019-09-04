package com.example.vuetodolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class Controller {
    @Autowired
    private Responsity responsity;

    @GetMapping(value = "")
    public List<Modle> getAllModle(){
        return responsity.findAll();
    }
    @PostMapping(value = "")
    public void saveModle(@RequestBody Modle modle){
        responsity.save(modle);
    }
}
