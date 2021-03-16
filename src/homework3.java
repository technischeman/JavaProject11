public class homework3 {
    public static void main(String[] args) {
        //The following equation is used to calculate
        // the Fahrenheit value: 9/5 * celsius + 32
        fahrcal(200);
        fahrcal(100);
        System.out.println(fahrcal(100));


    }public static float fahrcal(float calcius){
        float fahren=0;
        fahren=calcius*9/5+32;
        //System.out.println("temp fahrenheit="+fahren);

return fahren;
    }
}