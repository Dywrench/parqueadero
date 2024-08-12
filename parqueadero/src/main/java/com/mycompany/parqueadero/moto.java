package com.mycompany.parqueadero;

import java.time.LocalDateTime;
import java.time.Duration;

public class moto extends vehiculo implements CobroVehiculo {

    public moto(LocalDateTime horaIngreso) {
        super("Moto", horaIngreso, 20.0); // Costo por minuto para moto
    }
    //sobre escribe el precio correspondiente a al costo del minuto por moto

    @Override
    public void precio() {
        LocalDateTime horaActual = getHoraActual();
        Duration duracion = Duration.between(horaIngreso, horaActual);
        long minutos = duracion.toMinutes();
        double valorAPagar = costoPorMinuto * minutos;
        System.out.println("El valor a pagar por la moto es: $" + valorAPagar);
    }
}