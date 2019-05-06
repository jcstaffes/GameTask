package comp1110.ass2;

import org.junit.Test;

import java.util.ArrayList;

import static comp1110.ass2.RailroadInk.isTilePlacementWellFormed;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TileTest {
    /**
     * @author u6801714 Jiamin Dai
     **/

    static final String testString1="B1A3A0A3";
    static final String testString2=null;
    static final String testString3="A4A12B2B16A1B01A1B23S1B32A1A32B1B44B2A44A4C16A3D15A4D01A5D23A4E20B1F24A2F17A1F01B0G16A5C34A4C43A5C53A3D50A4D61S4E50A0F51A1F67S2E46B1E31A1F30A2G36A1G41B1G52";
    static final String[] testString4={"A4A10","A3B10","A4B21","A0C24","S5E46"};
    static final String[] testString5={"HNHN","HNHH","NHNH","RNNR","HRHR"};
    @Test
    public void generateTileTestLength(){
        ArrayList<String> str=new ArrayList<>();
        str=Tile.generateTile(testString1);
        int sum=0;
        for (String sum1:str){
            sum++;
        }
        assertFalse("The length of gererateTile is not equal to the image number,expect:4,outcome:"+sum,sum!=4);
        assertTrue(sum==4);
    }

    @Test
    public void generateTileTestNull(){
        assertFalse("expect:null,outcome:"+testString2,testString2!=null);
        assertTrue(testString2==null);
    }

    @Test
    public void generateTileTestSame(){
        ArrayList<String> str=new ArrayList<>();
        str=Tile.generateTile(testString1);
        assertFalse("expect:B1,A3,A0,A3  outcome:"+str.get(0)+","+str.get(1)+","+str.get(2)+","+str.get(3),!str.get(0).equals("B1")||!str.get(1).equals("A3")||!str.get(2).equals("A0")||!str.get(3).equals("A3"));
        assertTrue(str.get(0).equals("B1")&&str.get(1).equals("A3")&&str.get(2).equals("A0")&&str.get(3).equals("A3"));
    }

    @Test
    public void isTilesinBoardareWellformed(){
        int size = testString3.length()/5;
        for (int i = 0;i<size;i++) {
            String tile = testString3.substring((0 + i * 5), (5 + i * 5));
            assertFalse("The tile in board string not wellformed,"+tile+"is wrong",!RailroadInk.isTilePlacementWellFormed(tile));
            assertTrue(RailroadInk.isTilePlacementWellFormed(tile));
        }
    }

    @Test
    public void TileResetTest(){
        for (int i=0;i<testString4.length;i++){
            assertFalse("Expect:"+testString5[i]+" Outcome:"+Tile.tileReset(testString4[i]),!Tile.tileReset(testString4[i]).equals(testString5[i]));
            assertTrue(Tile.tileReset(testString4[i]).equals(testString5[i]));
        }

    }
}
