
package com.mycompany.parqueadero;

/**
 *
 * @author juan0
 */
public class carro extends vehiculo implements cobroCarro {

    public carro(String moto, String carro, String bicicleta, double horaActual, double horaIngreso) {
        super(moto, carro, bicicleta, horaActual, horaIngreso);
    }

    @Override
    public void precio() {
    this.horaIngreso = horaIngreso;
    double contadorMinutos=0;
    double precioMinuto_Carro = 10;
    for (double i =horaIngreso ;i<=horaActual;i++){
        contadorMinutos++;
    }
    double valorA_pagar = precioMinuto_Carro*contadorMinutos;
    System.out.println("El Valor a pagar seria de : $"+valorA_pagar);
    }
    
}
