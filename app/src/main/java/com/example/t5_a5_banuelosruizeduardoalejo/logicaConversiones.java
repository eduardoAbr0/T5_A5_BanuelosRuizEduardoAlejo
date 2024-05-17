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

    //FAHRENHEIT A KELVIN
    public double fahrenheitKelvin(double fah){
        double kel = (fah-32)*5/9+273.15;
        return kel;
    }

    //FAHRENHEIT A RANK
    public double fahrenheitRank(double fah){
        double rank = fah+459.67;
        return rank;
    }

    //KELVIN A

    //KELVIN A CELSIUS
    public double kelvinCelsius(double kel){
        double cel = kel-273.15;
        return cel;
    }

    //KELVIN A FAHRENHEIT
    public double kelvinFahrenheit(double kel){
        double fah = (kel-273.15) * 9/5 + 32;
        return fah;
    }

    //KELVIN A RANK
    public double kelvinRank(double kel){
        double rank =kel*1.8;
        return rank;
    }

    //RANKINE A

    //RANKINE A CELSIUS
    public double rankineCelsius(double rank){
        double cel = (rank-491.67) * 5/9;
        return cel;
    }

    //RANKINE A FAHRENHEIT
    public double rankineFahrenheit(double rank){
        double fah = rank-458.67;
        return fah;
    }

    //RANK A KELVIN
    public double rankineKelvin(double rank){
        double kel = rank*5/9;
        return kel;
    }
}
