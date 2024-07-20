public class stringPalindrome {
    public static boolean isPalindrom(String name){
        for(int i = 0; i<name.length(); i++){
            if(name.charAt(i) !=  name.charAt(name.length() - 1 - i)){
                return false;
            }
        }
        // System.out.println("the string is palindrom");
        return true;
    }
    public static void main(String[] args) {
        String name = "racecar";
        System.out.println(isPalindrom(name));
    }
}
