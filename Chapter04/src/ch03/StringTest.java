package ch03;

public class StringTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        /*
        System.out.println(System.identityHashCode(java));
        java = java.concat(android);
        System.out.println(System.identityHashCode(java));

        System.out.println(java);
        */
        
        StringBuilder buffer = new StringBuilder(java);

        System.out.println(System.identityHashCode(buffer));
        buffer.append(android);
        System.out.println(System.identityHashCode(buffer));

        String test = buffer.toString();
        System.out.println(test);
    }
}