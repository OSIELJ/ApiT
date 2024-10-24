package com.osiel.ApiT.service;

import com.osiel.ApiT.dto.TennisDto;
import com.osiel.ApiT.model.Tennis;
import com.osiel.ApiT.repository.TennisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class TennisService implements CommandLineRunner {

    @Autowired
    private  TennisRepository tennisRepository;


    @Override
    public void run(String... args) throws Exception {
        List<Tennis> tenisList = Arrays.asList(
                // Nike
                new Tennis(1L, "Air Max", "Confortável e estiloso", "Nike", "https://imgnike-a.akamaihd.net/branding/cdp-airmax-2024/assets/img/carrossel-historia/airmax-1.png", "branca"),
                new Tennis(2L, "Air Zoom Pegasus", "Para corridas longas", "Nike", "https://imgcentauro-a.akamaihd.net/768x768/M0P70302A2.jpg", "preta"),
                new Tennis(3L, "React Infinity", "Estabilidade e conforto", "Nike", "https://imgcentauro-a.akamaihd.net/768x768/98352966.jpg", "vermelho"),
                new Tennis(4L, "Air Force 1", "Ícone de estilo", "Nike", "https://imgnike-a.akamaihd.net/1920x1920/02580551A10.jpg", "branca"),
                new Tennis(5L, "Cortez", "Design retrô", "Nike", "https://imgnike-a.akamaihd.net/1920x1920/028379NXA1.jpg", "verde"),
                new Tennis(6L, "Blazer", "Estilo clássico", "Nike", "https://imgnike-a.akamaihd.net/1920x1920/001975IFA8.jpg", "preta"),
                new Tennis(7L, "Joyride", "Amortecimento inovador", "Nike", "https://imgnike-a.akamaihd.net/768x768/015993NEA9.jpg", "roxa"),
                new Tennis(8L, "Metcon", "Para treinos intensos", "Nike", "https://imgnike-a.akamaihd.net/1920x1920/0270067TA10.jpg", "cinza"),
                new Tennis(9L, "ZoomX Vaporfly", "Alta performance", "Nike", "https://imgnike-a.akamaihd.net/768x768/01016853A2.jpg", "branca"),
                new Tennis(10L, "SB Dunk", "Skateboarding", "Nike", "https://imgnike-a.akamaihd.net/1920x1920/02632115A2.jpg", "azul"),

                // Adidas
                new Tennis(11L, "UltraBoost", "Ideal para corrida", "Adidas", "https://assets.adidas.com/images/h_2000,f_auto,q_auto,fl_lossy,c_fill,g_auto/056473dbebec4b70b0271bb60fce8133_9366/Tenis_Ultraboost_5_Preto_ID8847_HM3_hover.jpg", "preta"),
                new Tennis(12L, "NMD", "Estilo urbano", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/9356564dbc9549299132ae200019ef9b_9366/Tenis_NMD_R1_Branco_GW5699_01_standard.jpg", "branca"),
                new Tennis(13L, "Stan Smith", "Design minimalista", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/fb14b3f02f5946dea346a89a00e52cbb_9366/Tenis_Stan_Smith_Branco_CI9170_01_standard.jpg", "branca"),
                new Tennis(14L, "Superstar", "Clássico dos anos 70", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/af405adab99747708f01aad8011626ff_9366/Tenis_Superstar_Preto_EG4957_01_standard.jpg", "preta"),
                new Tennis(15L, "ZX 2K Boost", "Amortecimento moderno", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/f071cd7463af4bc8b5efad2500c3f3eb_9366/Tenis_ZX_2K_Boost_Verde_GZ7457_01_standard.jpg", "verde"),
                new Tennis(16L, "Adizero", "Performance de corrida", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/96fa7303d14249b7af33af9c00a79c5c_9366/Tenis_ADIZERO_SL_Vermelho_GX9775_01_standard.jpg", "vermelha"),
                new Tennis(17L, "Terrex", "Aventura ao ar livre", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/5d54b46d7ff34cba989049e3da753ec9_9366/Tenis_Terrex_Soulstride_Trail_Running_Azul_IH6023_HM1.jpg", "azul"),
                new Tennis(18L, "Ozweego", "Visual retrô", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/ed9fc6eba3c94932827ee7fb4f1fabb8_9366/Tenis_OZWEEGO_Rosa_IG5933_01_standard.jpg", "rosa"),
                new Tennis(19L, "Falcon", "Inspirado nos anos 90", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/ca6978f2d91f4f72b906d0486cdbce0e_9366/Tenis_Falcon_Cinza_IG8302_01_00_standard.jpg", "cinza"),
                new Tennis(20L, "4D Run", "Tecnologia de impressão 3D", "Adidas", "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/e9c681892d1c4fe39d4eab2601085009_9366/Tenis_4D_Run_1.0_Branco_FW1233_01_standard.jpg", "colorido"),

                // Asics
                new Tennis(21L, "Gel-Kayano", "Suporte para os pés", "Asics", "https://www.asics.com.br/arquivos/ids/517379-1000-1000/null.jpg", "azul"),
                new Tennis(22L, "Gel-Nimbus", "Amortecimento macio", "Asics", "https://www.asics.com.br/arquivos/ids/511749-1000-1000/null.jpg", "rosa"),
                new Tennis(23L, "Gel-Cumulus", "Conforto para longas distâncias", "Asics", "https://www.asics.com.br/arquivos/ids/539473-1000-1000/null.jpg", "azul"),
                new Tennis(24L, "Gel-Quantum", "Amortecimento responsivo", "Asics", "https://www.asics.com.br/arquivos/ids/417012-1000-1000/1201A764_021_SR_RT_GLB.jpg", "cinza"),
                new Tennis(25L, "Gel-Venture", "Corrida em trilha", "Asics", "https://www.asics.com.br/arquivos/ids/445396-1000-1000/null.jpg", "cinza"),
                new Tennis(26L, "Metarise 2", "Alta performance", "Asics", "https://images.asics.com/is/image/asics/1051A078_750_SR_RT_GLB?$zoom$", "amarelo"),
                new Tennis(27L, "Dynablast 3", "Leveza e velocidade", "Asics", "https://www.asics.com.br/arquivos/ids/417529-1000-1000/1012B289_404_SR_RT_GLB.jpg", "azul marinho"),
                new Tennis(28L, "Japan S", "Estiloso e elegante", "Asics", "https://www.asics.com.br/arquivos/ids/409626-1000-1000/Tenis-ASICS-Japan-S---Masculino---Preto.jpg", "preto"),
                new Tennis(29L, "Noosa tri 15", "Visual vibrante", "Asics", "https://www.asics.com.br/arquivos/ids/416734-1000-1000/1011B609_400_SR_RT_GLB.jpg", "colorida"),
                new Tennis(30L, "Hyper Speed 3", "Para corridas rápidas", "Asics", "https://www.asics.com.br/arquivos/ids/421210-1000-1000/null.jpg", "vermelho")
        );
        tennisRepository.saveAll(tenisList);
    }





    private final Random random = new Random();

    public TennisDto getTennisRandom() {
        List<Tennis> allTennis = tennisRepository.findAll();
        if (!allTennis.isEmpty()) {
            int index = random.nextInt(allTennis.size());
            Tennis randomTennis = allTennis.get(index);
            return new TennisDto(randomTennis.getId(), randomTennis.getName(), randomTennis.getBrand(), randomTennis.getImageUrl());
        }
        return null;
    }

    public List<TennisDto> getTennisForMark(String marca) {
        List<Tennis> tennisList = tennisRepository.findByBrand(marca);
        return tennisList.stream()
                .map(tennis -> new TennisDto(tennis.getId(), tennis.getName(), tennis.getBrand(), tennis.getImageUrl()))
                .collect(Collectors.toList());
    }


    public TennisDto getTennisForName(String nome) {
        Optional<Tennis> tennis = tennisRepository.findByName(nome);
        return tennis.map(t -> new TennisDto(t.getId(), t.getName(), t.getBrand(), t.getImageUrl())).orElse(null);
    }

    public List<TennisDto> getAllTennis() {
        List<Tennis> tennisList = tennisRepository.findAll();
        return tennisList.stream()
                .map(tennis -> new TennisDto(tennis.getId(), tennis.getName(), tennis.getBrand(), tennis.getImageUrl()))
                .collect(Collectors.toList());
    }

    public List<TennisDto> getTennisForColor(String color) {
        List<Tennis> tennisList = tennisRepository.findByColor(color);
        return tennisList.stream()
                .map(tennis -> new TennisDto(tennis.getId(), tennis.getName(), tennis.getBrand(), tennis.getImageUrl()))
                .collect(Collectors.toList());

    }



}
