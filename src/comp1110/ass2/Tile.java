package comp1110.ass2;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import comp1110.ass2.gui.Viewer;

public class Tile {
    public String tileID;
    public int rotation;
    public char column;
    public char row;
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
        this.imgview = getImage(this);
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
