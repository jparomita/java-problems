/*Name:paromita ghosh
  date:11.05.2021
  Problem:Remove shorter String from each successive pair of arrayList
          if there is a tie ,remove the first String in the pair
          if size of the string is odd number,then final value should be kept in list*/

import java.util.*;

public class ShorterString {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        try {
            System.out.println("Please enter the size of ArrayList:");
            int size = input.nextInt();
            input.nextLine();
            System.out.println("Please enter " + size + " word");

            ArrayList<String> wordList = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                String word = input.nextLine();
                wordList.add(word);                //add element in list
            }
            System.out.println("Original word list:" + wordList);

            removeShorterStrings(wordList);
        }
        catch(InputMismatchException mx){
            System.out.println("Invalid input...");
        }catch (IndexOutOfBoundsException io){
            System.out.println(io);
        }catch (Exception e){
            System.out.println("Unknown error occured....");
        }
    }

    private static void removeShorterStrings(ArrayList<String> wordsList){

        try {
            for (int i = 0; i < wordsList.size() - 1; i++){

                if (wordsList.get(i).length() <= wordsList.get(i + 1).length()) {         // Compare individual length of string in pair
                    wordsList.remove(i);          //remove the shorter String
                } else {
                    wordsList.remove(i + 1);
                }
            }
            System.out.println("Modified world list:" + wordsList);
        }
        catch (IndexOutOfBoundsException io){
            System.out.println(io);
        }catch (Exception e){
            System.out.println("Unknown error occured...");
        }
    }
}