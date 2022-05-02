public class FirstClass {
    static int a = 4;
    public void getData() {
        System.out.println("I'm in method first class");
    }
    public static void main(String[] args) {
        FirstClass fn = new FirstClass();
        fn.getData();
        SecondClass sn = new SecondClass();
        sn.setData();
//        System.out.println(fn.a);


    }

}
