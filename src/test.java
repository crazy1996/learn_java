public class test {

    public static void main(String[] args) {
        String a="123aaa";
        String b="123aaa1";
        boolean abc;
        abc = a.equals(b);
        if(a.equals(b)){
            System.out.println("a==b");
        }else {
            System.out.println(a + " " + b);
        }
        System.out.println(abc);

    }
}