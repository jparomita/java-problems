import java.util.*;

public class Interleave {

    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Integer> a=new ArrayList<>();

        try {

            System.out.println("Please enter the size of first arrayList:");
            int sizeOfa1 = input.nextInt();

            System.out.println("please enter the size of second arrayList:");
            int sizeOfa2 = input.nextInt();

            ArrayList<Integer> a1=creatArrayList(a,sizeOfa1);
            ArrayList<Integer> a2=creatArrayList(a,sizeOfa2);

            interLeave(a1,a2);
        }
        catch (InputMismatchException mx) {
            System.out.println("Invalid input...");
        }catch (Exception e){
            System.out.println("Unknown error occured...");
        }
    }

    public static ArrayList<Integer> creatArrayList(ArrayList<Integer> a,int sizeOfa1){

        ArrayList<Integer> a1 = new ArrayList<>();
        try {
            for (int i = 0; i < sizeOfa1; i++) {
                int randomNumber1 = (int) (Math.random() * 100);
                a1.add(randomNumber1);
            }
            System.out.println("First ArrayList:" + a1);
        }
        catch (IndexOutOfBoundsException io){
            System.out.println(io);
        }catch (Exception e){
            System.out.println("Unknown error occured..");
        }
        return a1;
    }

    public static void interLeave(ArrayList<Integer> a1,ArrayList<Integer> a2){

        try {
            for (int i = 0; i < a1.size(); i = i + 2) {
                if(a2.size()>=1) {
                    a1.add(i + 1, a2.get(0));         //add 1st element of 2nd arraylist in 1st arraylist
                    a2.remove(0);                     //remove 1st position of 2n list
                }
            }
        }
        catch (IndexOutOfBoundsException io){
            System.out.println(io);
        }catch(Exception e){
            System.out.println("Unknown error occured...");
        }
        a1.addAll(a2);    //add entra element of 2nd list if any

        System.out.println("Modified arrayList:"+a1);
    }
}