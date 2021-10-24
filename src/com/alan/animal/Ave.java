package com.alan.animal;

public class Ave extends Animal {//Con extends decimos que va a heredar atributos y metodos de la clase animal
    private int Alas;
    private int patas;
    private boolean vuela;

    public Ave(){
        super(/*Podemos meter parametros al Constr. de la clase Padre*/);//Para llamar al constructor padre
        System.out.println("Constuctor hijo");
    }

    public void hacerNido(){
        System.out.println("Estoy haciendo mi nido");
    }
    public void ponerHuevo(){
        System.out.println("Estoy poniendo mi huevo");
    }

    @Override
    public void Comer(){
        System.out.println("Comiendo Alpiste");
    }

    @Override
    public void respirar() {//Se esta sobreescribiendo el metodo abstracto de la clase padre, esto es necesario cuando tenemos metodos abstractos

    }
}
