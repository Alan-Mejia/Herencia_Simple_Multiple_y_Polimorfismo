package com.alan;
import java.util.Scanner;
import com.alan.Uber.UberBlack;
import com.alan.Uber.UberDrive;
import com.alan.animal.Ave;//Se necesita importar la clase para poder usarla
import com.alan.animal.Perro;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	// write your code here
        /*Ave ave = new Ave();
        ave.Comunicarse();
        ave.Comer();
        ave.hacerNido();

        Perro limito = new Perro();
        limito.jugar();
        limito.ladrar();
        limito.Comer();*/

        //Animal animal = new Animal(); //NO SE PUEDEN CREAR OBJETOS DE UNA CLASE ABSTRACTA SOLO SIRVENPARA HEREDAR A OTRAS CLASES

        System.out.println("--------------------Conductores Uber----------------\n");
        UberDrive conductor0 = new UberDrive();
        conductor0.Imprimir();
        System.out.println("\n¿Quieres cambiar tus datos? [y/n]");
        char respuesta = input.next().charAt(0);
        if(respuesta == 'y'){
            System.out.println("Nombre: ");
            String nombre=input.nextLine();
            System.out.println("Carro: ");
            String carro=input.nextLine();
            System.out.println("Plate: ");
            String plate=input.nextLine();
            conductor0.llenar(nombre,carro,plate);
        }
        System.out.println("\n--------------------Nuevos datos---------------------------\n");
        conductor0.Imprimir();
        System.out.println("¿Quieres Restablecer a valores Anteriores?  [y/n]");
        char r2=input.next().charAt(0);
        if(r2=='y'){
            System.out.println("\n--------------------Valores Predeterminados----------------");
            UberDrive copiarcuenta = new UberDrive(conductor0);
            copiarcuenta.Imprimir();
        }
        System.out.println("\n--------------------Otro Conductor----------------");
        UberDrive condutor1 = new UberDrive();
        condutor1.llenar("Juan Conducto Especial", "Tsuru", "IDK");
        condutor1.Imprimir();
        System.out.println("Precio: "+condutor1.calculatePrice(6)+"$");
        System.out.println("\n--------------------Version Black----------------");
        UberBlack conductor1black= new UberBlack();
        conductor1black.llenar("Juan Conductor Black", "Lambo", "IDK");
        conductor1black.Imprimir();
        System.out.println("Precio: "+ conductor1black.calculatePrice(6)+"$");
    }
}
