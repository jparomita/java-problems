import java.util.InputMismatchException;
import java.util.Scanner;

public class Cipher {
    private static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {

        boolean askAgain= false;
        String EncryptedMessage="";
        int rotation=0;
        String userChoice="";

        do {
            System.out.println("Enter a Message:");
            EncryptedMessage = input.nextLine();

            try {

                System.out.println("Enter the number of rotation"); //here we can get exception
                rotation = input.nextInt();
                input.nextLine();
                System.out.println("EncryptedMessage :"+EncryptedMessage);
                decryption(EncryptedMessage,rotation);

                System.out.println("do you want  to enter another message t/f");
                userChoice=input.nextLine();

                if(userChoice.equalsIgnoreCase("t")){
                    askAgain=true;
                }else{
                    askAgain=false;
                }

            }catch (InputMismatchException mx){
                System.out.println("Invalid input.....you should enter a number");
                input.nextLine();
                askAgain=true;
            }
        }while(askAgain);
    }

    private static void decryption(String EncryptedMessage,int rotation){

        String decryptedMessage="";

        for (int i = 0; i < EncryptedMessage.length(); i++) {

            try {
                int position = EncryptedMessage.charAt(i);   //convert char to ascii value

                if ((position >= 'A' && position <= 'Z') || (position >= 'a' && position <= 'z')) {

                    int originalPosition = position + rotation;  // to see original position >z or not

                    if (originalPosition > 'Z' && position >= 'A' && position <= 'Z') {

                        position = 64- ('Z' - EncryptedMessage.charAt(i));

                    } else if (originalPosition > 'z') {

                        position = 96 - ('z' - EncryptedMessage.charAt(i));

                    }
                    char ch = (char) (position + rotation);       //convert ascii value to char
                    decryptedMessage = decryptedMessage + ch;   //append char to string

                } else {
                    char ch = (char) position;
                    decryptedMessage = decryptedMessage + ch;
                }
            }catch (IndexOutOfBoundsException io){
                System.out.println(io);
            }catch (ArithmeticException ae){
                System.out.println(ae);
            }
        }
        System.out.println("DecryptedMessage :"+decryptedMessage);
    }
}
