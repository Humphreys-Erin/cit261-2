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
public class MyView {

    // Constructor
    public MyView(MyModel myModel) {
        printText();
    }

    // Method printText
    public void printText() {
        System.out.print("\nEnter your age: ");
    }

   

    // Method printNum
    public void printNum(int age) {
        System.out.println("\nYour age is: " + age + "\n");
    };
    
    //Method printText2
    public void printText2() {
        System.out.print("Enter \"exit\": ");
    }

}
