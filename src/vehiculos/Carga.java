package vehiculos;

import interfaces.*;

public class Carga extends Vehiculo implements MovimientoLados, Transporte, Aceleracion {

    public Carga() {
    }
    
    public Carga(int cantGalones, int cantPasajeros, int velocidadMaxima, double aceleracion, boolean esGasolina) {
        super(cantGalones, cantPasajeros, velocidadMaxima, aceleracion, esGasolina);
    }

    @Override
    public void irHaciaDerecha() {
        System.out.println("\n  Giro a la derecha");
        
    }

    @Override
    public void irHaciaIzquierda() {
        System.out.println("\n  Giro a la izquierda");
        
    }

    @Override
    public void transportacion() {
        System.out.println("\n  Transporto materiales");
        
    }

    @Override
    public void acelerar() {
        System.out.println("\n  Mi aceleracion baja");
        
    }

}
