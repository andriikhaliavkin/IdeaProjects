public class StringClassDemo {
    static String a = "Hello"; //defining the String Literal
    static String b = "Hello"; //refers a to the b object rather than creating one more object separately.
    public static void main(String[] args){
        System.out.println(b);
    }
}
