package com.alan.Uber;

public class UberBlack extends UberDrive{
    public UberBlack(){
        super();
    }

    public UberBlack(UberDrive w){

    }

    @Override
    public double calculatePrice(double km) {
        return Math.max(getRatePerKm() * km,9);
    }


}
