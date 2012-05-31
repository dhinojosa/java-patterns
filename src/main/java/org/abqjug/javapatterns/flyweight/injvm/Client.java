package org.abqjug.javapatterns.flyweight.injvm;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 10:19 AM
 */
public class Client {

    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        String str = "Chewbacca";
        String str2 = "Chewbacca";
        assert str.equals(str2);
        assert str == str2;
        String str3 = new String("Chewbacca");
        assert str3 != str2;
    }
}
