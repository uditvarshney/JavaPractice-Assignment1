public class Check_character {
    public String Test(String str){

        Character ch= str.charAt(0);
        if(Character.isLetter(ch)){
            if (Character.isUpperCase(ch)){
                return "Capital Letter";
            }else {
                return "Small Case Letter";
            }
        }else if (Character.isDigit(ch)){
            return "Digit";
        }else {
            return "Special Symbol";
        }
    }
}
