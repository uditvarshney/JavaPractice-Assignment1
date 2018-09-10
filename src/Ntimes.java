public class Ntimes {
    public static void main(String[] args){
        Reader rd=new Reader();
        int n=rd.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
        }
    }
}
