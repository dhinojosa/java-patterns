package org.abqjug.javapatterns.abstractfactory.cleaner;

import javax.sql.DataSource;

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 5/31/12
 * Time: 12:11 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
public class RegistrationDAOCompositeFactory {

   private MySQLRegistrationDAOFactory mySQLRegistrationDAOFactory;
   private OracleRegistrationDAOFactory oracleRegistrationDAOFactory;

   public RegistrationDAO create() {
      String type = System.getProperty("daoType");
      DAOType daoType = null;
      try {
         daoType = DAOType.valueOf(type);
      } catch (IllegalArgumentException iae) {
         daoType = DAOType.MYSQL;
      }

      if (daoType.equals(DAOType.MYSQL)) {
         mySQLRegistrationDAOFactory = new MySQLRegistrationDAOFactory();
         return mySQLRegistrationDAOFactory.create();
      }

      oracleRegistrationDAOFactory = new OracleRegistrationDAOFactory();
      return oracleRegistrationDAOFactory.create();
   }

}
