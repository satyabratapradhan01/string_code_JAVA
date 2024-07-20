public class subString {
    public static String printSubstring(String name, int si, int ei){
        String newString = "";
        for(int i = si; i<ei; i++){
            newString += name.charAt(i);
        }
        return newString;
    }
    public static void main(String[] args) {
        String name = "helloworld";
        System.out.println(printSubstring(name, 0,5));
    }
}
