public class TomJerry {
    public static void main(String[] args){
        Reader rd=new Reader();
        int n=rd.nextInt();
        if(n%2!=0 && (20>=n && n<=30)){
            System.out.println("Tom");
        }else {
            System.out.println("Jerry");
        }
    }
}
