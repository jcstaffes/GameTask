package comp1110.ass2;

import org.junit.Test;

import static org.junit.Assert.*;

public class JesseTest {

    @Test
    public void isBoardStringWellFormed() {
        for (String test: TestString1){
            assertTrue(test+" is well formed but failed.",RailroadInk.isBoardStringWellFormed(test));
        }
    }

    @Test
    public void isValidPlacementSequence() {
        assertTrue("Placement Sequence of "+ TestString2[0] +" is valid but failed.",RailroadInk.isValidPlacementSequence(TestString2[0]));
        assertFalse("Placement Sequence of "+ TestString2[1] +" is not valid but passed.",RailroadInk.isValidPlacementSequence(TestString2[1]));
    }

    @Test
    public void getBasicScore() {
        assertTrue("expected score of "+TestString1[0]+" is 6 but get "+RailroadInk.getBasicScore(TestString1[0]),RailroadInk.getBasicScore(TestString1[0])==6);
        assertTrue("expected score of "+TestString1[1]+" is 7 but get "+RailroadInk.getBasicScore(TestString1[1]),RailroadInk.getBasicScore(TestString1[1])==7);
    }

    @Test
    public void testNull(){
        String test = null;
        assertFalse("BoardString "+ test +" is not well formed but passed.",RailroadInk.isBoardStringWellFormed(test));
        assertTrue("Placement Sequence of "+ test +" is valid but failed.",RailroadInk.isValidPlacementSequence(test));
        assertTrue("expected score of "+test+"is 0 but get "+ RailroadInk.getBasicScore(test),RailroadInk.getBasicScore(test)==0);
    }

    static final String[] TestString1 = {
            "A4A12B2B16A1B01A1B23S1B32A1A32B1B44B2A44A4C16A3D15A4D01A5D23A4E20B1F24A2F17A1F01B0G16A5C34A4C43A5C53A3D50A4D61S4E50A0F51A1F67S2E46B1E31A1F30A2G36A1G41B1G52",
            "A3D61A3D53B0C52A0B52A2B63A4D41B0E60A0F61A3D31A3D23A2G30B0F34A3E32A1B01B2B10A1B21A0A63A4D01A1G41B0G12S2D10A4C10B2A10A2B33B0A30S4E11A4E21A3C21A3C31S5F11"
    };

    static final String[] TestString2 = {
            "A4A50A4G12B2G54A1G36",
            "A3A10A3A52A3G10B2F10S1B50A2B61A0C60A1B41B1A35A4A41S5B34A1C30B0D32A2C50A4E10A3D12B2B10A2F01A0G00A4D01B1A27S3B20A4C10A1D50A0F23B2G25A3E30A4E41"
    };

}