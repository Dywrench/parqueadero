
package com.mycompany.parqueadero;
import java.time.LocalDateTime;
/** 
 * 
 * @author: Juan Pablo Velasquez Hernandez -506232003
 * Kevin Alexander Rojas Rivera - 614231013
 */ 

public class Parqueadero {
    public static void main(String[] args) {
        
        //simulaciones de ingreso de diferentes tipos de vehiculo
        //el .minusHours hace que simule el tiempo que lleva dentro del parqueadero con respecto a horas.
        //el .minusMinutes hace que simule el tiempo que lleva dentro del parqueadero con respecto a los minutos.
        LocalDateTime horaIngresoCarro = LocalDateTime.now().minusHours(2); // Simula un ingreso hace 2 horas
        carro carro = new carro(horaIngresoCarro);
        carro.precio();

        LocalDateTime horaIngresoMoto = LocalDateTime.now().minusHours(1); // Simula un ingreso hace 1 hora
        moto moto = new moto(horaIngresoMoto);
        moto.precio();

        LocalDateTime horaIngresoBicicleta = LocalDateTime.now().minusMinutes(30); // Simula un ingreso hace 30 minutos
        bicicleta bicicleta = new bicicleta(horaIngresoBicicleta);
        bicicleta.precio();
    }
}