import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner isim=new Scanner(System.in);
        System.out.println("ismi girin");
        String ad=isim.next();
        String a="You can do it !";
        String b=a.replace("!",ad+" good man");
        System.out.println(b);

    }
}
