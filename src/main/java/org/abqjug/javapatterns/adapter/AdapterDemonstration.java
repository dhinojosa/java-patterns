package org.abqjug.javapatterns.adapter;

/**
 * @author John Ericksen
 */
public class AdapterDemonstration {

    public static void main(String args[]) {

        CelciusThermometer celciusThermometer = new CelciusThermometer(34);

        FahrenheitThermometer thermometer = new CelciusToFahrenheitAdapter(celciusThermometer);

        System.out.println(
                "Celcius: " + celciusThermometer.getTemperateInC() +
                        " Fahrenheit: " + thermometer.getTemperateInF());
    }
}
