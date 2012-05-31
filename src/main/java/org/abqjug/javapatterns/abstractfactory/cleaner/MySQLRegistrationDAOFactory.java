package org.abqjug.javapatterns.abstractfactory.cleaner;

import javax.sql.DataSource;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 5:58 PM
 */
public class MySQLRegistrationDAOFactory extends RegistrationDAOFactory {


   public RegistrationDAO create() {
      return new MySQLRegistrationDAO();
   }
}
