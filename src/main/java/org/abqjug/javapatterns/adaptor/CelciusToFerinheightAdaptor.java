package org.abqjug.javapatterns.adaptor;

/**
 * @author John Ericksen
 */
public class CelciusToFerinheightAdaptor implements FerinheightThermometer {

    private CelciusThermometer celciusThermometer;

    public CelciusToFerinheightAdaptor(CelciusThermometer celciusThermometer) {
        this.celciusThermometer = celciusThermometer;
    }

    public double getTemperateInF() {
        return convertCtoF(celciusThermometer.getTemperateInC());
    }

    private double convertCtoF(double c) {
        return (c * 9 / 5) + 32;
    }

}
