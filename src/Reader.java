import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reader {
    StringTokenizer st;
    BufferedReader br;
    public Reader(){
        br=new BufferedReader(new InputStreamReader(System.in));
    }
    public String next(){
        while (st==null || !st.hasMoreElements()){
            try {
                st=new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    public Integer nextInt(){
        return Integer.parseInt(next());
    }
    public Long nextLong(){
        return Long.parseLong(next());
    }
    public Double nextDouble(){
        return Double.parseDouble(next());
    }

    public Float nextFloat(){
        return Float.parseFloat(next());
    }
    public String nextString(){
        return next();
    }
    public String nextLine(){
        StringTokenizer st=null;
        try {
            st=new StringTokenizer(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return st.toString();
    }
}
