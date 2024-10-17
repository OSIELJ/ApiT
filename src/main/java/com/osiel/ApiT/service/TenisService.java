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
            new Tenis(1L, "Air Max", "Confortável e estiloso", "Nike", "https://imgnike-a.akamaihd.net/branding/cdp-airmax-2024/assets/img/carrossel-historia/airmax-1.png", "branca"),
            new Tenis(2L, "Air Zoom Pegasus", "Para corridas longas", "Nike", "https://imgcentauro-a.akamaihd.net/768x768/M0P70302A2.jpg", "preta"),
            new Tenis(3L, "React Infinity", "Estabilidade e conforto", "Nike", "https://imgcentauro-a.akamaihd.net/768x768/98352966.jpg", "vermelho"),
            new Tenis(4L, "Air Force 1", "Ícone de estilo", "Nike", "https://imgnike-a.akamaihd.net/1920x1920/02580551A10.jpg", "branca"),
            new Tenis(5L, "Cortez", "Design retrô", "Nike", "https://imgnike-a.akamaihd.net/1920x1920/028379NXA1.jpg", "verde"),
            new Tenis(6L, "Blazer", "Estilo clássico", "Nike", "https://imgnike-a.akamaihd.net/1920x1920/001975IFA8.jpg", "preta"),
            new Tenis(7L, "Joyride", "Amortecimento inovador", "Nike", "https://imgnike-a.akamaihd.net/768x768/015993NEA9.jpg", "roxa"),
            new Tenis(8L, "Metcon", "Para treinos intensos", "Nike", "https://imgnike-a.akamaihd.net/1920x1920/0270067TA10.jpg", "cinza"),
            new Tenis(9L, "ZoomX Vaporfly", "Alta performance", "Nike", "https://imgnike-a.akamaihd.net/768x768/01016853A2.jpg", "branca"),
            new Tenis(10L, "SB Dunk", "Skateboarding", "Nike", "https://imgnike-a.akamaihd.net/1920x1920/02632115A2.jpg", "azul"),

            // Adidas
            new Tenis(11L, "UltraBoost", "Ideal para corrida", "Adidas", "https://assets.adidas.com/images/h_2000,f_auto,q_auto,fl_lossy,c_fill,g_auto/056473dbebec4b70b0271bb60fce8133_9366/Tenis_Ultraboost_5_Preto_ID8847_HM3_hover.jpg", "preta"),
            new Tenis(12L, "NMD", "Estilo urbano", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/9356564dbc9549299132ae200019ef9b_9366/Tenis_NMD_R1_Branco_GW5699_01_standard.jpg", "branco"),
            new Tenis(13L, "Stan Smith", "Design minimalista", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/fb14b3f02f5946dea346a89a00e52cbb_9366/Tenis_Stan_Smith_Branco_CI9170_01_standard.jpg", "branca"),
            new Tenis(14L, "Superstar", "Clássico dos anos 70", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/af405adab99747708f01aad8011626ff_9366/Tenis_Superstar_Preto_EG4957_01_standard.jpg", "preta"),
            new Tenis(15L, "ZX 2K Boost", "Amortecimento moderno", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/f071cd7463af4bc8b5efad2500c3f3eb_9366/Tenis_ZX_2K_Boost_Verde_GZ7457_01_standard.jpg", "verde"),
            new Tenis(16L, "Adizero", "Performance de corrida", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/96fa7303d14249b7af33af9c00a79c5c_9366/Tenis_ADIZERO_SL_Vermelho_GX9775_01_standard.jpg", "vermelha"),
            new Tenis(17L, "Terrex", "Aventura ao ar livre", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/5d54b46d7ff34cba989049e3da753ec9_9366/Tenis_Terrex_Soulstride_Trail_Running_Azul_IH6023_HM1.jpg", "azul"),
            new Tenis(18L, "Ozweego", "Visual retrô", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/ed9fc6eba3c94932827ee7fb4f1fabb8_9366/Tenis_OZWEEGO_Rosa_IG5933_01_standard.jpg", "rosa"),
            new Tenis(19L, "Falcon", "Inspirado nos anos 90", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/ca6978f2d91f4f72b906d0486cdbce0e_9366/Tenis_Falcon_Cinza_IG8302_01_00_standard.jpg", "cinza"),
            new Tenis(20L, "4D Run", "Tecnologia de impressão 3D", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/e9c681892d1c4fe39d4eab2601085009_9366/Tenis_4D_Run_1.0_Branco_FW1233_01_standard.jpg", "colorido"),

            // Asics
            new Tenis(21L, "Gel-Kayano", "Suporte para os pés", "Asics", "https://www.asics.com.br/arquivos/ids/517379-1000-1000/null.jpg", "azul"),
            new Tenis(22L, "Gel-Nimbus", "Amortecimento macio", "Asics", "https://www.asics.com.br/arquivos/ids/511749-1000-1000/null.jpg", "rosa"),
            new Tenis(23L, "Gel-Cumulus", "Conforto para longas distâncias", "Asics", "https://www.asics.com.br/arquivos/ids/539473-1000-1000/null.jpg", "azul"),
            new Tenis(24L, "Gel-Quantum", "Amortecimento responsivo", "Asics", "https://www.asics.com.br/arquivos/ids/417012-1000-1000/1201A764_021_SR_RT_GLB.jpg", "cinza"),
            new Tenis(25L, "Gel-Venture", "Corrida em trilha", "Asics", "https://www.asics.com.br/arquivos/ids/445396-1000-1000/null.jpg", "cinza"),
            new Tenis(26L, "Metarise 2", "Alta performance", "Asics", "https://images.asics.com/is/image/asics/1051A078_750_SR_RT_GLB?$zoom$", "amarelo"),
            new Tenis(27L, "Dynablast 3", "Leveza e velocidade", "Asics", "https://www.asics.com.br/arquivos/ids/417529-1000-1000/1012B289_404_SR_RT_GLB.jpg", "azul marinho"),
            new Tenis(28L, "Japan S", "Estiloso e elegante", "Asics", "https://www.asics.com.br/arquivos/ids/409626-1000-1000/Tenis-ASICS-Japan-S---Masculino---Preto.jpg", "preto"),
            new Tenis(29L, "Noosa tri 15", "Visual vibrante", "Asics", "https://www.asics.com.br/arquivos/ids/416734-1000-1000/1011B609_400_SR_RT_GLB.jpg", "colorida"),
            new Tenis(30L, "Hyper Speed 3", "Para corridas rápidas", "Asics", "https://www.asics.com.br/arquivos/ids/421210-1000-1000/null.jpg", "vermelho")

            /*
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

             */
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

    public List<Tenis> getAllTenis(){
        return tenisList;
    }
}
