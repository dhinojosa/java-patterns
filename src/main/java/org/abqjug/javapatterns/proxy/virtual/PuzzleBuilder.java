package org.abqjug.javapatterns.proxy.virtual;

/**
 * @author John Ericksen
 */
public class PuzzleBuilder {

    public static void main(String[] args) {

        PuzzlePiece3Proxy puzzle3 = new PuzzlePiece3Proxy();
        PuzzlePiece2 puzzle2 = new PuzzlePiece2(puzzle3);
        PuzzlePiece1 puzzle1 = new PuzzlePiece1(puzzle2);


        puzzle3.setProxied(new PuzzlePiece3Impl(puzzle1));
    }

    /*
        PuzzlePiece3Proxy piece3Proxy = new PuzzlePiece3Proxy();
        PuzzlePiece2 piece2 = new PuzzlePiece2(piece3Proxy);
        PuzzlePiece1 piece1 = new PuzzlePiece1(piece2);
        PuzzlePiece3 puzzlePiece3 = new PuzzlePiece3Impl(piece1);
        piece3Proxy.setProxied(puzzlePiece3);
     */
}
