package org.abqjug.javapatterns.adaptor;

/**
 * @author John Ericksen
 */
public class AdaptorDemonstration {

    public static void main(String args[]) {

        CelciusThermometer celciusThermometer = new CelciusThermometer(34);

        FerinheightThermometer thermometer = new CelciusToFerinheightAdaptor(celciusThermometer);

        System.out.println(
                "Celcius: " + celciusThermometer.getTemperateInC() +
                        " Ferinheight: " + thermometer.getTemperateInF());
    }
}
