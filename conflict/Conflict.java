package conflict;

public class Conflict {

    public static Integer getLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        String s1 = "hello world";
        System.out.println("hello world's length: " + getLength(s1));
    }
}