package comp1110.ass2;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import comp1110.ass2.gui.Viewer;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class Tile {
    public String tileID;
    public int rotation;
    public char column;
    public char row;
    public String connection;
    public List neighbourGrids;
    public ImageView imgview;


    /**
     * Constructor for a tile
     *
     * @param tileID   This refers to the ID of the tile. Also refers to the X.png of the file name.
     * @param rotation This is the orientation of the tile. This is used in order to rotate the tile correctly.
     * @param column   Refers to the column that the tile originates from.
     * @param row      Refers to the row that the tile originates from.
     * @author Brodie Osborne - u5828619
     */
    public Tile(String tileID, int rotation, char column, char row) {
        this.tileID = tileID;
        this.rotation = rotation;
        this.column = column;
        this.row = row;
        this.connection = getConnection(tileID, rotation);
        this.neighbourGrids = getNeighbours(row, column);
        this.imgview = getImage(this);
    }

    /**
     * Creates a tile object from a valid placement string
     *
     * @param tileString the placement string for the given tile
     * @author Brodie Osborne (u5828619)
     */
    public static Tile makeTileFromString(String tileString) {
        String tileID = "" + tileString.charAt(1) + tileString.charAt(2);
        char row = tileString.charAt(3);
        char col = tileString.charAt(4);
        int orient = Integer.parseInt(String.valueOf(tileString.charAt(5)));
        return new Tile(tileID, orient, col, row);
    }

    /**
     * Returns the connections for the tile in format "1234"
     * where:  and H stands for Highway, R for Railway and N for nothing/blank
     *      1
     *    2| |4
     *      3
     * @param id The ID of the Tile
     * @param r The rotation of the Tile
     * @author Jiamin Dai (u6801714) &  Brodie Osborne (u5828619)
     */
    private String getConnection(String id, int r) {
        String connection = "";
        switch (id) {
            case "S0":
                if (r == 0 || r == 4)
                    connection = "HHRH";
                else if (r == 1 || r == 5)
                    connection = "HRHH";
                else if (r == 2 || r == 6)
                    connection = "RHHH";
                else
                    connection = "HHHR";
                break;
            case "S1":
                if (r == '0' || r == '4')
                    connection = "HRRR";
                else if (r == '1' || r == '5')
                    connection = "RRRH";
                else if (r == '2' || r == '6')
                    connection = "RRHR";
                else
                    connection = "RHRR";
                break;
            case "S2":
                connection = "HHHH";
                break;
            case "S3":
                connection = "RRRR";
                break;
            case "S4":
                if (r == '0' || r == '7')
                    connection = "HHRR";
                else if (r == '1' || r == '4')
                    connection = "HRRH";
                else if (r == '2' || r == '5')
                    connection = "RRHH";
                else
                    connection = "RHHR";
                break;
            case "S5":
                if (r % 2 == 0)
                    connection = "HRHR";
                else
                    connection = "RHRH";
                break;
            case "A0":
                if (r == '0' || r == '7')
                    connection = "RRNN";
                else if (r == '1' || r == '4')
                    connection = "RNNR";
                else if (r == '2' || r == '5')
                    connection = "NNRR";
                else
                    connection = "NRRN";
                break;
            case "A1":
                if (r % 2 == 0)
                    connection = "RNRN";
                else
                    connection = "NRNR";
                break;
            case "A2":
                if (r == '0' || r == '6')
                    connection = "RNRR";
                else if (r == '1' || r == '7')
                    connection = "NRRR";
                else if (r == '2' || r == '4')
                    connection = "RRRN";
                else
                    connection = "RRNR";
                break;
            case "A3":
                if (r == '0' || r == '6')
                    connection = "HNHH";
                else if (r == '1' || r == '7')
                    connection = "NHHH";
                else if (r == '2' || r == '4')
                    connection = "HHHN";
                else
                    connection = "HHNH";
                break;
            case "A4":
                if (r % 2 == 0)
                    connection = "HNHN";
                else
                    connection = "NHNH";
                break;
            case "A5":
                if (r == '0' || r == '7')
                    connection = "HHNN";
                else if (r == '1' || r == '4')
                    connection = "HNNH";
                else if (r == '2' || r == '5')
                    connection = "NNHH";
                else
                    connection = "NHHN";
                break;
            case "B0":
                if (r == '0' || r == '4')
                    connection = "HNRN";
                else if (r == '1' || r == '5')
                    connection = "NRNH";
                else if (r == '2' || r == '6')
                    connection = "RNHN";
                else
                    connection = "NHNR";
                break;
            case "B1":
                if (r == '0')
                    connection = "HNNR";
                else if (r == '1')
                    connection = "NNRH";
                else if (r == '2')
                    connection = "NRHN";
                else if (r == '3')
                    connection = "RHNN";
                else if (r == '4')
                    connection = "HRNN";
                else if (r == '5')
                    connection = "RNNH";
                else if (r == '6')
                    connection = "NNHR";
                else
                    connection = "NHRN";
                break;
            case "B2":
                if (r % 2 == 0)
                    connection = "HRHR";
                else
                    connection = "RHRH";
                break;
        }
        return connection;
    }

    /**
     *@author Jiamin Dai(u6801714)
     */
    public static String tileReset(String t){
        char []t1=t.toCharArray();
        String str3="ABCD";
        if (t1[0]=='S')
            if (t1[1]=='0')
                if(t1[4]=='0'||t1[4]=='4')
                    str3="HHRH";
                else if (t1[4]=='1'||t1[4]=='5')
                    str3="HRHH";
                else if (t1[4]=='2'||t1[4]=='6')
                    str3="RHHH";
                else
                    str3="HHHR";
            else if (t1[1]=='1')
                if(t1[4]=='0'||t1[4]=='4')
                    str3="HRRR";
                else if (t1[4]=='1'||t1[4]=='5')
                    str3="RRRH";
                else if (t1[4]=='2'||t1[4]=='6')
                    str3="RRHR";
                else
                    str3="RHRR";
            else if (t1[1]=='2')
                str3="HHHH";
            else if (t1[1]=='3')
                str3="RRRR";
            else if (t1[1]=='4')
                if(t1[4]=='0'||t1[4]=='7')
                    str3="HHRR";
                else if (t1[4]=='1'||t1[4]=='4')
                    str3="HRRH";
                else if (t1[4]=='2'||t1[4]=='5')
                    str3="RRHH";
                else
                    str3="RHHR";
            else
            if(t1[4]%2==0)
                str3="HRHR";
            else
                str3="RHRH";
        else if(t1[0]=='A')
            if (t1[1]=='0')
                if(t1[4]=='0'||t1[4]=='7')
                    str3="RRNN";
                else if (t1[4]=='1'||t1[4]=='4')
                    str3="RNNR";
                else if (t1[4]=='2'||t1[4]=='5')
                    str3="NNRR";
                else
                    str3="NRRN";
            else if (t1[1]=='1')
                if (t1[4]%2==0)
                    str3="RNRN";
                else
                    str3="NRNR";
            else if (t1[1]=='2')
                if(t1[4]=='0'||t1[4]=='6')
                    str3="RNRR";
                else if (t1[4]=='1'||t1[4]=='7')
                    str3="NRRR";
                else if (t1[4]=='2'||t1[4]=='4')
                    str3="RRRN";
                else
                    str3="RRNR";
            else if (t1[1]=='3')
                if(t1[4]=='0'||t1[4]=='6')
                    str3="HNHH";
                else if (t1[4]=='1'||t1[4]=='7')
                    str3="NHHH";
                else if (t1[4]=='2'||t1[4]=='4')
                    str3="HHHN";
                else
                    str3="HHNH";
            else if (t1[1]=='4')
                if (t1[4]%2==0)
                    str3="HNHN";
                else
                    str3="NHNH";
            else
            if(t1[4]=='0'||t1[4]=='7')
                str3="HHNN";
            else if (t1[4]=='1'||t1[4]=='4')
                str3="HNNH";
            else if (t1[4]=='2'||t1[4]=='5')
                str3="NNHH";
            else
                str3="NHHN";
        else
        if (t1[1]=='0')
            if(t1[4]=='0'||t1[4]=='4')
                str3="HNRN";
            else if (t1[4]=='1'||t1[4]=='5')
                str3="NRNH";
            else if (t1[4]=='2'||t1[4]=='6')
                str3="RNHN";
            else
                str3="NHNR";
        else if(t1[1]=='2')
            if (t1[4]%2==0)
                str3="HRHR";
            else
                str3="RHRH";
        else
        if (t1[4]=='0')
            str3="HNNR";
        else if (t1[4]=='1')
            str3="NNRH";
        else if (t1[4]=='2')
            str3="NRHN";
        else if (t1[4]=='3')
            str3="RHNN";
        else if (t1[4]=='4')
            str3="HRNN";
        else if (t1[4]=='5')
            str3="RNNH";
        else if (t1[4]=='6')
            str3="NNHR";
        else
            str3="NHRN";
        return str3;

    }

    /**
     * Create a list of Neighbour coordinates (row,col)
     * @param row The row position of the tile
     * @param col the column position of the tile
     * @return points North, East, South, Wast "rc". If any point is FF means it doesn't exist.
     * @author Brodie Osborne (u5828619)
     */
    public List getNeighbours(char row, char col) {
        List<String> neighbours = new ArrayList<>();
//        Char N E S W and add them all together in the end
        String rows = "ABCDEFG";
        String cols = "0123456";
        String N = "FF";
        String E = "FF";
        String S = "FF";
        String W = "FF";

        //Work out North

        if (row != 'A') {
            char a = rows.charAt(rows.indexOf(row) - 1);
            N = "" + a + col;
        }

        //Work out East
        if (col != '6') {
            char b = cols.charAt(cols.indexOf(col) + 1);
            E = "" + row + b;
        }

        //Work out South
        if (row != 'G') {
            char c = rows.charAt(rows.indexOf(row) + 1);
            S = "" + c + col;
        }

        //Work out West
        if (col != '0') {
            char d = cols.charAt(cols.indexOf(col) - 1);
            W = "" + row + d;
        }
        neighbours.add(0, N);
        neighbours.add(1, E);
        neighbours.add(2, S);
        neighbours.add(3, W);
        return neighbours;
    }

    /**
     * Create the image view for tile
     * @param tile The tile object
     * @author Brodie Osborne (u5828619)
     */
    private static ImageView getImage(Tile tile) {
        Image originalImage = new Image("comp1110/ass2/gui/assets/" + tile.tileID + ".png");
        ImageView iv = new ImageView();
        iv.setImage(originalImage);
        iv.setFitHeight(100);
        iv.setFitWidth(100);
        return rotateImage(tile, iv);
    }

    /**
     * Determine the rotation that is required for the ImageView
     *
     * @param orientation the orientation
     * @author Brodie Osborne (u5828619)
     */
    private static int setRotation(int orientation) {
        int degree = 0;
        //If image is flipped, calculate new rotation to apply by subtracting 4
        if (orientation > 3) {
            orientation -= 4;
        }
        switch (orientation) {
            case 0:
                degree = 0;
                break;
            case 1:
                degree = 90;
                break;
            case 2:
                degree = 180;
                break;
            case 3:
                degree = 270;
                break;
        }
        return degree;
    }

    /**
     * Rotate or Flip the imageView
     *
     * @param iv the image view of the Tile
     * @author Brodie Osborne (u5828619)
     */
    private static ImageView rotateImage(Tile tile, ImageView iv) {
        if (tile.rotation > 3) {
            iv.setScaleX(-1);
        }
        iv.setRotate(iv.getRotate() + setRotation(tile.rotation));
        iv.setX(Board.getOffset(tile.column) + Viewer.horizontalOffset);
        iv.setY(Board.getOffset(tile.row) + Viewer.verticalOffset);

        //B0A53B0A64
        //A5A00A5A11A5A22A5A33A5A44A5A55A5A66A5A77
        return iv;
    }

    /**generate tile id to get image,use generatediceroll
     * @author u6801714 Jiamin Dai**/

    public static ArrayList<String> generateTile(String d){
        ArrayList<String> image=new ArrayList<>();
        char[] str=new char[2];
        for (int i=0;i<d.length()-1;i=i+2){
            str[0]=d.charAt(i);
            str[1]=d.charAt(i+1);
            image.add(String.valueOf(str));
        }
        return image;
    }

    public static ArrayList<String> generateboard(String b){
        ArrayList<String> image=new ArrayList<>();
        char[] str=new char[2];
        for (int i=0;i<b.length()-1;i=i+5){
            str[0]=b.charAt(i+2);
            str[1]=b.charAt(i+3);
            image.add(String.valueOf(str));
        }
        return image;
    }


    public static ImageView rotateImageinDice(String assets,int line){
        Image originalImage = new Image("comp1110/ass2/gui/assets/" + assets + ".png");
        ImageView iv=new ImageView();
        iv.setImage(originalImage);
        iv.setFitHeight(100);
        iv.setFitWidth(100);
        iv.setX(20);
        iv.setY(line);
        return iv;
    }

    public static Group specialtile(){
        Group image=new Group();
        for (int i=0;i<6;i++){
            Image originalImage = new Image("comp1110/ass2/gui/assets/S" + i+ ".png");
            ImageView iv=new ImageView();
            iv.setImage(originalImage);
            iv.setFitHeight(100);
            iv.setFitWidth(100);
            iv.setX(890);
            iv.setY(10+110*i);
            image.getChildren().add(iv);
        }
        return image;
    }

    public static ImageView setspecialtile(String s,double x,double y,int sum){
        Image originalImage = new Image("comp1110/ass2/gui/assets/" + s+ ".png");
        ImageView iv=new ImageView();
        iv.setImage(originalImage);
        iv.setFitHeight(100);
        iv.setFitWidth(100);
        iv.setX(x-50);
        iv.setY(y-50);
        iv.setRotate(90*sum);
        return iv;
    }

}
