package org.abqjug.javapatterns.abstractfactory.classic;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 10:07 PM
 */
public interface RegistrationDAOFactory {
    
    public RegistrationDAO create();
}
