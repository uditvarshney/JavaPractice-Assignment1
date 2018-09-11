public class ReverseString {
    public String Test(String str){

        String rev_str="";
        for (int i=str.length()-1;i>=0;i--){
            rev_str+=str.charAt(i);
        }
        return rev_str;
    }
}
