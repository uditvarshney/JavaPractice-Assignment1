import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public String[] Test(String str){

        Integer arr[]=new Integer[str.length()];

        for (int i=0;i<str.length();i++){
            arr[i]=Integer.valueOf(str.charAt(i))-'1'+1;
        }

        Arrays.sort(arr, Collections.reverseOrder());
        int even_sum=0;
        StringBuilder str1=new StringBuilder();
        String result[]= new String[3];
        for(int i=0;i<str.length();i++)
        {
            if (arr[i]%2==0) {
                even_sum += arr[i];
            }
            str1.append(arr[i]);
        }
        result[0]=str1.toString();
        result[1]=String.valueOf(even_sum);
        if(even_sum>15){
            result[2]="True";
        }else {
            result[2]="False";
        }
        return result;
    }
}
