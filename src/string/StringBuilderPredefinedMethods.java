package string;

public class StringBuilderPredefinedMethods {

    public static void main(String[] args) {

        // StringBuilder objects are mutable (can be modified)

        // StringBuilder is faster than StringBuffer
        // StringBuilder is not synchronized
        // StringBuilder is not thread safe

        // 1) append() method
        StringBuilder sb = new StringBuilder("Java ");
        sb.append("Programming"); // sb: Java Programming

        // 2) insert() method
        sb.insert(5, "Hello "); // sb: Java Hello Programming

        // 3) delete() method
        sb.delete(5, 11); // including 5, excluding 11
        // sb: Java Programming

        // 4) delete() method
        sb.reverse(); // sb: gnimmargorP avaJ

        // 5) length() method
        int len = sb.length(); // len: 16

        // 6) charAt() method
        char ch = sb.charAt(0); // ch: 'g'
    }
}
