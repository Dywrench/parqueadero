
package com.mycompany.parqueadero;

import java.time.LocalDateTime;

/**
 *
 * @author juan0
 */
public abstract class vehiculo {
    public String moto;
    public String carro;
    public String bicicleta;
    public double horaActual;
    public double horaIngreso;
    

    public vehiculo(String moto, String carro, String bicicleta, double horaActual,double horaIngreso ) {
        this.moto = moto;
        this.carro = carro;
        this.bicicleta = bicicleta;
        this.horaActual= horaActual;
        this.horaIngreso = horaIngreso;
    }
    
    
    public void horaActual(){
    LocalDateTime locaDate = LocalDateTime.now();
    int horas  = locaDate.getHour();
    int minutos = locaDate.getMinute();
    int segundos = locaDate.getSecond();
    }
    
    
}
