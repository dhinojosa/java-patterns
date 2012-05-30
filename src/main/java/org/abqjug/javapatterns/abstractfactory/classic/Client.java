package org.abqjug.javapatterns.abstractfactory.classic;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 10:29 PM
 */
public class Client {


    public Client(RegistrationDAOFactory factory) {
        RegistrationDAO registrationDAO = factory.create();
    }
}
