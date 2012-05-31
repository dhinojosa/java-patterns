package org.abqjug.javapatterns.builder.inguava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import javax.swing.*;

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 5/31/12
 * Time: 12:36 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
public class UsingGuavaBuilders {

   public static void main(String[] args) {
      ImmutableList.builder().add(1).add(3,4,5).add(3).build();
   }
}
