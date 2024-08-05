
package com.mycompany.parqueadero;

/**
 *
 * @author juan0
 */
public class bicicleta extends vehiculo implements cobroBicicleta {

    public bicicleta(String moto, String carro, String bicicleta, double horaActual, double horaIngreso) {
        super(moto, carro, bicicleta, horaActual, horaIngreso);
    }

    @Override
    public void precio() {
    this.horaIngreso = horaIngreso;
    double contadorMinutos=0;
    double precioMinuto_moto = 10;
    for (double i =horaIngreso ;i<=horaActual;i++){
        contadorMinutos++;
    }
    double valorA_pagar = precioMinuto_moto*contadorMinutos;
    System.out.println("El Valor a pagar seria de : $"+valorA_pagar);
    }
    
}
