import java.util.Scanner;

public class homework1{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi=input.nextInt();
        for (int i = 1; i <sayi; i++) {
            if((i%3==0)&&(i%5==0)){
            System.out.print("fizz");}
            else if(i%5==0){
            System.out.print("buzz");}
            else if(i%3==0){
            System.out.print(i+"fizzbuzz");




        }

    }

    }}
