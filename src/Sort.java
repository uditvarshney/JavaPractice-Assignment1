import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args){
        Reader rd=new Reader();
        String str=rd.nextString();
        Integer arr[]=new Integer[str.length()];
        System.out.println(arr.length);
        for (int i=0;i<str.length();i++){
            arr[i]=Integer.valueOf(str.charAt(i))-'1'+1;
        }

        Arrays.sort(arr, Collections.reverseOrder());
        int even_sum=0;
        System.out.print("Sorted number in non-increasing order : ");
        for(int i=0;i<str.length();i++)
        {
            if (arr[i]%2==0) {
                even_sum += arr[i];
            }
            System.out.print(arr[i]);
        }
        System.out.println("\nSum of even numbers: "+even_sum);
        if(even_sum>15){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
