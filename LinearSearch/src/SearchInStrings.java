public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Jorge";
        System.out.println(search(name, 'o'));
        System.out.println(search(name, 'm'));

        System.out.println(search2(name, 'l'));
        System.out.println(search2(name, 'J'));
    }
    public static boolean search(String str, char letter){
        //edge case
        if(str.length() == 0){
            return false;
        }
        //for loop to check String
        for(int i = 0; i < str.length(); i++){
            //if letter matches an element at index i. return true
            if(letter == str.charAt(i)){
                return true;
            }
        }
        //if above code does not run;
        return false;
    }

    public static boolean search2(String str, char letter){
        //edge case
        if(str.length() == 0){
            return false;
        }
        //for each to check String
        for(char ch : str.toCharArray()){
            //if character matches letter. return true
            if(ch == letter){
                return true;
            }
        }
        //if above code does not run;
        return false;
    }
}
