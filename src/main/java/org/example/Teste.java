package org.example;

public class Teste {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("GEL2256", "FIAT", "Uno, Way", "VERMELHO", 180, 4, 4, 82);
        Veiculo veiculo2 = new Veiculo("MMG6789", "VW", "FOX, HIGHLINE", "BRANCO", 200, 4, 4, 120);
        Veiculo veiculo3 = new Veiculo("OKH8760", "CHEVROLET", "ONIX JOY", "PRETA", 170, 4, 4, 86);
        Veiculo veiculo4 = new Veiculo("YUI8920", "HYUNDAI", "HB20", "CINZA", 190, 4, 4, 92);
        Veiculo veiculo5 = new Veiculo("HUI8210", "TOYOTA", "YARIS", "PRATA", 190, 4, 4, 105);

        System.out.println(veiculo1);
        System.out.println(veiculo2);
        System.out.println(veiculo3);
        System.out.println(veiculo4);
        System.out.println(veiculo5);

    }
}