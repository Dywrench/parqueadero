package com.mycompany.parqueadero;

import java.time.LocalDateTime;
import java.time.Duration;

public class carro extends vehiculo implements CobroVehiculo {

    public carro(LocalDateTime horaIngreso) {
        super("Carro", horaIngreso, 40.0); // Costo por minuto para el carro
    }

    //sobre escribe el precio correspondiente a al costo del minuto por carro
    @Override
    public void precio() {
        LocalDateTime horaActual = getHoraActual();
        Duration duracion = Duration.between(horaIngreso, horaActual);
        long minutos = duracion.toMinutes();
        double valorAPagar = costoPorMinuto * minutos;
        System.out.println("El valor a pagar por el carro es: $" + valorAPagar);
    }
}