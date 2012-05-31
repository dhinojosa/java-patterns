package org.abqjug.javapatterns.abstractfactory.cleaner;

import javax.sql.DataSource;

public abstract class RegistrationDAOFactory {
   public abstract RegistrationDAO create();
}
