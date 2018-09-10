public class N_times_String {
    public static void main(String[] args){
        Reader rd=new Reader();
        String str=rd.nextString();
        int x=rd.nextInt();
        StringBuilder str1=new StringBuilder(str);

        String sub_str=str.substring(str.length()-x);
        for(int i=0;i<x;i++){
            str1.append(sub_str);
        }
        System.out.println(str1);
    }
}
