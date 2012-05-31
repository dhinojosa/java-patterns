package org.abqjug.javapatterns.abstractfactory.cleaner;


import javax.sql.DataSource;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 5:55 PM
 */
public class OracleRegistrationDAO extends RegistrationDAO {
   private DataSource dataSource;

   public OracleRegistrationDAO() {

   }

   @Override
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
   }

   @Override
   public void persist(Registration registration) {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   @Override
   public void update(Registration registration) {
      //To change body of implemented methods use File | Settings | File Templates.
   }
}
