public class Conflict {

    public static Integer getLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println("hello's length: " + getLength(s1));
    }
}