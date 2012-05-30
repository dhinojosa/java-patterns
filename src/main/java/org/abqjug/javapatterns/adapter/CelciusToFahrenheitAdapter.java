package org.abqjug.javapatterns.adapter;

/**
 * @author John Ericksen
 */
public class CelciusToFahrenheitAdapter implements FahrenheitThermometer {

    private CelciusThermometer celciusThermometer;

    public CelciusToFahrenheitAdapter(CelciusThermometer celciusThermometer) {
        this.celciusThermometer = celciusThermometer;
    }

    public double getTemperateInF() {
        return convertCtoF(celciusThermometer.getTemperateInC());
    }

    private double convertCtoF(double c) {
        return (c * 9 / 5) + 32;
    }

}
