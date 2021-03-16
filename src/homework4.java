import java.sql.Array;

public class homework4 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};
        int n=numbers[numbers.length-1];
        int olmasigereken=n*(n+1)/2;
        System.out.println(olmasigereken);
        int toplam=0;
        for (int w:numbers ) {
            toplam+=w;

        }
        System.out.println("dizinin toplami"+toplam);
        System.out.println("dizinin toplami"+(olmasigereken-toplam));



    }
}
