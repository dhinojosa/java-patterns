/**
 * Abstract Factories is a creation pattern that encapsulates a group of
 * individual factories that have a common theme.
 *
 * 1. The Client software creates a concrete implementation of the abstract
 *    factory and then uses the generic interfaces
 *    to create the concrete objects that are part of the theme.
 *
 * 2. The client does not know (or care) which concrete objects it gets from
 *    each of these internal factories, since it uses
 *    only the generic interfaces of their products.
 *
 * 3. This pattern separates the details of implementation of a set of
 *    objects from their general usage.
 *
 * 4. Avoids obsessive use of if statements to determine what gets created.
 *
 */
package org.abqjug.javapatterns.abstractfactory.classic;