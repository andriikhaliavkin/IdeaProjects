public class StringClassDemo {
//    static String a = "Hello"; //defining the String Literal
//    static String b = "Hello"; //refers a to the b object rather than creating one more object separately.
    static String a=new String("hello2");
    static String b=new String("hello2");
    public static void main(String[] args){
        System.out.println(a);
        System.out.println(a.charAt(2));
        System.out.println(a.toUpperCase());
    }
}
