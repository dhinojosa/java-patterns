package org.abqjug.javapatterns.adaptor;

/**
 * @author John Ericksen
 */
public class CelciusThermometer {

    double temp;

    public CelciusThermometer(double temp) {
        this.temp = temp;
    }

    public double getTemperateInC() {
        return temp;
    }
}
