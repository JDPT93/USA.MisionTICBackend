package com.jdpt93.atirodeas.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jdpt93.atirodeas.backend.documents.Product;
import com.jdpt93.atirodeas.backend.documents.Sequence;
import com.jdpt93.atirodeas.backend.repositories.ProductRepository;
import com.jdpt93.atirodeas.backend.repositories.SequenceRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SequenceRepository sequenceRepository;

    @Override
    public void run(String... args) {
        productRepository.deleteAll();
        productRepository.saveAll(List.of(
                new Product(
                        1,
                        "Discos duros",
                        "Disco sólido SSD interno Western Digital WD Green 1TB",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        420000f, 17f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_797186-MLA45260739967_032021-F.webp"),
                new Product(
                        2,
                        "Discos duros",
                        "Disco sólido SSD interno Kingston NV1 SNVS/500G 500GB",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        239900f, 12f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_601957-MLA47571415620_092021-F.webp"),
                new Product(
                        3,
                        "Refrigeración",
                        "Refrigeración Líquida Gamemax Icechill 120-rainbow",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        285000f, 4f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_829745-MCO33085645604_122019-F.webp"),
                new Product(
                        4,
                        "Alimentación",
                        "Fuente De Poder Corsair Cv650 650w 80 Plus Bronze",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        250000f, 9f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_811536-MCO43039539763_082020-F.webp"),
                new Product(
                        5,
                        "Memorias RAM",
                        "Memoria RAM XLR8 Gaming EPIC-X RGB color Negro 16GB",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        450000f, 19f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_967146-MLA45377300179_032021-F.webp"),
                new Product(
                        6,
                        "Memorias RAM",
                        "Memoria RAM Vengeance RGB Pro gamer color Negro 16GB",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        415000f, 17f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_697848-MLA47874082015_102021-F.webp"),
                new Product(
                        7,
                        "Memorias RAM",
                        "Memoria RAM T-Force Delta TUF Gaming Alliance RGB 16GB",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        410000f, 12f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_701454-MLA46850097481_072021-F.webp"),
                new Product(
                        8,
                        "Memorias RAM", "Memoria RAM Trident Z RGB gamer 16GB",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        445000f, 5f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_780039-MLA45376124077_032021-F.webp"),
                new Product(
                        9,
                        "Monitores",
                        "Monitor gamer Samsung led 22 pulgadas negro 100V/240V",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        656000f, 7f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_906150-MLA47751021005_102021-F.webp"),
                new Product(
                        10,
                        "Monitores",
                        "Monitor Acer KG1 led 24 pulgadas negro 100V/240V",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        1090000f, 14f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_819056-MLA45732677581_042021-F.webp"),
                new Product(
                        11,
                        "Monitores",
                        "Monitor gamer LG led 27 pulgadas negro 100V/240V",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        1200000f, 18f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_780527-MLA45731377429_042021-F.webp"),
                new Product(
                        12,
                        "Procesadores",
                        "Procesador AMD Ryzen 7 5700G de 8 núcleos y 3.8GHz",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        1759999f, 15f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_940934-MLU47593217192_092021-O.webp"),
                new Product(
                        13,
                        "Procesadores",
                        "Procesador Intel Core i5-10400F de 6 núcleos y 2.9GHz",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        832000f, 16f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_922856-MLA45376323210_032021-F.webp"),
                new Product(
                        14,
                        "Procesadores",
                        "Procesador AMD Ryzen 5 3600 de 6 núcleos y 3.6GHz",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        1150000f, 12f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_944615-MLA45376527337_032021-F.webp"),
                new Product(
                        15,
                        "Procesadores",
                        "Procesador Intel Core i7-9700K de 8 núcleos y 3.6GHz",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        1670000f, 13f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_634972-MLA45377365218_032021-F.webp"),
                new Product(
                        16,
                        "Tarjetas madre",
                        "Motherboard Board Tarjeta Madre Gigabyte B450m Ds3h",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        368000f, 9f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_861083-MCO43791839859_102020-F.webp"),
                new Product(
                        17,
                        "Tarjetas madre", "Board Gygabyte B450 Aurus Pro Wifi",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        685000f, 14f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_918340-MCO43542550940_092020-F.webp"),
                new Product(
                        18,
                        "Tarjetas madre",
                        "Asus Prime Z490-p Lga 1200 Intel 10th Gen Atx",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        950000f, 11f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_606314-MCO42026446156_052020-F.webp"),
                new Product(
                        19,
                        "Gabinetes",
                        "Gabinete Pc Gamer Redragon Gc-550 Devastator Gaming Case",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        230000f, 18f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_814984-MCO43648615857_102020-F.webp"),
                new Product(
                        20,
                        "Gabinetes",
                        "Gabinete Pc Gamer Redragon Gc-702 Tailgate Gaming Case",
                        "Producto de alto rendimiento y línea exclusiva para profesionales que ejecutan muchos programas a la vez.",
                        398000f, 15f, true,
                        "https://http2.mlstatic.com/D_NQ_NP_2X_700760-MCO43648766025_102020-F.webp")));
        sequenceRepository.save(new Sequence(Product.class.getSimpleName(), 20));
    }
}
