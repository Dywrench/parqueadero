package com.mycompany.parqueadero;

import java.time.LocalDateTime;


public abstract class vehiculo {
    protected String tipoVehiculo;
    protected LocalDateTime horaIngreso;
    protected double costoPorMinuto;

   
    public vehiculo(String tipoVehiculo, LocalDateTime horaIngreso, double costoPorMinuto) {
        this.tipoVehiculo = tipoVehiculo;
        this.horaIngreso = horaIngreso;
        this.costoPorMinuto = costoPorMinuto;
    }
    //metodo para conseguir/ saber la hora acxtual basada en el dispositivo en el que se ejecuta
    public LocalDateTime getHoraActual() {
        return LocalDateTime.now();
    }
    //toma la hora a la que se ingreso el vehiculo
    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    public abstract void precio();
}
