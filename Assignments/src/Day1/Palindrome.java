package Day1;

public class Palindrome {
    public static void main(String[] args) {
        //words
        String word1 = "kayak";
        String word2 = "deified";
        String word3 = "father";
        String word4 = "rotator";
        String word5 = "repaper";
        String word6 = "cat";

        //run method
        palindrome(word1);
        palindrome(word2);
        palindrome(word3);
        palindrome(word4);
        palindrome(word5);
        palindrome(word6);
    }

    //Iterate half the word and check each side (k <- a,y,a -> k) | (k,a <- y -> a,k) | (k,a,y <- a,k)
    public static void palindrome(String word){
        for(int i = 0; i < word.length() / 2; i++){
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
                System.out.println("not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
