/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.*;
import sample.Utils;

/**
 *
 * @author woo13
 */
public class UtilsTest {
    
    public UtilsTest() {
    }
    
    
    @Test
    public void testConcatWords() {
        System.out.println("UtilsTest: testConcatWords");
        assertEquals("RosesAreRed",Utils.concatWords("Roses","Are","Red"));
        
    }
    @Test
    public void MyCustomTest(){
        System.out.println("UtilsTest: MyCustomTest");
        assertEquals("RosesAreRed",Utils.concatWords("Roses","Are","Red"));
    }
    
    @Test(timeout=500) //test will fail if times out at 500ms
    public void testWithTimeout(){
        final int factorialOf = 1 + (int)(3000 * Math.random());
        System.out.println("UtilsTest: Computing" + factorialOf);
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
               
    }
    @Test(expected=IllegalArgumentException.class)
    public void checkExpectedException(){
        System.out.println("UtilsTest: checkExpectedException");
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }
    
    @Test
    public void AnotherCustomTest() throws Exception{
       System.out.println("UtilsTest: AnotherCustomTest"); 
       assertEquals("VioletsAreBlue","VioletsAreBlue");
    }
    
}
