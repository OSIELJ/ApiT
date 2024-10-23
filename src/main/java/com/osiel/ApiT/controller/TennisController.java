package com.osiel.ApiT.controller;

import com.osiel.ApiT.dto.TennisDto;
import com.osiel.ApiT.service.TennisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tenis")
public class TennisController {

    @Autowired
    private TennisService tenisService;

    @GetMapping("/aleatorio")
    public TennisDto getTennisRandom(){
        return tenisService.getTennisRandom();
    }

    @GetMapping("/marca/{marca}")
    public List<TennisDto> getTennisForMark(@PathVariable String marca){
        return tenisService.getTennisForMark(marca);
    }

    @GetMapping ("/nome/{nome}")
    public TennisDto getTennisForName(@PathVariable String nome) {
        return tenisService.getTennisForName(nome);

    }

    @GetMapping("/todos")
    public List<TennisDto> getAllTennis(){
        return tenisService.getAllTennis();
    }

    @GetMapping("/cor/{cor}")
    public List<TennisDto> getTennisForColor(@PathVariable String cor){
        return tenisService.getTennisForColor(cor);
    }
}
