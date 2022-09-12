/*
Write a method priceIsRight that accepts an array of integers bids and an integer price as parameters. 
The method returns the element in the bids array that is closest in value to price without being larger than price. 
For example, if bids stores the elements {200, 300, 250, 999, 40}, then priceIsRight(bids, 280) should return 250, since 250 is the bid closest to 280 without going over 280. 
If all bids are larger than price, then your method should return -1.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class priceIsRight{

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("how many number you want to enter:");

        try {
            int length = input.nextInt();
            int[] numbers = new int[length];
            if (length > 0) {

                for (int i = 0; i < length; i++) {

                    System.out.println("Enter " + (i + 1) + " no number:");
                    numbers[i] = input.nextInt();

                    if (numbers[i] < 0) {
                        System.out.println("you can not enter negative value");
                        break;
                    }

                    if(i==length-1) {
                        System.out.println("Enter a price:");
                        int price = input.nextInt();
                        if(price<0){
                            System.out.println("you cannot enter a negative price");
                            break;
                        }else {
                            int max = priceIsRight(numbers, price);
                            System.out.println("closest value from price:" + max);
                        }
                    }
                }
            } else {
                System.out.println("you must enter one element");
            }
        }catch (InputMismatchException ie){
            System.out.println("Enter wrong input: "+ie);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private  static int priceIsRight(int[] bids, int price){

        int max = -1;
        try {

            for (int i = 0; i < bids.length; i++) {

                if (price >= bids[i]) {

                    if (max <= bids[i]) {

                        max = bids[i];
                    }
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }

        return max;
    }
}
