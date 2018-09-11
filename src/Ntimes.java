public class Ntimes {
    public String Test(int n){

        StringBuilder str=new StringBuilder();
        for (int i=1;i<=n;i++){
            if (i!=n) {
                for (int j = 1; j <= i; j++) {
                    str.append(i + " ");
                }
            }else{
                for (int j = 1; j <= i; j++) {
                    if (j==i) {
                        str.append(i);
                    }else {
                        str.append(i+" ");
                    }
                }
            }
        }
        return str.toString();
    }
}
