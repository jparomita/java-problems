/*
Write a method named swapPairs that accepts an array of strings as a parameter and switches the order of values in a pairwise fashion. Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on. For example, if the array initially stores these values:

      
String[] a = {"four", "score", "and", "seven", "years", "ago"};
swapPairs(a);
Your method should switch the first pair ("four", "score"), the second pair ("and", "seven") and the third pair ("years", "ago"), to yield this array:

{"score", "four", "seven", "and", "ago", "years"}
*/

import java.util.ArrayList;

public class SwapPairs {

    public static void main(String[] args) {

        ArrayList<String> elements = new ArrayList<>();
        elements.add("four");
        elements.add("score");
        elements.add("and");
        elements.add("seven");
        elements.add("years");
        elements.add("ago");

        swapPairs(elements);
    }
        private static void swapPairs(ArrayList<String> elements){

        for(int i=1;i<elements.size();i=i+2){

            elements.add(i-1,elements.get(i));

            elements.remove(i+1);

        }

        System.out.println(elements);
    }
}
