package org.abqjug.javapatterns.abstractfactory.classic;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 10:31 PM
 */
public class Runner {

    public static void main(String[] args) {
        String type = System.getProperty("daoType");
        DAOType daoType = null;
        if ("mySQL".equals(type)) {
            daoType = DAOType.MYSQL;
        } else {
            daoType = DAOType.ORACLE;
        }

        Client client = new Client(RegistrationDAOAbstractFactory.createRegistrationDAO(daoType));

    }
}
