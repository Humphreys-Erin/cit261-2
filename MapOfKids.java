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
        Map<Integer, String> kidMap = new HashMap<>();
            kidMap.put(1, "Josh");
            kidMap.put(2, "Zach");
            kidMap.put(3, "Allie");
            kidMap.put(4, "Miley");
            kidMap.put(5, "Charley");
            kidMap.put(6, "Kimmie");
            kidMap.put(7, "Jarom");
            
        System.out.println(kidMap.get((5)));
    }
    
}
