package com.alan.animal;

public abstract class Animal {//LA CLASE ES ABSTRACTA PORQUE ESTAMOS IMPLEMENTANDO UN METODO ABSTRACTO
    protected String Nombre;
    protected int Edad;

    public Animal(){
        System.out.println("Constructor Padre");
    }

    public void Comunicarse(){
        System.out.println("Holaa");
    }
    public void Comer(){
        System.out.println("Estoy comiendo");
    }

    //Para que una clase sea abstracta como minimo debe de tener un metodo abstracto

    public abstract void respirar();//Cuando un metodo es abstract, a fuerzas todas las clases que hereden van a tener que sobreescribir el metodo y sobreescribirlo
}
