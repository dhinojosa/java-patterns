package org.abqjug.javapatterns.abstractfactory.cleaner;


import javax.sql.DataSource;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 5:55 PM
 */
public class MySQLRegistrationDAO extends RegistrationDAO {
   private DataSource dataSource;

   public MySQLRegistrationDAO() {

   }

   @Override
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
   }

   @Override
   public void persist(Registration registration) {
   }

   @Override
   public void update(Registration registration) {
   }
}
