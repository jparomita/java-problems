/*Name: Paromita Ghosh
  Date:16.05.2021
  Problem:return false if Hashmap contains duplicate value
          if map is empty,then map is considered to be unique and return true*/

package com.programme;
import java.util.HashMap;
import java.util.HashSet;

public class Unique {

    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<>();
            map.put("Marty", "Stepp");
            map.put("Stuart", "Reges");
            map.put("Jessica", "Miller");
            map.put("Amanda", "Camp");
            map.put("Hal", "Perkins");

            boolean result = isUnique(map);
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("Unknown error occured....");
        }
    }

    private static boolean isUnique(HashMap<String,String> map){

        boolean result=false;
        HashSet<String> set=new HashSet<>(map.values());     // add all values of map to the hashset

        try {
            if (map.values().size() != set.size()) {         // hashset doesnot allow duplicate value so compare their size
                result = false;
            } else {
                result = true;
            }
        }
        catch (NullPointerException np){
            System.out.println(np);
        }catch(Exception e){
            System.out.println("Unknown error occured...");
        }

    return result;
    }
}
