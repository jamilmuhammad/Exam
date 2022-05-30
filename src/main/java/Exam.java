import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exam {
    private static BufferedReader br = null;

    static int rangeNumberInput(Scanner sc){
        int output = 0;
        boolean is_valid = true;
        while (is_valid){
            if (!sc.hasNextInt() || !sc.hasNext()) {
                System.out.println("Hanya boleh memasukkan angka!");
                sc.nextLine();
            }else{
                output = sc.nextInt();
                if (output >= 1 && output <= 100){
                    is_valid = false;
                }else{
                    System.out.println("Angka yang dimasukkan hanya boleh antara 1-100!");
                }
            }
        }
        return output;

    }

    static void validationGrade(Integer number){

        if(number > 90){
            System.out.println("A");
        }else if(number > 80){
            System.out.println("B");
        }else if(number > 70){
            System.out.println("C");
        }else if(number > 60){
            System.out.println("D");
        }else{
            System.out.println("E");
        }

    }
    public static void main(String args[]) {

    boolean cek = true;
    Scanner input = new Scanner(System.in);
        while (cek) {
        br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Validate Grade by Input");

            int a, b;
            System.out.println("Input number to validate [1...100] :");

            a = rangeNumberInput(input);

            System.out.println("Validate Description Grade A > 90, Grade B > 80, Grade C > 70, Grade D > 60, Selain itu Grade E");

            validationGrade(a);

            System.out.print("Ingin coba lagi (Y/N) ? ");

            String coba = br.readLine();
            if (coba.equalsIgnoreCase("N"))
                cek = false;
            else if (coba.equalsIgnoreCase("Y"))
                cek = true;
            else
                System.exit(0);
        } catch (IOException ioe) {
            System.out.println("Error IOException");
        }
    }
    }
}
