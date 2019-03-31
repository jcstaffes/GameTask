package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import comp1110.ass2.Tile;
import comp1110.ass2.Board;
import comp1110.ass2.RailroadInk;

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

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group controls = new Group();
    private final Group tiles = new Group();
    private final Group lines = new Group();
    TextField textField;


    //	Break placement string into piece strings for use
    private List breakPlacementStringToPieces(String placement) {
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
            String tileID = "" + piece.charAt(1) + piece.charAt(2);
            char row = piece.charAt(3);
            char col = piece.charAt(4);
            int orient = Integer.parseInt(String.valueOf(piece.charAt(5)));

            Tile tile = new Tile(tileID, orient, col, row);
            ImageView iv = tile.imgview;

            iv.setPreserveRatio(true);
            iv.setSmooth(true);

            tiles.getChildren().add(iv);
        }
        root.getChildren().add(tiles);
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
                root.getChildren().add(lines);
                event.consume();
            }
        });
    }

    //A4A12B2B16A1B01A1B23S1B32A1A32B1B44B2A44A4C16A3D15A4D01A5D23A4E20B1F24A2F17A1F01B0G16A5C34A4C43A5C53A3D50A4D61S4E50A0F51A1F67S2E46B1E31A1F30A2G36A1G41B1G52
    //Test data to enter

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("StepsGame Viewer");
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

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
