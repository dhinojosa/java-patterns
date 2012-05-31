package org.abqjug.javapatterns.abstractfactory.cleaner;


import javax.sql.DataSource;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 5:52 PM
 */
public abstract class RegistrationDAO {

   public abstract void setDataSource(DataSource dataSource);

   public abstract void persist(Registration registration);

   public abstract void update(Registration registration);
}
