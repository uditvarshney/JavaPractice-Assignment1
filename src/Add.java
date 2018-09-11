import java.util.Scanner;
import java.util.StringTokenizer;

public class Add {
    public String Test(String f){
        int sum=0;
        boolean flag=false;
        String str=f;
        StringTokenizer str1=new StringTokenizer(str," ");
        while (str1.hasMoreElements()){
            try {
                int x=Integer.valueOf(str1.nextToken());
                if(x!=Math.ceil(x)){
                    flag=true;
                    break;
                }
                sum+=x;
            }catch (NumberFormatException e){
                return "Error: input is not a integer";
            }

        }
        if (flag){
            return "Error: input is not a integer";
        }else {
            return String.valueOf(sum);
        }
    }/*
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int sum=0;
        boolean flag=false;
        String str=in.nextLine();
        StringTokenizer str1=new StringTokenizer(str," ");
        while (str1.hasMoreElements()){
            int x=Integer.valueOf(str1.nextToken());
            if(x!=Math.ceil(x)){
                flag=true;
                break;
            }
            sum+=x;
        }
        if (flag){
            System.out.println("Error: input is not a integer");
        }else {
            System.out.println(sum);
        }
    }*/
}
