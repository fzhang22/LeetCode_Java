package Recursion;

public class ReverseString {
    /**
     * Write a function that reverses a string. The input string is given as an array of characters     char[].
     * Do not allocate extra space for another array, you must do this by modifying the input array     in-place with O(1) extra memory.
     * We swap the character at corresponding index
     */

    public static void main(String[] args) {
        char[] charList = new char[] {'L','e','e','t','C','o','d','e'};
        ReverseString(charList);

    }
    public static void ReverseString(char[] s) {

        helper(0, s);
        System.out.println(s);

    }

    /**
     * The helper function to execute the recursion
     * @param index: the start index
     * @param s: the char array
     */
    private static void helper(int index, char[] s) {
        if (index < 0 || s == null || index >= s.length) {
            return;
        }

        helper(index + 1, s);

        swap(index, s.length - index - 1, s);



    }

    /**
     * swap the char in char array
     * @param i: the start index
     * @param j: the index at which the char will be swapped with index i
     * @param s: the char array
     */
    private static void swap(int i, int j, char[] s) {

        char temp = s[i];

        if (i < s.length / 2) {

            s[i] = s[j];
            s[j] = temp;

            return;

        }

    }




}
