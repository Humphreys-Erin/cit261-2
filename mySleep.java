/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysleep;

public class mySleep {
    public static void main(String args[])
        throws InterruptedException {
        String myKids[] = {
            "Joshua",
            "Zachary",
            "Allie",
            "Miley",
            "Charley",
            "Kimmie",
            "Jarom"
        };

        for (int i = 0;
             i < myKids.length;
             i++) {
            //Pause for 2 seconds
            Thread.sleep(2000);
            //Print my kids
            System.out.println(myKids[i]);
        }
    }
}