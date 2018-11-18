/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author woo13
 */
public class SquareTest {
    
    public SquareTest() {
        
    }

    @Test
    public void testArea() {
        Square s = new Square(2);
        double expected = 4;
        double actual = s.area();
        assertEquals(expected, actual, 0.00001);
    }
    
    @Test
    public void testSetSideLength() { 
    
    }
}
