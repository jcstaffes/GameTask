package comp1110.ass2.gui;

import comp1110.ass2.Board;
import comp1110.ass2.RailroadInk;
import comp1110.ass2.Tile;

public class Game {
    public static void main(String[] args) {
        Board.emptyBpard();/**use Board class to create a new empty board
        round rule from RailroadInk;**/
        RailroadInk.generateDiceRoll();
        /**1.start the first round;**/
        RailroadInk.isTilePlacementWellFormed(Tile);
        /**2.check the tile,Tile class is to get the image and the orientation;**/
        RailroadInk.generateMove(Board.emptyBpard());
        /**3.move the tiles;
        check to get score;**//
        RailroadInk.isBoardStringWellFormed();
        /**4.check board string;**/
        RailroadInk.areConnectedNeighbours();
        /**5.check neighbours;**/
        RailroadInk.isValidPlacementSequence();
        /**6.check placement;
        get scores;*/
        System.out.println(RailroadInk.getAdvancedScore());
        /**get final score;
        *this game need a console(Game class),a Tile class to get the image from the assets and modify the orientation.
        *RailroadInk is a rule about this game,use this class to check the rules and get scores.*/
        }
}
