package Recursion;

public class PrintReverse {

    public static void main(String[] args) {

        // create a new char list
        char[] charList = new char[]{'L','e','e','t','C','o','d','e'};

        // print string
        PrintReverse(charList);
    }

    /**
     * Print the reverse String
     * Input: ["h","e","l","l","o"]
     * Output: ["o","l","l","e","h"]
     * @param s: the char array in which char will be printed
     */
    public static void PrintReverse(char[] s) {

        // call the helper function, index start from 0
        helper(0, s);

    }

    /**
     * helper function to execute the recursion including
     * base case and recurrence relation
     * @param index: the initial index
     * @param s: the char array
     */
    private static void helper(int index, char[] s) {

        // base case
        if (s == null || index >= s.length) {
            return;
        }

        // recursion to call the function itself
        helper(index + 1, s);

        // print the character at index in each recursion
        System.out.print(s[index]);

    }
}
