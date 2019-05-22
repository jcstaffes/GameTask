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
import javafx.scene.input.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Screen;
import javafx.stage.Stage;
import comp1110.ass2.Tile;
import comp1110.ass2.Board;
import comp1110.ass2.RailroadInk;
import javafx.stage.Window;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static comp1110.ass2.Board.getOffset;
import static comp1110.ass2.Board.getboardplace;

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
    private static Group boardtile=new Group();
    public static Group specialtile=new Group();
    private static ArrayList<String> tilestring=new ArrayList<>();
    private static ArrayList<String> boardstring=new ArrayList<>();
    private static ArrayList<String> d=new ArrayList<>();
    private static int sum=0;
    private static int sum1=0;
    private static int sum2=0;
    private static int sum3=0;
    private static int sum4=0;
    private static int sum5=0;
    private static int sum6=0;
    private static int sum7=0;
    private static int sum8=0;
    private static int round=0;
    private static int sum9=0;
    private static int sum10=0;
    private static int sum11=0;
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
                pieces.add(index, ("" + placement.charAt(count) + placement.charAt(count + 1) + placement.charAt(count + 2) + placement.charAt(count + 3) + placement.charAt(count + 4)));
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

    public void exit(){
        Image image=new Image("comp1110/ass2/gui/assets/HighExit.png");
        Image image1=new Image("comp1110/ass2/gui/assets/RailExit.png");
        root.getChildren().add(Board.setexit(image,image1));
    }


    public double setonboardx(double location){
        int x=(int)((location-horizontalOffset)/100);
        double setX=horizontalOffset+x*100+50;
        return setX;
    }

    public double setonboardy(double location){
        int y=(int)((location-verticalOffset)/100);
        double setY=verticalOffset+y*100+50;
        return setY;
    }

    public void setBoardtile(String tile,double x,double y,int s){
        Image originalImage = new Image("comp1110/ass2/gui/assets/" + tile + ".png");
        ImageView iv=new ImageView();
        iv.setImage(originalImage);
        iv.setFitHeight(100);
        iv.setFitWidth(100);
        iv.setX(x-50);
        iv.setY(y-50);
        iv.setRotate(90*s);
        boardtile.getChildren().add(iv);
    }


    public void clickdropanddrag(){
        tiledice.getChildren().get(0).setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                tiledice.getChildren().get(0).setOnMouseReleased(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        setBoardtile(d.get(0),setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum);
                        tilestring.add(d.get(0));
                        tilestring.add(Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY())));
                        tilestring.add(String.valueOf(sum%8));
                        boardstring.add(tilestring.toString());
                        tilestring.clear();
                        tiledice.getChildren().remove(0);
                        tiledice.getChildren().add(0,Board.coverthetile(20,100));
                    }
                });
            }
        });

        tiledice.getChildren().get(1).setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                tiledice.getChildren().get(1).setOnMouseReleased(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        setBoardtile(d.get(1),setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum1);
                        tilestring.add(d.get(1));
                        tilestring.add(Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY())));
                        tilestring.add(String.valueOf(sum1%8));
                        boardstring.add(tilestring.toString());
                        tilestring.clear();
                        tiledice.getChildren().remove(1);
                        tiledice.getChildren().add(1,Board.coverthetile(20,210));
                    }
                });
            }
        });

        tiledice.getChildren().get(2).setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                tiledice.getChildren().get(2).setOnMouseReleased(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        setBoardtile(d.get(2),setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum2);
                        tilestring.add(d.get(2));
                        tilestring.add(Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY())));
                        tilestring.add(String.valueOf(sum2%8));
                        boardstring.add(tilestring.toString());
                        tilestring.clear();
                        tiledice.getChildren().remove(2);
                        tiledice.getChildren().add(2,Board.coverthetile(20,320));
                    }
                });
            }
        });

        tiledice.getChildren().get(3).setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                tiledice.getChildren().get(3).setOnMouseReleased(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        setBoardtile(d.get(3),setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum3);
                        tilestring.add(d.get(3));
                        tilestring.add(Board.getboardplace(setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY())));
                        tilestring.add(String.valueOf(sum3%8));
                        boardstring.add(tilestring.toString());
                        tilestring.clear();
                        tiledice.getChildren().remove(3);
                        tiledice.getChildren().add(3,Board.coverthetile(20,430));
                    }
                });
            }
        });


    }

    public void clickanddrop1(){
        specialtile.getChildren().get(0).setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                specialtile.getChildren().get(0).setOnMouseReleased(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        boardtile.getChildren().add(Tile.setspecialtile("S0",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum4));
                        savetileandboard("S0",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum4);
                        specialtile.getChildren().remove(0);
                        specialtile.getChildren().add(0,Board.coverthetile(890,10));
                    }
                });
            }
        });

        specialtile.getChildren().get(1).setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                specialtile.getChildren().get(1).setOnMouseReleased(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        boardtile.getChildren().add(Tile.setspecialtile("S1",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum5));
                        savetileandboard("S1",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum5);
                        specialtile.getChildren().remove(1);
                        specialtile.getChildren().add(1,Board.coverthetile(890,120));
                    }
                });
            }
        });

        specialtile.getChildren().get(2).setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                specialtile.getChildren().get(2).setOnMouseReleased(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        boardtile.getChildren().add(Tile.setspecialtile("S2",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum6));
                        savetileandboard("S2",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum6);
                        specialtile.getChildren().remove(2);
                        specialtile.getChildren().add(2,Board.coverthetile(890,230));
                    }
                });
            }
        });

        specialtile.getChildren().get(3).setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                specialtile.getChildren().get(3).setOnMouseReleased(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        boardtile.getChildren().add(Tile.setspecialtile("S3",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum7));
                        savetileandboard("S3",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum7);
                        specialtile.getChildren().remove(3);
                        specialtile.getChildren().add(3,Board.coverthetile(890,340));
                    }
                });
            }
        });

        specialtile.getChildren().get(4).setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                specialtile.getChildren().get(4).setOnMouseReleased(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        boardtile.getChildren().add(Tile.setspecialtile("S4",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum8));
                        savetileandboard("S4",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum8);
                        specialtile.getChildren().remove(4);
                        specialtile.getChildren().add(4,Board.coverthetile(890,450));
                    }
                });
            }
        });

        specialtile.getChildren().get(5).setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                specialtile.getChildren().get(5).setOnMouseReleased(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        boardtile.getChildren().add(Tile.setspecialtile("S5",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum9));
                        savetileandboard("S5",setonboardx(mouseEvent.getSceneX()),setonboardy(mouseEvent.getSceneY()),sum9);
                        specialtile.getChildren().remove(5);
                        specialtile.getChildren().add(5,Board.coverthetile(890,560));
                    }
                });
            }
        });
    }

    public void savetileandboard(String tile,double x,double y,int thesum){
        tilestring.add(tile);
        tilestring.add(Board.getboardplace(x,y));
        tilestring.add(String.valueOf(thesum%8));
        boardstring.add(tilestring.toString());
        System.out.println(boardstring);
        tilestring.clear();
        sum11++;
    }

    public void rotateimage(){
        /**@author Jiamin Dai u6801714
         * rotate image under dice**/
        tiledice.getChildren().get(0).setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent scrollEvent) {
                tiledice.getChildren().get(0).setRotate(90+90*sum);
                sum++;
                clickdropanddrag();
            }
        });

        tiledice.getChildren().get(1).setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent scrollEvent) {
                tiledice.getChildren().get(1).setRotate(90+90*sum1);
                sum1++;
            }
        });

        tiledice.getChildren().get(2).setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent scrollEvent) {
                tiledice.getChildren().get(2).setRotate(90+90*sum2);
                sum2++;
            }
        });

        tiledice.getChildren().get(3).setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent scrollEvent) {
                tiledice.getChildren().get(3).setRotate(90+90*sum3);
                sum3++;
            }
        });



    }
    public void rotateimage1(){
        specialtile.getChildren().get(0).setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent scrollEvent) {
                specialtile.getChildren().get(0).setRotate(90+90*sum4);
                sum4++;
            }
        });

        specialtile.getChildren().get(1).setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent scrollEvent) {
                specialtile.getChildren().get(1).setRotate(90+90*sum5);
                sum5++;
            }
        });

        specialtile.getChildren().get(2).setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent scrollEvent) {
                specialtile.getChildren().get(2).setRotate(90+90*sum6);
                sum6++;
            }
        });

        specialtile.getChildren().get(3).setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent scrollEvent) {
                specialtile.getChildren().get(3).setRotate(90+90*sum7);
                sum7++;
            }
        });

        specialtile.getChildren().get(4).setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent scrollEvent) {
                specialtile.getChildren().get(4).setRotate(90+90*sum8);
                sum8++;
            }
        });

        specialtile.getChildren().get(5).setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent scrollEvent) {
                specialtile.getChildren().get(5).setRotate(90+90*sum9);
                sum9++;
            }
        });
    }


    private void ClickDice(){
        /**@author u6801714 Jiamin Dai
        //         * add button
        //         * **/
        Button btn = new Button("Dice");
        btn.setLayoutX(50);
        btn.setLayoutY(50);
        specialtile=Tile.specialtile();
        root.getChildren().add(specialtile);
        root.getChildren().add(tiledice);
        Group text=new Group();
        Text r=new Text();
        Text score=new Text();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (sum11>=3)
                    Tile.specialtileblank();
                else{
                    rotateimage1();
                    clickanddrop1();
                }
                text.getChildren().clear();
                sum=0;
                sum1=0;
                sum2=0;
                sum3=0;
                tiledice.getChildren().clear();
                ArrayList<String> dice=new ArrayList<>();
                dice=Tile.generateTile(RailroadInk.generateDiceRoll());
                d=dice;
                System.out.println(dice);
                for (int i=0;i<4;i++){
                    tiledice.getChildren().add(Tile.rotateImageinDice(dice.get(i),100+110*i));
                }
                rotateimage();
                clickdropanddrag();
                round++;
                if (round<=7){
                    r.setText("Round:"+round);
                    r.setX(50);
                    r.setY(700);
                    text.getChildren().add(r);
                } else{
                    score.setText("Score:");
                    score.setX(50);
                    score.setY(720);
                    tiledice.getChildren().clear();
                }
            }
        });
        root.getChildren().add(score);
        root.getChildren().add(text);
        controls.getChildren().add(btn);
        root.getChildren().add(boardtile);
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
        exit();
        //Initialise handlers
        initilisehandlers(scene);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
