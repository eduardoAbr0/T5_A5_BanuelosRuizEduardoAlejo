package com.example.t5_a5_banuelosruizeduardoalejo;

public class logicaConversiones {
    //CELSIUS A

    //CELSIUS A FAHRENHEIT
    public double celsiusFahrenheit(double c){
        double fah = (c*9/5) + 32;
        return fah;
    }

    //CELSIUS A KELVIN
    public double celsiusKelvin(double c){
        double kel = c + 273.15;
        return kel;
    }

    //CELSIUS A RANK
    public double celsiusRank(double c){
        double rank = c * 9/5 + 491.67;
        return rank;
    }


    //FAHRENHEIT A

    //FAHRENHEIT A CELSIUS
    public double fahrenheitCelsius(double fah){
        double cel = (fah-32) * 5/9;
        return cel;
    }

    //KELVIN A

    //KELVIN A CELSIUS
    public double kelvinCelsius(double kel){
        double cel = kel-273.15;
        return cel;
    }

    //RANKINE A

    //RANKINE A CELSIUS
    public double rankineCelsius(double rank){
        double cel = (rank-491.67) * 5/9;
        return cel;
    }
}
