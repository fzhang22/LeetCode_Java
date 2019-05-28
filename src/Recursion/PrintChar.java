package Recursion;

public class PrintChar {

    public static void main(String[] args) {

        char[] charList = new char[] {'L','e','e','t','C','o','d','e'};

        PrintChar(charList);
    }

    /**
     * Print the string using Recursion
     * @param s: the input char array
     */
    public static void PrintChar(char[] s) {

        helper(s.length - 1, s);

    }

    /**
     * helper function to execute the recursion
     * @param index: the char at index will be printed
     * @param s: the char array
     */
    private static void helper(int index, char[] s) {
        if (s == null || index < 0 || index >= s.length) {
            return;
        }

        helper(index  - 1, s);

        System.out.print(s[index]);
    }
}
