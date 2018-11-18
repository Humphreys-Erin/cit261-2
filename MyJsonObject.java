/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author woo13
 */
import org.json.simple.JSONObject;
 
public class MyJsonObject {
    public static void main(String args[]) {
        
        //create JSON object
        JSONObject obj=new JSONObject();
        
        //encode object
        obj.put("name","Joshua Humphreys");
        obj.put("age", 15);
        
        
        //eecode JSON Object
        System.out.println("Name: "+obj.get("name"));
        System.out.println("Age: "+obj.get("age"));
    }
}