import javafx.beans.property.SimpleObjectProperty;

public class Ex2_Pallindrome {
    public boolean isPallindrome(String str){
        int length=str.length();
        boolean flag=true;
        for (int i=0;i<length/2;i++){
            if(str.charAt(i)!=str.charAt(length-i-1)){
                flag=false;
                break;
            }
        }
        if (flag)
            return true;
        else {
            return false;
        }
    }
    public static void main(String[] args){
        Reader rd=new Reader();
        String str=rd.nextString();
        Ex2_Pallindrome ex2_pallindrome=new  Ex2_Pallindrome();
        if(ex2_pallindrome.isPallindrome(str)){
            long n=Long.valueOf(str);
            int sum=0;
            while(n>0){
                sum+=n%10;
                n=n/10;
            }
            if(sum>25){
                System.out.println(str+" is palindrome and the sum of even numbers is greater than 25");
            }else{
                System.out.println(str+" is palindrome and sum of even numbers is less than 25");
            }
        }else{
            System.out.println(str+" is not a pallindorme");
        }
    }
}
