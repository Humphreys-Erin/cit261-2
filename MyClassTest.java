/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author woo13
 */
public class MyClassTest {
    MyClass my;
    public MyClassTest() {
    }
    
    @Before
    public void setUp() {
        my = new MyClass();
    }
    
    @After
    public void tearDown() {
        my = null;
    }

    @Test
    public void testadd() {
        int a=20,b=0,c;
        c = my.add(a, b);
        assertEquals(40,c);
    }
    
}
