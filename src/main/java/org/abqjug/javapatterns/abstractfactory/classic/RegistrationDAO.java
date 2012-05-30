package org.abqjug.javapatterns.abstractfactory.classic;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 5:52 PM
 */
public abstract class RegistrationDAO {
    public abstract void persist(Registration registration);

    public abstract void update(Registration registration);
}
