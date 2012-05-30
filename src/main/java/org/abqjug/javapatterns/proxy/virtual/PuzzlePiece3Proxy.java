package org.abqjug.javapatterns.proxy.virtual;

/**
 * @author John Ericksen
 */
public class PuzzlePiece3Proxy implements PuzzlePiece3 {

    private PuzzlePiece3 poxied;

    public void setProxied(PuzzlePiece3 proxied) {
        this.poxied = proxied;
    }
}
