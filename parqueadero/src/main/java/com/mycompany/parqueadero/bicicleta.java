package com.mycompany.parqueadero;

import java.time.LocalDateTime;
import java.time.Duration;

public class bicicleta extends vehiculo implements CobroVehiculo {

    public bicicleta(LocalDateTime horaIngreso) {
        super("Bicicleta", horaIngreso, 10.0); // Costo por minuto para bicicleta
    }
    
    //sobre escribe el precio correspondiente a al costo del minuto por bicicleta
    @Override
    public void precio() {
        LocalDateTime horaActual = getHoraActual();
        Duration duracion = Duration.between(horaIngreso, horaActual);
        long minutos = duracion.toMinutes();
        double valorAPagar = costoPorMinuto * minutos;
        System.out.println("El valor a pagar por la bicicleta es: $" + valorAPagar);
    }
}

