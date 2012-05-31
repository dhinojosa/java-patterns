package org.abqjug.javapatterns.abstractfactory.cleaner;

import org.abqjug.javapatterns.abstractfactory.classic.Client;
import org.abqjug.javapatterns.abstractfactory.classic.DAOType;
import org.abqjug.javapatterns.abstractfactory.classic.RegistrationDAOAbstractFactory;

import javax.sql.DataSource;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 10:31 PM
 */
public class Runner {

    public static void main(String[] args) {

        RegistrationDAO registrationDAO = new RegistrationDAOCompositeFactory().create();
        registrationDAO.persist(new Registration());

    }
}
