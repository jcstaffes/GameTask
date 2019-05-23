package comp1110.ass2;

import com.sun.glass.ui.View;
import comp1110.ass2.gui.Viewer;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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

    public static ImageView coverthetile(double x,double y){
        Image image=new Image("comp1110/ass2/gui/assets/Blank.png");
        ImageView iv=new ImageView();
        iv.setFitWidth(100);
        iv.setFitHeight(100);
        iv.setX(x);
        iv.setY(y);
        return iv;
    }
    public static String getboardplace(double x,double y){
        char board1=0;
        int board2=0;
        double a=Viewer.horizontalOffset;
        double b=Viewer.verticalOffset;
        for (int i=0;i<7;i++){
            if (y==b+100*(i+1)-50)
                board1=(char)(65+i);
        }
        for (int i=0;i<7;i++){
            if (x==a+100*(i+1)-50)
                board2=i;
        }
        return String.valueOf(board1)+board2;
    }

    public static Group setexit(Image image,Image image1){
        Group addExit=new Group();

        ImageView iv=new ImageView();
        iv.setImage(image);
        iv.setFitHeight(100);
        iv.setFitWidth(100);
        iv.setX(Viewer.horizontalOffset+100);
        iv.setY(Viewer.verticalOffset-50);
        addExit.getChildren().add(iv);

        ImageView iv1=new ImageView();
        iv1.setImage(image1);
        iv1.setFitHeight(100);
        iv1.setFitWidth(100);
        iv1.setX(Viewer.horizontalOffset+300);
        iv1.setY(Viewer.verticalOffset-50);
        addExit.getChildren().add(iv1);

        ImageView iv2=new ImageView();
        iv2.setImage(image);
        iv2.setFitHeight(100);
        iv2.setFitWidth(100);
        iv2.setX(Viewer.horizontalOffset+500);
        iv2.setY(Viewer.verticalOffset-50);
        addExit.getChildren().add(iv2);

        ImageView iv3=new ImageView();
        iv3.setImage(image1);
        iv3.setFitHeight(100);
        iv3.setFitWidth(100);
        iv3.setX(Viewer.horizontalOffset-50);
        iv3.setY(Viewer.verticalOffset+100);
        iv3.setRotate(270);
        addExit.getChildren().add(iv3);


        ImageView iv4=new ImageView();
        iv4.setImage(image);
        iv4.setFitHeight(100);
        iv4.setFitWidth(100);
        iv4.setX(Viewer.horizontalOffset-50);
        iv4.setY(Viewer.verticalOffset+300);
        iv4.setRotate(270);
        addExit.getChildren().add(iv4);


        ImageView iv5=new ImageView();
        iv5.setImage(image1);
        iv5.setFitHeight(100);
        iv5.setFitWidth(100);
        iv5.setX(Viewer.horizontalOffset-50);
        iv5.setY(Viewer.verticalOffset+500);
        iv5.setRotate(270);
        addExit.getChildren().add(iv5);


        ImageView iv6=new ImageView();
        iv6.setImage(image);
        iv6.setFitHeight(100);
        iv6.setFitWidth(100);
        iv6.setX(Viewer.horizontalOffset+100);
        iv6.setY(Viewer.verticalOffset+650);
        iv6.setRotate(180);
        addExit.getChildren().add(iv6);


        ImageView iv7=new ImageView();
        iv7.setImage(image1);
        iv7.setFitHeight(100);
        iv7.setFitWidth(100);
        iv7.setX(Viewer.horizontalOffset+300);
        iv7.setY(Viewer.verticalOffset+650);
        iv7.setRotate(180);
        addExit.getChildren().add(iv7);


        ImageView iv8=new ImageView();
        iv8.setImage(image);
        iv8.setFitHeight(100);
        iv8.setFitWidth(100);
        iv8.setX(Viewer.horizontalOffset+500);
        iv8.setY(Viewer.verticalOffset+650);
        iv8.setRotate(180);
        addExit.getChildren().add(iv8);

        ImageView iv9=new ImageView();
        iv9.setImage(image1);
        iv9.setFitHeight(100);
        iv9.setFitWidth(100);
        iv9.setX(Viewer.horizontalOffset+650);
        iv9.setY(Viewer.verticalOffset+100);
        iv9.setRotate(90);
        addExit.getChildren().add(iv9);

        ImageView iv10=new ImageView();
        iv10.setImage(image1);
        iv10.setFitHeight(100);
        iv10.setFitWidth(100);
        iv10.setX(Viewer.horizontalOffset+650);
        iv10.setY(Viewer.verticalOffset+300);
        iv10.setRotate(90);
        addExit.getChildren().add(iv10);

        ImageView iv11=new ImageView();
        iv11.setImage(image1);
        iv11.setFitHeight(100);
        iv11.setFitWidth(100);
        iv11.setX(Viewer.horizontalOffset+650);
        iv11.setY(Viewer.verticalOffset+500);
        iv11.setRotate(90);
        addExit.getChildren().add(iv11);

        return addExit;
    }


}
