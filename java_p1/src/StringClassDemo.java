public class StringClassDemo {
//    static String a = "Hello"; //defining the String Literal
//    static String b = "Hello"; //refers a to the b object rather than creating one more object separately.
    static String a=new String("hello2");
    static String b=new String("some random text");
    public static void main(String[] args){
        System.out.println(a);
        System.out.println(a.charAt(2));
        System.out.println(a.toUpperCase());
        System.out.println(b.indexOf("o"));
        System.out.println(b.substring(3, 6));
        System.out.println(b.substring(3));

    }
}
