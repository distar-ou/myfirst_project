package test2;

public class demo5 {
    public static void main(String[] args) {
        String regex1="0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex1));
    }
}
