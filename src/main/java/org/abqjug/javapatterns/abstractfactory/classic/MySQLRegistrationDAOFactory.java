package org.abqjug.javapatterns.abstractfactory.classic;

import javax.sql.DataSource;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 5:58 PM
 */
public class MySQLRegistrationDAOFactory implements RegistrationDAOFactory {

    public RegistrationDAO create() {
        return new MySQLRegistrationDAO();
    }
}
