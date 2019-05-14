package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import comp1110.ass2.Tile;
import comp1110.ass2.Board;
import comp1110.ass2.RailroadInk;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static comp1110.ass2.Board.getOffset;

/**
 * A very simple viewer for tile placements in the Railroad Ink game.
 * <p>
 * NOTE: This class is separate from your main game class.  This
 * class does not play a game, it just illustrates various tile placements.
 */
public class Viewer extends Application {
    /* board layout */
    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;
    public static int horizontalOffset = (VIEWER_WIDTH - 700) / 2;
    public static int verticalOffset = (VIEWER_HEIGHT - 700) / 2;
    public List<Tile> tileArray = new ArrayList<>();

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group controls = new Group();
    private final Group tiles = new Group();
    private final Group lines = new Group();
    private static Group tiledice=new Group();
    private static ImageView image=new ImageView();
    private static ArrayList<String> dice1=new ArrayList<>();
    private static Group newimagegroup=new Group();
    private static int sum=0;
    private static int sum1=0;
    private static int sum2=0;
    private static int sum3=0;
    TextField textField;


    //TODO PLACE THIS METHOD INTO RAILROADINK
    //	Break placement string into piece strings for use

    //Turns ABCDEFGHIJ into ['ABCDE','FGHIJ']
    public static List breakPlacementStringToPieces(String placement) {
        if (placement!=null) {
            int count = 0;
            int index = 0;
            int len = placement.length();
            List<String> pieces = new ArrayList<>();

            while (count <= (len - 1)) {
                pieces.add(index, (" " + placement.charAt(count) + placement.charAt(count + 1) + placement.charAt(count + 2) + placement.charAt(count + 3) + placement.charAt(count + 4)));
                count += 5;
                index += 1;
            }
            return pieces;
        }
        return null;
    }


    //Draw lines onto stage to create a grid
    private void drawGrid() {
        String grid = "12345678";

        for (int count = 0; count <= 7; count++) {
            char col = grid.charAt(count);

            Line line = new Line();
            line.setStartX(horizontalOffset + getOffset(col));
            line.setStartY(verticalOffset);
            line.setEndX(horizontalOffset + getOffset(col));
            line.setEndY(700.0f + verticalOffset);
            line.setFill(Color.PURPLE);
            lines.getChildren().add(line);
        }

        for (int count1 = 0; count1 <= 7; count1++) {
            char row = grid.charAt(count1);

            Line line = new Line();
            line.setStartX(horizontalOffset);
            line.setStartY(verticalOffset + getOffset(row));
            line.setEndX(700.0f + horizontalOffset);
            line.setEndY(verticalOffset + getOffset(row));
            line.setFill(Color.BLACK);
            lines.getChildren().add(line);
        }
    }

    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement A valid placement string
     */
//    the tile placement string: B0A53
//    tells us that the tile on die B face 0 is placed at grid A5 in orientation 3,
//    whereas S3G26 tells us Special tile 3 is placed at G2 in orientation 6
    private void makePlacement(String placement) {
        for (Object item : breakPlacementStringToPieces(placement)) {
            String piece = item.toString();
            Tile tile = Tile.makeTileFromString(piece);
            ImageView iv = tile.imgview;

            iv.setPreserveRatio(true);
            iv.setSmooth(true);

            tileArray.add(tile);
            tiles.getChildren().add(iv);
            System.out.println(tile.neighbourGrids);
        }
        root.getChildren().add(tiles);
        System.out.println(tileArray.get(0));
    }

    /**
     * Create a basic text field for input and a refresh button.
     */
    private void makeControls() {
        Label label1 = new Label("Placement:");
        textField = new TextField();
        textField.setPrefWidth(300);
        Button button = new Button("Refresh");
        button.setOnAction(e -> {
            tiles.getChildren().clear();
            root.getChildren().clear();
            root.getChildren().add(controls);
            root.getChildren().add(lines);
            System.out.println(textField.getText());
            makePlacement(textField.getText());
            textField.clear();
        });
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField, button);
        hb.setSpacing(10);
        hb.setLayoutX(horizontalOffset);
        hb.setLayoutY(VIEWER_HEIGHT - 27);
        hb.setPrefWidth(700);
        controls.getChildren().add(hb);
    }

    private void initilisehandlers(Scene scene) {
        /* create handlers for key  */
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ESCAPE) {
                tiles.getChildren().clear();
                root.getChildren().clear();
                root.getChildren().add(controls);
                root.getChildren().add(tiledice);
                root.getChildren().add(lines);

                event.consume();
            }
        });
    }

    //A4A12B2B16A1B01A1B23S1B32A1A32B1B44B2A44A4C16A3D15A4D01A5D23A4E20B1F24A2F17A1F01B0G16A5C34A4C43A5C53A3D50A4D61S4E50A0F51A1F67S2E46B1E31A1F30A2G36A1G41B1G52
    //Test data to enter

    /**click the image and rotate the image
     * @author u6801714 Jiamin Dai
     * **/

    public void collectimage1(){
//        Image c1 = new Image("comp1110/ass2/gui/assets/" + array.get(0) + ".png");
//        Image c2 = new Image("comp1110/ass2/gui/assets/" + array.get(1) + ".png");
//        Image c3 = new Image("comp1110/ass2/gui/assets/" + array.get(2) + ".png");
//        Image c4 = new Image("comp1110/ass2/gui/assets/" + array.get(3) + ".png");
//        Image s1 = new Image("comp1110/ass2/gui/assets/S" + 1+ ".png");
//        Image s2 = new Image("comp1110/ass2/gui/assets/S" + 2+ ".png");
//        Image s3 = new Image("comp1110/ass2/gui/assets/S" + 3+ ".png");
//        Image s4 = new Image("comp1110/ass2/gui/assets/S" + 4+ ".png");
//        Image s5 = new Image("comp1110/ass2/gui/assets/S" + 5+ ".png");
//        Image s0 = new Image("comp1110/ass2/gui/assets/S" + 6+ ".png");
        tiledice.getChildren().get(0).setOnDragDone(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent dragEvent) {

            }
        });


    }

    private void rotateimage(){
        Button btn1=new Button("rotate");
        btn1.setLayoutX(120);
        btn1.setLayoutY(120);
        btn1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent MouseEvent) {
                Node a=tiledice.getChildren().get(1);
                Node b=tiledice.getChildren().get(2);
                Node c=tiledice.getChildren().get(3);
                tiledice.getChildren().clear();
                ImageView image=Tile.rotateImageinDice(dice1.get(0),100);
                image.setRotate(90+90*sum);
                sum++;
                tiledice.getChildren().add(image);
                tiledice.getChildren().add(a);
                tiledice.getChildren().add(b);
                tiledice.getChildren().add(c);
                System.out.println('1');
            }
        });
        controls.getChildren().add(btn1);

        Button btn2=new Button("rotate");
        btn2.setLayoutX(120);
        btn2.setLayoutY(240);
        btn2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent MouseEvent) {
                Node a=tiledice.getChildren().get(0);
                Node b=tiledice.getChildren().get(2);
                Node c=tiledice.getChildren().get(3);
                tiledice.getChildren().clear();
                ImageView image=Tile.rotateImageinDice(dice1.get(1),210);
                image.setRotate(90+90*sum1);
                sum1++;
                tiledice.getChildren().add(a);
                tiledice.getChildren().add(image);
                tiledice.getChildren().add(b);
                tiledice.getChildren().add(c);
                System.out.println('2');
            }
        });
        controls.getChildren().add(btn2);

        Button btn3=new Button("rotate");
        btn3.setLayoutX(120);
        btn3.setLayoutY(360);
        btn3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent MouseEvent) {
                Node a=tiledice.getChildren().get(0);
                Node b=tiledice.getChildren().get(1);
                Node c=tiledice.getChildren().get(3);
                tiledice.getChildren().clear();
                ImageView image=Tile.rotateImageinDice(dice1.get(2),320);
                image.setRotate(90+90*sum2);
                sum2++;
                tiledice.getChildren().add(a);
                tiledice.getChildren().add(b);
                tiledice.getChildren().add(image);
                tiledice.getChildren().add(c);
                System.out.println('3');
            }
        });
        controls.getChildren().add(btn3);

        Button btn4=new Button("rotate");
        btn4.setLayoutX(120);
        btn4.setLayoutY(480);
        btn4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent MouseEvent) {
                Node a=tiledice.getChildren().get(0);
                Node b=tiledice.getChildren().get(1);
                Node c=tiledice.getChildren().get(2);
                tiledice.getChildren().clear();
                ImageView image=Tile.rotateImageinDice(dice1.get(3),430);
                image.setRotate(90+90*sum3);
                sum3++;
                tiledice.getChildren().add(a);
                tiledice.getChildren().add(b);
                tiledice.getChildren().add(c);
                tiledice.getChildren().add(image);
                System.out.println('4');
            }
        });
        controls.getChildren().add(btn4);
    }

    private void ClickDice(){
        /**@author u6801714 Jiamin Dai
        //         * add button
        //         * **/
        Button btn = new Button("Dice");
        btn.setLayoutX(50);
        btn.setLayoutY(50);
        root.getChildren().add(tiledice);
        root.getChildren().add(Tile.specialtile());
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tiledice.getChildren().clear();
                ArrayList<String> dice=new ArrayList<>();
                dice=Tile.generateTile(RailroadInk.generateDiceRoll());
                dice1=dice;
                System.out.println(dice);
                for (int i=0;i<4;i++){
                    tiledice.getChildren().add(Tile.rotateImageinDice(dice.get(i),100+110*i));
                }
                rotateimage();
            }
        });

        controls.getChildren().add(btn);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("StepsGame Viewer");
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
        ClickDice();

        root.getChildren().add(controls);

        makeControls();

        //Draw board grid
        drawGrid();
        root.getChildren().add(lines);

        //Initialise handlers
        initilisehandlers(scene);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
