package com.alan.animal;

public class Perro extends Animal implements Mascota, Mamiferos{//La case perro hereda atributos y metodos de la clase animal
    //PALABRA RESERVADA implements PARA HEREDAR CLASES ABSTRACTAS
    //Se debe de SOBREESCRIBIR LOS METODOS DE LAS INTERFACES DE LO CONTRARIO MARCARA ERROR
    private int patas;
    private boolean cola;
    private String raza;

    public void ladrar(){
        System.out.println("Estoy ladrando");
    }
    public void jugar(){
        System.out.println("Estoy ladrando");
    }

    @Override
    public void dormir() {
        System.out.println("ZZZZZZZ");
    }

    @Override
    public void hablar() {
        System.out.println("Guaffff");
    }

    @Override//Se utiliza sobre metodos de la clase padre par asobreescribirlo estoya es polimorfismo
    public void Comer(){
        System.out.println("Comiendo croquetas");
    }

    @Override
    public void respirar() {

    }

    @Override
    public void gestacion() {
        System.out.println("Tiempo de 2 meses");
    }

    @Override
    public void ingestarLeche() {
        System.out.println("Tamando leche");
    }

    @Override
    public void movilidad() {
        System.out.println("Camino en 4 patas");
    }
}
