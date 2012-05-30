package org.abqjug.javapatterns.proxy;

/**
 * @author John Ericksen
 */
public class Authority {

    private static final String MAGIC_WORD = "please";
    private boolean saidMagicWord = false;

    public void authorize(String magicWord) {
        if (MAGIC_WORD.equals(magicWord)) {
            saidMagicWord = true;
        }
    }

    public boolean canProcessPayment() {
        return saidMagicWord;
    }
}
