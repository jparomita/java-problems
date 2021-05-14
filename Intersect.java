/*Name: Paromita Ghosh
  Date:14.05.2021
  Problem:Add key and value to the new map if they are both same in first and second map*/

package com.programme;
import java.util.HashMap;

public class Intersect {

    public static void main(String[] args) {

        HashMap<String, Integer> firstMap = new HashMap<>();
        firstMap.put("Janet", 87);
        firstMap.put("Logan", 62);
        firstMap.put("Whitaker", 46);
        firstMap.put("Alyssa", 100);
        firstMap.put("Stefanie", 80);
        firstMap.put("Jeff", 88);
        firstMap.put("Kim", 52);
        firstMap.put("Sylvia", 95);

        HashMap<String, Integer> secondMap = new HashMap<>();
        secondMap.put("Logan", 62);
        secondMap.put("Kim", 52);
        secondMap.put("Whitaker", 52);
        secondMap.put("Jeff", 88);
        secondMap.put("Stefanie", 80);
        secondMap.put("Brain", 60);
        secondMap.put("Lisa", 83);
        secondMap.put("Sylvia", 87);

        HashMap<String,Integer> modifiedMap=intersect(firstMap,secondMap);
        System.out.println(modifiedMap);
    }

    private static HashMap<String,Integer> intersect(HashMap<String,Integer> firstMap,HashMap<String,Integer> secondMap) {

        HashMap<String, Integer> modifiedMap = new HashMap<>();

        try {
            for (String key : firstMap.keySet()) {     //all key of first map

                int value = firstMap.get(key);           //all value of first map

                if (secondMap.containsKey(key) && (secondMap.containsValue(value))) {   //compare key and value with second map
                    modifiedMap.put(key, value);        // add to the modified map if it is similar
                }
            }
        }
        catch(NullPointerException np){
            System.out.println(np);
        }catch(Exception e){
            System.out.println("Unknown error occured...");
        }

    return modifiedMap;
    }
}
