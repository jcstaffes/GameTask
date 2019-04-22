package comp1110.ass2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Board {
//      use this class to complete three steps:
//         1. create an empty board
//         2. define the exit
//         3. define the central area
//         then the game.java and railroadInk.java can invoke the functions or value in this class.


    /**
     * Determine offset for grid
     *
     * @param c column/row to get offset for
     * @author Brodie Osborne (u5828619)
     */
    public static int getOffset(char c) {
        int offset = 0;
        switch (c) {
            case '0':
                offset = 0;
                break;
            case '1':
                offset = 100;
                break;
            case '2':
                offset = 200;
                break;
            case '3':
                offset = 300;
                break;
            case '4':
                offset = 400;
                break;
            case '5':
                offset = 500;
                break;
            case '6':
                offset = 600;
                break;
            case '7':
                offset = 700;
                break;
            case 'A':
                offset = 0;
                break;
            case 'B':
                offset = 100;
                break;
            case 'C':
                offset = 200;
                break;
            case 'D':
                offset = 300;
                break;
            case 'E':
                offset = 400;
                break;
            case 'F':
                offset = 500;
                break;
            case 'G':
                offset = 600;
                break;
        }
        return offset;
    }

    /**
     *the tile take the place of board to place tiles on basis of previous placements and do not need to reset the board in each round.
     * t as tile,b as board,board should be filled at first
     * filltheboard=b,but i don't know how to make them full?
     * @author u6801714 Jiamin Dai
     */
    public static ArrayList<String> filltheboard(){
        ArrayList<String> filltheboard=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        for (int i=0;i<31;i++){
            filltheboard.add(in.next());
        }
        return filltheboard;
    }
    public static ArrayList<String> addtheBoard(ArrayList<String> b,ArrayList<String> t){
        for (int i=0;i<b.size();i++){
            b.remove(i);
            b.add(i,t.get(i));
        }
        if (RailroadInk.isValidPlacementSequence(String.valueOf(b)))
            return b;
        else
            return null;
    }

}
