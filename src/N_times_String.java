public class N_times_String {
    public String Test(String str, int x){

        StringBuilder str1=new StringBuilder(str);

        String sub_str=str.substring(str.length()-x);
        for(int i=0;i<x;i++){
            str1.append(sub_str);
        }
        return str1.toString();
    }
}
