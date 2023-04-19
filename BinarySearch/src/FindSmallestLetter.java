//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class FindSmallestLetter {
    public static void main(String[] args) {
        //You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
        // There are at least two different characters in letters.
        //
        //Return the smallest character in letters that is lexicographically greater than target.
        // If such a character does not exist, return the first character in letters.

        //Example 1:
        //
        //Input: letters = ["c","f","j"], target = "a"
        //Output: "c"
        //Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'a'));

        //Input: letters = ["c","f","j"], target = "c"
        //Output: "f"
        //Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
        System.out.println(nextGreatestLetter(letters, 'e'));

        //Input: letters = ["x","x","y","y"], target = "z"
        //Output: "x"
        //Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
        char[] letters2 = {'x','x','y','y'};
        System.out.println(nextGreatestLetter(letters2, 'z'));

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        //make a start, middle, and end of the sorted array
        int start = 0;
        int end = letters.length - 1;
        int middle;

        //Run while loop BS
        while(start <= end){
            //Find middle element
            middle = start + (end - start) / 2;

            //if target is greater than mid
            if(target < letters[middle]){
                end = middle - 1;
            }else{
                //if target is less than mid
                start = middle + 1;
            }
        }
        //if element is not found return -1
        return letters[start % letters.length];
    }
}
