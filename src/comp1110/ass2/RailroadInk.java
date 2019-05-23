package comp1110.ass2;

import comp1110.ass2.gui.Viewer;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RailroadInk {
    /**
     * Determine whether a tile placement string is well-formed:
     * - it consists of exactly 5 characters;
     * - the first character represents a die A or B, or a special tile S
     * - the second character indicates which tile or face of the die (0-5 for die A and special tiles, or 0-2 for die B)
     * - the third character represents the placement row A-G
     * - the fourth character represents the placement column 0-6
     * - the fifth character represents the orientation 0-7
     *
     * @param tilePlacementString a candidate tile placement string
     * @return true if the tile placement is well formed
     */
    public static boolean isTilePlacementWellFormed(String tilePlacementString) {
        // FIXME Task 2: determine whether a tile placement is well-formed
        char []t=tilePlacementString.toCharArray();
        if(tilePlacementString.length()==5){
            if(t[0]=='A'||t[0]=='S'){
                if(t[1]>='0'&&t[1]<='5'&&t[2]>='A'&&t[2]<='G'&&t[3]>='0'&&t[3]<='6'&&t[4]>='0'&&t[4]<='7')
                    return true;
                else
                   return false;
            }
            else if(t[0]=='B'){
                if(t[1]>='0'&&t[1]<='2'&&t[2]>='A'&&t[2]<='G'&&t[3]>='0'&&t[3]<='6'&&t[4]>='0'&&t[4]<='7')
                   return true;
                else
                   return false;
            }
            else
               return false;
        }
        else
            return false;
    }

    /**
     * Determine whether a board string is well-formed:
     * - it consists of exactly N five-character tile placements (where N = 1 .. 31);
     * - each piece placement is well-formed
     * - no more than three special tiles are included
     *
     * @param boardString a board string describing the placement of one or more pieces
     * @return true if the board string is well-formed
     */
    public static boolean isBoardStringWellFormed(String boardString) {
        // FIXME Task 3: determine whether a board string is well-formed

        if(boardString==null)
            return false;

        int amount1 = (boardString.length()/5);

        for (int i = 0;i<(amount1);i++) {
            String thistile = boardString.substring((0 + i * 5), (5 + i * 5));
            if (!isTilePlacementWellFormed(thistile)) {
                return false;
            }
        }
        char []t=boardString.toCharArray();
        int sum=0;
        if(boardString.length()%5==0&&boardString.length()<=155&&boardString.length()>=5){
        for(int i=0;i<boardString.length();i+=5){
            if(t[i]=='S')
                sum++;
        }
        if(sum>3)
                return false;
        else
        return true;
        }
        else
                return false;
    }


    /**
     * Determine whether the provided placements are neighbours connected by at least one validly connecting edge.
     * For example,
     * - areConnectedNeighbours("A3C10", "A3C23") would return true as these tiles are connected by a highway edge;
     * - areConnectedNeighbours("A3C23", "B1B20") would return false as these neighbouring tiles are disconnected;
     * - areConnectedNeighbours("A0B30", "A3B23") would return false as these neighbouring tiles have an
     * invalid connection between highway and railway; and
     * areConnectedNeighbours("A0B30", "A3C23") would return false as these tiles are not neighbours.
     *
     * @return true if the placements are connected neighbours
     */

    /**
     *     0
     *   1  3
     *    2
     * **/
    public static boolean areConnectedNeighbours(String tilePlacementStringA, String tilePlacementStringB) {
        //  @author Jiamin Dai(u6801714)
        if (tilePlacementStringA==""||tilePlacementStringB==""){
            return false;
        }
        else {
            String strA=Tile.tileReset(tilePlacementStringA);
            String strB=Tile.tileReset(tilePlacementStringB);
            char rowA=tilePlacementStringA.charAt(2);
            char rowB=tilePlacementStringB.charAt(2);
            char colA=tilePlacementStringA.charAt(3);
            char colB=tilePlacementStringB.charAt(3);
            if (rowA==rowB){
                if (colA==colB-1&&strA.charAt(3)==strB.charAt(1)&&strA.charAt(3)!='N')
                    return true;
                else if (colA==colB+1&&strA.charAt(1)==strB.charAt(3)&&strA.charAt(1)!='N')
                    return true;
                else
                    return false;
            }
            else if (colA==colB){
                if (rowA==rowB+1&&strA.charAt(0)==strB.charAt(2)&&strB.charAt(2)!='N')
                    return true;
                else if (rowA==rowB-1&&strA.charAt(2)==strB.charAt(0)&&strB.charAt(0)!='N')
                    return true;
                else
                    return false;
            }
            else
                return false;
        }

//        if(tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)&&tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)+1&&str3.charAt(1)==str4.charAt(3)&&str3.charAt(1)!='N')
//                return true;
//        else if (tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)&&tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)+1&&str3.charAt(0)==str4.charAt(2)&&str3.charAt(0)!='N')
//                return true;
//        else if (tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)&&tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)-1&&str3.charAt(3)==str4.charAt(1)&&str3.charAt(3)!='N')
//                return true;
//        else if(tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)&&tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)-1&&str3.charAt(2)==str4.charAt(0)&&str3.charAt(2)!='N')
//                return true;
//        else if(str3.charAt(2)==str4.charAt(0)&&str3.charAt(0)==str4.charAt(2)&&tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)&&str3.charAt(2)!='N'&&str3.charAt(0)!='N'&&(tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)+1||tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)-1))
//            return true;
//        else if(str3.charAt(1)==str4.charAt(3)&&str3.charAt(3)==str4.charAt(1)&&tilePlacementStringA.charAt(2)==tilePlacementStringB.charAt(2)&&str3.charAt(1)!='N'&&str3.charAt(3)!='N'&&(tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)+1||tilePlacementStringA.charAt(3)==tilePlacementStringB.charAt(3)-1))
//            return true;
//        else
//            return false;
    }

    /**
     * Given a well-formed board string representing an ordered list of placements,
     * determine whether the board string is valid.
     * A board string is valid if each tile placement is legal with respect to all previous tile
     * placements in the string, according to the rules for legal placements:
     * - A tile must be placed such that at least one edge connects to either an exit or a pre-existing route.
     *   Such a connection is called a valid connection.
     * - Tiles may not be placed such that a highway edge connects to a railway edge;
     *   this is referred to as an invalid connection.
     *   Highways and railways may only join at station tiles.
     * - A tile may have one or more edges touching a blank edge of another tile;
     *   this is referred to as disconnected, but the placement is still legal.
     *
     * @param boardString a board string representing some placement sequence
     * @return true if placement sequence is valid
     */
    public static boolean isValidPlacementSequence(String boardString) {
        // FIXME Task 6: determine whether the given placement sequence is valid
        //List allTiles = Viewer.breakPlacementStringToPieces(boardString);
        ArrayList<String> tilestring=new ArrayList<>();
        for (int i=0;i<boardString.length()/5;i=i+5){
            tilestring.add(boardString.substring(i,i+5));
        }
        String[] board=new String[boardString.length()/5];
        for (int i=0,j=0;i<boardString.length();i=i+5,j++){
            board[j]=boardString.substring(i+2,i+4);
        }
        for (int i=0;i<board.length;i++){
            for (int j=i+1;j<board.length;j++)
                if (board[i].equals(board[j])){
                    return false;
                }
        }
        if (isBoardStringWellFormed(boardString)){
            int amount = (boardString.length()/5);
            char ro1 = boardString.charAt(2);
            char co1 = boardString.charAt(3);
            if (!((ro1=='A'&&co1=='1')||(ro1=='A'&&co1=='3')||(ro1=='A'&&co1=='5')||(ro1=='B'&&co1=='0')||(ro1=='B'&&co1=='6')||(ro1=='D'&&co1=='0')||(ro1=='D'&&co1=='6')||(ro1=='F'&&co1=='0')||(ro1=='F'&&co1=='6')||(ro1=='G'&&co1=='1')||(ro1=='G'&&co1=='3')||(ro1=='G'&&co1=='5'))){
                return false;
            }
              loop2:
                for (int i = 0;i<(amount);i++){
                    loop1:
                    for (int j = i;j>=0;j--){

                            String tile1 = boardString.substring((0+i*5),(5+i*5));
                            String tile2 = boardString.substring((0+j*5),(5+j*5));
                            String con = Tile.tileReset(tile1);
                            char ro = tile1.charAt(2);
                            char co = tile1.charAt(3);
                            char ro2 = tile2.charAt(2);
                            char co2 = tile2.charAt(3);
                        if (isTilePlacementWellFormed(tile1)){

                                //String tile3 = allTiles.get(i).toString();

                                if (ro=='A'&&co=='1'){
                                    if (con.charAt(0)=='R') return false;
                                }
                                else if (ro=='A'&&co=='3'){
                                    if (con.charAt(0)=='H') return false;
                                }
                                else if (ro=='A'&&co=='5'){
                                    if (con.charAt(0)=='R') return false;
                                }
                                else if (ro=='B'&&co=='0'){
                                    if (con.charAt(1)=='H') return false;
                                }
                                else if (ro=='B'&&co=='6'){
                                    if (con.charAt(3)=='H') return false;
                                }
                                else if (ro=='D'&&co=='0'){
                                    if (con.charAt(1)=='R') return false;
                                }
                                else if (ro=='D'&&co=='6'){
                                    if (con.charAt(3)=='R') return false;
                                }
                                else if (ro=='F'&&co=='0'){
                                    if (con.charAt(1)=='H') return false;
                                }
                                else if (ro=='F'&&co=='6'){
                                    if (con.charAt(3)=='H') return false;
                                }
                                else if (ro=='G'&&co=='1'){
                                    if (con.charAt(2)=='R') return false;
                                }
                                else if (ro=='G'&&co=='3'){
                                    if (con.charAt(2)=='H') return false;
                                }
                                else if (ro=='G'&&co=='5'){
                                    if (con.charAt(2)=='R') return false;
                                }
                                else if (((ro==ro2)&&(co==(co2-1)))||((ro==ro2)&&(co==(co2+1)))||((co==co2)&&(ro==(ro2-1)))||((co==co2)&&(ro==(ro2+1)))){
                                    if (areConnectedNeighbours(tile1,tile2)){
                                        break loop1;
                                    }
                                }
                                else {
                                    return false;
                                }
                        }
                    }
                }
        }


        return true;
    }

    /**
     * Generate a random dice roll as a string of eight characters.
     * Dice A should be rolled three times, dice B should be rolled once.
     * Die A has faces numbered 0-5.
     * Die B has faces numbered 0-2.
     * Each die roll is composed of a character 'A' or 'B' representing the dice,
     * followed by a digit character representing the face.
     *
     * @return a String representing the die roll e.g. A0A4A3B2
     */
    /**
     written by u6801714 Jiamin Dai
     **/
    public static String generateDiceRoll() {
        // FIXME Task 7: generate a dice roll
        Random rand=new Random();
        return "A"+rand.nextInt(6)+"A"+rand.nextInt(6)+"A"+rand.nextInt(6)+"B"+rand.nextInt(3);
    }

    public static Boolean IsConnectExit(String tilepiece){
        if (tilepiece=="") return false;
        else {
            char[] chars0 = tilepiece.toCharArray();
            if ((chars0[2] == 'A' && chars0[3] == '1') || (chars0[2] == 'A' && chars0[3] == '3') || (chars0[2] == 'A' && chars0[3] == '5') || (chars0[2] == 'B' && chars0[3] == '0') || (chars0[2] == 'B' && chars0[3] == '6') || (chars0[2] == 'D' && chars0[3] == '0') || (chars0[2] == 'D' && chars0[3] == '6') || (chars0[2] == 'F' && chars0[3] == '0') || (chars0[2] == 'F' && chars0[3] == '6') || (chars0[2] == 'G' && chars0[3] == '1') || (chars0[2] == 'G' && chars0[3] == '3') || (chars0[2] == 'G' && chars0[3] == '5')){
                return true;
            }
            else {
                return false;
            }
        }

    }

//    public static Boolean IsEndAtEdge(String tilepiece){
//        char[] chars = tilepiece.toCharArray();
//        String Connection = Tile.tileReset(tilepiece);
//        char[] chars1 = Connection.toCharArray();
//
//        if (chars[2]=='A'&&chars1[0]!='N') return true;
//        else if (chars[2]=='G'&&chars1[2]!='N') return true;
//        if (chars[3]=='0'&&chars1[1]!='N') return true;
//        else if ()
//    }

    public String KindofRoad(String StrA,String StrB){
        char[] chars = StrA.toCharArray();
        String road = new String();

        return  road;
    }
    /**
     * Given the current state of a game board, output an integer representing the sum of all the following factors
     * that contribute to the player's final score.
     * <p>
     * * Number of exits mapped
     * * Number of centre tiles used
     * * Number of dead ends in the network
     *
     * @param boardString a board string representing a completed game
     * @return integer (positive or negative) for score *not* considering longest rail/highway
     */
    public static int getBasicScore(String boardString) {
        // FIXME Task 8: compute the basic score
        int score = 0;
        List<String> piece0 = new ArrayList<>();
        String str1 = new String();
        int ExitNum = 0;
        int ErrorNum = 0;
        piece0 = Viewer.breakPlacementStringToPieces(boardString);
        int tilenumber = boardString.length()/5;


        for (int i = 0;i<piece0.size();i++){
            String tile1 = piece0.get(i);
            char[] t1 = tile1.toCharArray();
            if (t1[2]=='C'||t1[2]=='D'||t1[2]=='E') {
                if (t1[3] == '2'||t1[3] == '3'||t1[3]=='4') {
                    score++;
                }
            }
        }
        System.out.println("score: "+score);




        String[] StrA = new String[tilenumber];
        String[] StrB = new String[tilenumber];
        String[] StrC = new String[tilenumber];
        for (int i = 0; i<tilenumber;i++){
            StrA[i] = piece0.get(i);
            StrC[i] = piece0.get(i);
            StrB[i] = "";
        }

        for (int i=0;i<tilenumber;i++){
            String direction = Tile.tileReset(StrA[i]);
            char[] d1 = direction.toCharArray();
            int errorSide = 4;
            char[] chars0 = StrA[i].toCharArray();
            if (chars0[2]=='A'||chars0[2]=='G'){
                errorSide--;
            }
            if (chars0[3]=='0'||chars0[3]=='6'){
                errorSide--;
            }
            for (int j=0;j<4;j++){
                if (d1[j]=='N'){
                    if (j==0&&chars0[2]=='A'){
                        errorSide=errorSide+0;
                    }
                    else if (j==1&&chars0[3]=='0'){
                        errorSide=errorSide+0;
                    }
                    else if (j==2&&chars0[2]=='G'){
                        errorSide=errorSide+0;
                    }
                    else if (j==3&&chars0[3]=='6'){
                        errorSide=errorSide+0;
                    }
                    else {
                        errorSide--;
                    }
                }
            }
            for (int k=0;k<tilenumber;k++){
                if (RailroadInk.areConnectedNeighbours(StrA[i],StrC[k])) errorSide--;
            }
//            if (errorSide>0){
//                System.out.println(StrA[i]);
//            }
//            System.out.println("ErrorNum: "+ErrorNum);
            ErrorNum = ErrorNum+errorSide;
        }

        for (int i=0;i<tilenumber;i++){
            if (StrA[i]!="") {
                if (RailroadInk.IsConnectExit(StrA[i])) {
//                    ExitNum++;
                StrB[i] = StrA[i];
                StrA[i] = "";
                for (int j = 0; j < tilenumber; j++) {
                    for (int k=0;k<tilenumber;k++){
                        if (RailroadInk.areConnectedNeighbours(StrB[j], StrA[k])) {
                            if (RailroadInk.IsConnectExit(StrA[k])) {
                                System.out.println(StrA[k]);
                                ExitNum++;
                            }
                            StrB[k] = StrA[k];
                            StrA[k] = "";
                            j=0;
                        }
                    }

                     }

                }
                score = score + 4 * (ExitNum - 1);
                ExitNum = 0;
                for (int l=0;l<tilenumber;l++){
                    StrB[l]="";
                }
            }

        }

        score = score-ErrorNum;

        return score;
    }

    /**
     * Given a valid boardString and a dice roll for the round,
     * return a String representing an ordered sequence of valid piece placements for the round.
     * @param boardString a board string representing the current state of the game as at the start of the round
     * @param diceRoll a String representing a dice roll for the round
     * @return a String representing an ordered sequence of valid piece placements for the current round
     * @see RailroadInk#generateDiceRoll()
     */
    public static String generateMove(String boardString, String diceRoll) {
        // FIXME Task 10: generate a valid move
        ArrayList<String> dice=Tile.generateTile(diceRoll);
        ArrayList<String> board=Tile.generateboard(boardString);

        return "S4A42";
    }

    /**
     * Given the current state of a game board, output an integer representing the sum of all the factors contributing
     * to `getBasicScore`, as well as those attributed to:
     * <p>
     * * Longest railroad
     * * Longest highway
     *
     * @param boardString a board string representing a completed game
     * @return integer (positive or negative) for final score (not counting expansion packs)
     */
    public static int getAdvancedScore(String boardString) {
        // FIXME Task 12: compute the total score including bonus points
        return -1;
    }


}

