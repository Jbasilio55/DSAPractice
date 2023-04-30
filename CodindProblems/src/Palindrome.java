public class Palindrome {
    public static void main(String[] args) {
        String word = "kayak";
        String word2 = "1racecar1";

        System.out.println(palindrome(word));
        System.out.println(palindrome2(word));

        System.out.println(palindrome3(word));
        System.out.println(palindrome3(word2));

    }

    public static boolean palindrome(String word){
        if(word == null || word.length() == 0){
            return true;
        }

        String lower = word.toLowerCase();
        String onlyAlpha = lower.replaceAll(
                "[^a-zA-Z0-9]", "");

        for(int i = 0; i < onlyAlpha.length() / 2; i++){
            if(onlyAlpha.charAt(i) != onlyAlpha.charAt(word.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    //only works with letters
    public static boolean palindrome2(String str){
        str = str.toLowerCase();
        String newStr = "";
        String reverse = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) > 96 && str.charAt(i) < 123){
                newStr += str.charAt(i);
            }
        }

        for(int i = newStr.length() - 1; i >= 0; i--){
            reverse += newStr.charAt(i);
        }

        if(newStr.equals(reverse)){
            return true;
        }
        return false;
    }

    //
    public static boolean palindrome3(String str){
        StringBuilder newStr = new StringBuilder();

        for(char c : str.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                newStr.append(c);
            }
        }

        newStr = new StringBuilder(newStr.toString().toLowerCase());

        for(int i = 0; i < newStr.length() / 2; i++){
            if(newStr.charAt(i) != newStr.charAt(newStr.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
