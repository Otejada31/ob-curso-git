package com.ejerciciopoo;

public class SmartDevice {
    public static void main(String[] args) {
        SmartPhone samsung= new SmartPhone();
        samsung.almacenamiento= 256;
        System.out.println("el almacenamiento del smartphone es: "+samsung.almacenamiento);
        samsung.gps= true;
        System.out.println("el smartphone tiene gps: "+ true);
        samsung.memoriaRam= 4;
        System.out.println("la memoria Ram del smartphone es de: "+samsung.memoriaRam);
        samsung.tipoRed= "4G";
        System.out.println("el tipo de red del smartphone es: "+samsung.tipoRed);
        SmartWatch xiaomi7= new SmartWatch();
        xiaomi7.capacidadDeMemoria= 4;
        System.out.println("\nla capacidad de memoria del smartwatch es: "+xiaomi7.capacidadDeMemoria);
        xiaomi7.duracionbateria= 15;
        System.out.println("la duracion de la bateria del smartwatch es: "+xiaomi7.duracionbateria);
        xiaomi7.podometro= false;
        System.out.println("el smartwatch tiene podometro: "+false);



    }
}
