package com.alan.Uber;

import javax.print.event.PrintJobAttributeListener;

import static java.lang.Math.*;

public class UberDrive {
    private String name;
    private String carModel;
    private String plate;
    private int minimum=7;
    private double ratePerKm = 1.5;
    private int ratePerMinute = 1;
    private int currentMonthSalary = 0;

    public UberDrive(){
        this.name="Alan mejia";
        this.carModel="Suburban";
        this.plate = "IDK";
    }

    public UberDrive(UberDrive w){
        this.name= w.name;
        this.carModel=w.carModel;
        this.plate=w.plate;
    }

    public void llenar(String name, String carModel, String plate){
        this.name=name;
        this.carModel=carModel;
        this.plate = plate;
    }

    public void Imprimir(){
        System.out.println("Conductor: "+this.name);
        System.out.println("Carro: "+this.carModel);
        System.out.println("Plate: "+this.plate);
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public double calculatePrice(double km) {
        return max(this.ratePerKm * km,7); //Reterona el valor maximo de dos numeros Comapara entre  (rate*km , otrovalot) retorna el mas grande de los dos (50,10) retorna 50
    }
}
