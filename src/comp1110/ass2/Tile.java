package comp1110.ass2;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import comp1110.ass2.gui.Viewer;

public class Tile {
    public String tileID;
    public int rotation;
    public char column;
    public char row;
    public String connections;
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
        this.connections = getTile(tileID);
        this.imgview = getImage(this);
    }

    public static Tile makeTileFromString(String tileString){
        String tileID = "" + tileString.charAt(1) + tileString.charAt(2);
        char row = tileString.charAt(3);
        char col = tileString.charAt(4);
        int orient = Integer.parseInt(String.valueOf(tileString.charAt(5)));

        Tile tile = new Tile(tileID, orient, col, row);
        return tile;
    }

    /**
     * Returns the connections for the tile
     *
     * @author Jiamin Dai (u6801714)
     */
    public String getTile(String id) {
        char[] t1 = id.toCharArray();
        String str3 = "";
        if (t1[0] == 'S')
            if (t1[1] == '0')
                if (t1[4] == '0' || t1[4] == '4')
                    str3 = "HHRH";
                else if (t1[4] == '1' || t1[4] == '5')
                    str3 = "HRHH";
                else if (t1[4] == '2' || t1[4] == '6')
                    str3 = "RHHH";
                else
                    str3 = "HHHR";
            else if (t1[1] == '1')
                if (t1[4] == '0' || t1[4] == '4')
                    str3 = "HRRR";
                else if (t1[4] == '1' || t1[4] == '5')
                    str3 = "RRRH";
                else if (t1[4] == '2' || t1[4] == '6')
                    str3 = "RRHR";
                else
                    str3 = "RHRR";
            else if (t1[1] == '2')
                str3 = "HHHH";
            else if (t1[1] == '3')
                str3 = "RRRR";
            else if (t1[1] == '4')
                if (t1[4] == '0' || t1[4] == '7')
                    str3 = "HHRR";
                else if (t1[4] == '1' || t1[4] == '4')
                    str3 = "HRRH";
                else if (t1[4] == '2' || t1[4] == '5')
                    str3 = "RRHH";
                else
                    str3 = "RHHR";
            else if (t1[4] % 2 == 0)
                str3 = "HRHR";
            else
                str3 = "RHRH";
        else if (t1[0] == 'A')
            if (t1[1] == '0')
                if (t1[4] == '0' || t1[4] == '7')
                    str3 = "RRNN";
                else if (t1[4] == '1' || t1[4] == '4')
                    str3 = "RNNR";
                else if (t1[4] == '2' || t1[4] == '5')
                    str3 = "NNRR";
                else
                    str3 = "NRRN";
            else if (t1[1] == '1')
                if (t1[4] % 2 == 0)
                    str3 = "RNRN";
                else
                    str3 = "NRNR";
            else if (t1[1] == '2')
                if (t1[4] == '0' || t1[4] == '6')
                    str3 = "RNRR";
                else if (t1[4] == '1' || t1[4] == '7')
                    str3 = "NRRR";
                else if (t1[4] == '2' || t1[4] == '4')
                    str3 = "RRRN";
                else
                    str3 = "RRNR";
            else if (t1[1] == '3')
                if (t1[4] == '0' || t1[4] == '6')
                    str3 = "HNHH";
                else if (t1[4] == '1' || t1[4] == '7')
                    str3 = "NHHH";
                else if (t1[4] == '2' || t1[4] == '4')
                    str3 = "HHHN";
                else
                    str3 = "HHNH";
            else if (t1[1] == '4')
                if (t1[4] % 2 == 0)
                    str3 = "HNHN";
                else
                    str3 = "NHNH";
            else if (t1[4] == '0' || t1[4] == '7')
                str3 = "HHNN";
            else if (t1[4] == '1' || t1[4] == '4')
                str3 = "HNNH";
            else if (t1[4] == '2' || t1[4] == '5')
                str3 = "NNHH";
            else
                str3 = "NHHN";
        else if (t1[1] == '0')
            if (t1[4] == '0' || t1[4] == '4')
                str3 = "HNRN";
            else if (t1[4] == '1' || t1[4] == '5')
                str3 = "NRNH";
            else if (t1[4] == '2' || t1[4] == '6')
                str3 = "RNHN";
            else
                str3 = "NHNR";
        else if (t1[1] == '2')
            if (t1[4] % 2 == 0)
                str3 = "HRHR";
            else
                str3 = "RHRH";
        else if (t1[4] == '0')
            str3 = "HNNR";
        else if (t1[4] == '1')
            str3 = "NNRH";
        else if (t1[4] == '2')
            str3 = "NRHN";
        else if (t1[4] == '3')
            str3 = "RHNN";
        else if (t1[4] == '4')
            str3 = "HRNN";
        else if (t1[4] == '5')
            str3 = "RNNH";
        else if (t1[4] == '6')
            str3 = "NNHR";
        else
            str3 = "NHRN";
        return str3;
    }


    /**
     * Create the image view for tile
     *
     * @author Brodie Osborne (u5828619)
     */
    public static ImageView getImage(Tile tile) {
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

//            For DEBUGGING
//            System.out.println(iv.getX());
//            System.out.println(iv.getY());


        //B0A53B0A64
        //A5A00A5A11A5A22A5A33A5A44A5A55A5A66A5A77
        return iv;
    }


}
