/*Name: Paromita Ghosh
  Date:20.05.2021
  Problem:return the number of time the most frequently occuring value in ArrayList by using hashmap*/

package com.programme;
import java.util.*;
public class MaxOccurances {

    public static void main(String[] args) {

        try {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(1);
            list.add(2);
            list.add(2);
            list.add(2);
            list.add(2);

            int maxOccuranceValue = maxOccurance(list);
            System.out.println(maxOccuranceValue);
        }
        catch(Exception e){
            System.out.println("Unknown error occured...");
        }
    }

    private static int maxOccurance(ArrayList<Integer> list){

        HashMap<Integer,Integer> map=new HashMap<>();

        try {
            for (int key : list) {

                if (!map.containsKey(key)) {
                    map.put(key, 1);              // add value in hashmap as a key if the key is not present
                } else {
                    int value = map.get(key);
                    map.put(key, value + 1);      // if map contains the key then add 1 to the value each time
                }
            }

            int maxOccuranceValue = Integer.MIN_VALUE;

            if (map.size() == 0) {
                maxOccuranceValue = 0;              //return 0 if list size is 0
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxOccuranceValue) {             // find out the most frequently occuring value
                    maxOccuranceValue = entry.getValue();
                }
            }
            return maxOccuranceValue;
        }
        catch (NullPointerException np){
            System.out.println(np);
            return 0;
        }catch (Exception e){
            System.out.println("Unknown error occured...");
            return 0;
        }
    }
}
