package comp1110.ass2;

public class Board {
    public String emptyboard;
    public static int emptyBpard(int n){
        return '0';
    }

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
                offset = 66;
                break;
            case '1':
                offset = 166;
                break;
            case '2':
                offset = 266;
                break;
            case '3':
                offset = 366;
                break;
            case '4':
                offset = 466;
                break;
            case '5':
                offset = 566;
                break;
            case '6':
                offset = 666;
                break;
            case 'A':
                offset = 33;
                break;
            case 'B':
                offset = 133;
                break;
            case 'C':
                offset = 233;
                break;
            case 'D':
                offset = 333;
                break;
            case 'E':
                offset = 433;
                break;
            case 'F':
                offset = 533;
                break;
            case 'G':
                offset = 633;
                break;
        }
        return offset;
    }

    public String exit;
}
