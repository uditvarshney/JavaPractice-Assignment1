public class Check_character {
    public static void main(String[] args){
        Reader rd=new Reader();
        Character ch=rd.next().charAt(0);
        if(Character.isLetter(ch)){
            if (Character.isUpperCase(ch)){
                System.out.println("Capital Letter");
            }else {
                System.out.println("Small Case Letter");
            }
        }else if (Character.isDigit(ch)){
            System.out.println("Digit");
        }else {
            System.out.println("Special Symbol");
        }
    }
}
