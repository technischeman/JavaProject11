import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi=input.nextInt();
        //char[]sayi1=
        String sayistr=Integer.toString(sayi);


        for (int i =sayistr.length()-1; i>=0; i--) {
            System.out.print(i);

        }
    }
}
