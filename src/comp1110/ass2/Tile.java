package comp1110.ass2;

import comp1110.ass2.gui.Game;
import javafx.scene.image.ImageView;

public class Tile {
    public String tileID;
    public int rotation;
    public char column;
    public char row;
    public ImageView imgview;


    /**
     * Constructor for a tile
     * @param tileID   This refers to the ID of the tile. Also refers to the X.png of the file name.
     * @param rotation This is the orientation of the tile. This is used in order to rotate the tile correctly.
     * @param column Refers to the column that the tile originates from.
     * @param row Refers to the row that the tile originates from.
     *
     * @author Brodie Osborne - u5828619
     */
    public Tile(String tileID, int rotation, char column, char row) {
        this.tileID = tileID;
        this.rotation = rotation;
        this.column = column;
        this.row = row;
        this.imgview = getImage(this);
    }


    /**
     * Create the image view for tile
     */
    public static ImageView getImage(Tile tile){
        //Get image from file, turn into imageview and return
        return null;
        }

    /**
     * Determine the rotation that is required for the ImageView
     * @param orientation the orientation
     */
    private static int setRotation(int orientation){
        //translates the rotation into an orientation in degrees
        return orientation;
    }

    /**
     * Rotate or Flip the imageView
     * @param iv the image view of the Tile
     */
    private static ImageView rotateImagee(Tile tile, ImageView iv){
        //Rotate image view
        //Flip if necessary

        return iv;
    }



}
