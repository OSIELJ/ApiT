package com.osiel.ApiT.controller;

import com.osiel.ApiT.model.Tenis;
import com.osiel.ApiT.service.TenisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tenis")
public class TenisController {

    @Autowired
    private TenisService tenisService;

    @GetMapping("/aleatorio")
    public Tenis getTenisAleatorio(){
        return tenisService.getTenisAleatorio();
    }

    @GetMapping("/marca/{marca}")
    public List<Tenis> getTenisPorMarca(@PathVariable String marca){
        return tenisService.getTenisPorMarca(marca);
    }

    @GetMapping ("/nome/{nome}")
    public Tenis getTenisNome(@PathVariable String nome) {
        return tenisService.getTenisPorNome(nome);

    }
}
