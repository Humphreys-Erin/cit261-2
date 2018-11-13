/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.*;
  
class myTreeSet { 
    public static void main(String[] args) 
    { 
        TreeSet<String> tree1 = new TreeSet<>(); 
  
        // Add elements
        tree1.add("Josh"); 
        tree1.add("Zach"); 
        tree1.add("Allie"); 
        tree1.add("Miley");
        tree1.add("Charley");
        tree1.add("Kimmie");
        tree1.add("Jarom");
  
        // will be sorted in ascending (alphabetical starting with A) order 
        System.out.println(tree1); 
    } 
} 