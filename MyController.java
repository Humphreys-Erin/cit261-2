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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyController {

    // Reference to the view and the model
    private MyModel myModel;
    private MyView myView;

    // Constructor
    public MyController (MyModel myModel, MyView myView) {
        this.myModel = myModel;
        this.myView = myView;
    }

    // Method run
    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String exit = reader.readLine().toLowerCase();
            if (exit.equals("exit")) {
                break;
            }
            int age = Integer.parseInt(exit);
            int number = age;
  
            number = myModel.yourAge();
            myView.printNum(age);
            myView.printText2();
        }
    }

}