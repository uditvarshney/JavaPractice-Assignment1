public class GuessNumber {
    public static void main(String[] args){

        System.out.print("Enter Target number");
        Reader rd=new Reader();
        int x=rd.nextInt();
        System.out.print("\nGuess Number\n");
        while (true){
            int guess=rd.nextInt();
            if (guess>100 || guess<1){
                System.out.println("Number between 1 - 100 is allowed");
            }
            else if(guess==x){
                System.out.println("Right Guess");
            }else {
                System.out.println(guess+" is worng guess. Please type again.");
            }
        }
    }
}
