package com.osiel.ApiT.service;

import com.osiel.ApiT.model.Tenis;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class TenisService {

    private final List<Tenis> tenisList = Arrays.asList(
            // Nike
            new Tenis(1L, "Air Max", "Confortável e estiloso", "Nike", "https://exemplo.com/airmax.jpg", "branca"),
            new Tenis(2L, "Air Zoom Pegasus", "Para corridas longas", "Nike", "https://exemplo.com/pegasus.jpg", "preta"),
            new Tenis(3L, "React Infinity", "Estabilidade e conforto", "Nike", "https://exemplo.com/infinity.jpg", "azul"),
            new Tenis(4L, "Air Force 1", "Ícone de estilo", "Nike", "https://exemplo.com/airforce.jpg", "branca"),
            new Tenis(5L, "Cortez", "Design retrô", "Nike", "https://exemplo.com/cortez.jpg", "vermelha"),
            new Tenis(6L, "Blazer", "Estilo clássico", "Nike", "https://exemplo.com/blazer.jpg", "preta"),
            new Tenis(7L, "Joyride", "Amortecimento inovador", "Nike", "https://exemplo.com/joyride.jpg", "roxa"),
            new Tenis(8L, "Metcon", "Para treinos intensos", "Nike", "https://exemplo.com/metcon.jpg", "cinza"),
            new Tenis(9L, "ZoomX Vaporfly", "Alta performance", "Nike", "https://exemplo.com/vaporfly.jpg", "branca"),
            new Tenis(10L, "SB Dunk", "Skateboarding", "Nike", "https://exemplo.com/sbdunk.jpg", "colorida"),

            // Adidas
            new Tenis(11L, "UltraBoost", "Ideal para corrida", "Adidas", "https://exemplo.com/ultraboost.jpg", "preta"),
            new Tenis(12L, "NMD", "Estilo urbano", "Adidas", "https://exemplo.com/nmd.jpg", "azul"),
            new Tenis(13L, "Stan Smith", "Design minimalista", "Adidas", "https://exemplo.com/stansmith.jpg", "branca"),
            new Tenis(14L, "Superstar", "Clássico dos anos 70", "Adidas", "https://exemplo.com/superstar.jpg", "preta"),
            new Tenis(15L, "ZX 2K Boost", "Amortecimento moderno", "Adidas", "https://exemplo.com/zx2k.jpg", "verde"),
            new Tenis(16L, "Adizero", "Performance de corrida", "Adidas", "https://exemplo.com/adizero.jpg", "vermelha"),
            new Tenis(17L, "Terrex", "Aventura ao ar livre", "Adidas", "https://exemplo.com/terrex.jpg", "azul"),
            new Tenis(18L, "Ozweego", "Visual retrô", "Adidas", "https://exemplo.com/ozweego.jpg", "rosa"),
            new Tenis(19L, "Falcon", "Inspirado nos anos 90", "Adidas", "https://exemplo.com/falcon.jpg", "cinza"),
            new Tenis(20L, "4D Run", "Tecnologia de impressão 3D", "Adidas", "https://exemplo.com/4drun.jpg", "branca"),

            // Asics
            new Tenis(21L, "Gel-Kayano", "Suporte para os pés", "Asics", "https://exemplo.com/gelkayano.jpg", "preta"),
            new Tenis(22L, "Gel-Nimbus", "Amortecimento macio", "Asics", "https://exemplo.com/gelnimbus.jpg", "branca"),
            new Tenis(23L, "Gel-Cumulus", "Conforto para longas distâncias", "Asics", "https://exemplo.com/gelcumulus.jpg", "azul"),
            new Tenis(24L, "Gel-Quantum", "Amortecimento responsivo", "Asics", "https://exemplo.com/gelquantum.jpg", "verde"),
            new Tenis(25L, "Gel-Venture", "Corrida em trilha", "Asics", "https://exemplo.com/gelventure.jpg", "preta"),
            new Tenis(26L, "Metarun", "Alta performance", "Asics", "https://exemplo.com/metarun.jpg", "vermelha"),
            new Tenis(27L, "Dynaflyte", "Leveza e velocidade", "Asics", "https://exemplo.com/dynaflyte.jpg", "branca"),
            new Tenis(28L, "Tartheredge", "Rápido e ágil", "Asics", "https://exemplo.com/tartheredge.jpg", "azul"),
            new Tenis(29L, "Noosa", "Visual vibrante", "Asics", "https://exemplo.com/noosa.jpg", "colorida"),
            new Tenis(30L, "Hyper Speed", "Para corridas rápidas", "Asics", "https://exemplo.com/hyperspeed.jpg", "preta"),

            // Reebok
            new Tenis(31L, "Classic Leather", "Design clássico", "Reebok", "https://exemplo.com/classic.jpg", "branca"),
            new Tenis(32L, "Club C", "Minimalismo e conforto", "Reebok", "https://exemplo.com/clubc.jpg", "preta"),
            new Tenis(33L, "Nano X", "Para crossfit e treinos", "Reebok", "https://exemplo.com/nanox.jpg", "azul"),
            new Tenis(34L, "Zig Kinetica", "Design futurista", "Reebok", "https://exemplo.com/zigkinetica.jpg", "vermelha"),
            new Tenis(35L, "Floatride", "Para longas distâncias", "Reebok", "https://exemplo.com/floatride.jpg", "preta"),
            new Tenis(36L, "Instapump Fury", "Tecnologia pump", "Reebok", "https://exemplo.com/instapump.jpg", "colorida"),
            new Tenis(37L, "Sole Fury", "Visual moderno", "Reebok", "https://exemplo.com/solefury.jpg", "branca"),
            new Tenis(38L, "Legacy Lifter", "Para levantamento de peso", "Reebok", "https://exemplo.com/legacylifter.jpg", "preta"),
            new Tenis(39L, "Reebok Royal", "Estilo casual", "Reebok", "https://exemplo.com/royal.jpg", "azul"),
            new Tenis(40L, "Reebok Flexagon", "Para treinos de alta intensidade", "Reebok", "https://exemplo.com/flexagon.jpg", "vermelha"),

            // Puma
            new Tenis(41L, "RS-X", "Design ousado", "Puma", "https://exemplo.com/rsx.jpg", "colorida"),
            new Tenis(42L, "Suede Classic", "Clássico de todos os tempos", "Puma", "https://exemplo.com/suedeclassic.jpg", "preta"),
            new Tenis(43L, "Future Rider", "Visual retrô", "Puma", "https://exemplo.com/futurerider.jpg", "branca"),
            new Tenis(44L, "Cali", "Estilo casual", "Puma", "https://exemplo.com/cali.jpg", "azul"),
            new Tenis(45L, "Ignite", "Amortecimento energizado", "Puma", "https://exemplo.com/ignite.jpg", "vermelha"),
            new Tenis(46L, "Hybrid", "Tecnologia híbrida de amortecimento", "Puma", "https://exemplo.com/hybrid.jpg", "preta"),
            new Tenis(47L, "LQDCell", "Estabilidade e conforto", "Puma", "https://exemplo.com/lqdcell.jpg", "cinza"),
            new Tenis(48L, "Carson", "Design leve", "Puma", "https://exemplo.com/carson.jpg", "verde"),
            new Tenis(49L, "Defy", "Estilo arrojado", "Puma", "https://exemplo.com/defy.jpg", "colorida"),
            new Tenis(50L, "Thunder Spectra", "Visual robusto", "Puma", "https://exemplo.com/thunder.jpg", "azul")
    );


    private final Random random = new Random();

    public Tenis getTenisAleatorio(){
        int index = random.nextInt(tenisList.size());
        return tenisList.get(index);
    }

    public List<Tenis> getTenisPorMarca(String marca){
        return tenisList.stream()
                .filter(tenis -> tenis.getMarca().equalsIgnoreCase(marca))
                .collect(Collectors.toList());


    }
    public Tenis getTenisPorNome(String nome){
        return tenisList.stream() // stream permite que você processe sequências de elementos de forma declativa
        .filter(tenis -> tenis.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null); // para caso não encontrar

}
}
