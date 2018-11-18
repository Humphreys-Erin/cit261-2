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
public class myMessageTest {
    
     String message = "Christmas is coming";	
        MyMessage myMessage = new MyMessage(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,myMessage.printMessage());
   }
}
