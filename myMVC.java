/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMVC;

/**
 *
 * @author woo13
 */
import java.io.IOException;

public class myMVC {

    public static void main(String[] args) throws IOException {
        // model
        MyModel myModel = new MyModel();
        // view
        MyView myView = new MyView(myModel);
        // Pass to Controller
        new MyController(myModel, myView).run();

       
    }

}