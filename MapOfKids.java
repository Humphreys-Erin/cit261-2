/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapofkids;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author woo13
 */
public class MapOfKids {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, String> dataMap = new HashMap<>();
            dataMap.put(1, "Josh");
            dataMap.put(2, "Zach");
            dataMap.put(3, "Allie");
            dataMap.put(4, "Miley");
            dataMap.put(5, "Charley");
            dataMap.put(6, "Kimmie");
            dataMap.put(7, "Jarom");
            
        System.out.println(dataMap.get((7)));
    }
    
}
