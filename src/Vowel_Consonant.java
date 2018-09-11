public class Vowel_Consonant {
    public String Test(String str){

        boolean flag=true;
        boolean vowel=false;
        boolean consonant=false;
        for(int i=0;i<str.length();i++){
            if( Character.isDigit(str.charAt(i))){
                flag=false;
                break;
            }else {
                if(str.charAt(i)=='a'
                        || str.charAt(i)=='e'
                        || str.charAt(i)=='i'
                        ||  str.charAt(i)=='o'
                        ||  str.charAt(i)=='u'){
                    vowel=true;
                }else {
                    consonant=true;
                }
            }
        }
        if (flag){
            if(vowel && consonant){
                StringBuilder str1= new StringBuilder();
                str1.append("Vowel Consonant (should it be ");
                for (int i=0;i<str.length();i++){
                    if(str.charAt(i)=='a'
                            || str.charAt(i)=='e'
                            || str.charAt(i)=='i'
                            ||  str.charAt(i)=='o'
                            ||  str.charAt(i)=='u'){
                        if (i!=str.length()-1){
                            str1.append(str.charAt(i)+" - vowel, ");
                        }else {
                            str1.append(str.charAt(i)+" - vowel)");
                        }
                    }else{
                        if (i!=str.length()-1){
                            str1.append(str.charAt(i)+" - consonant, ");
                        }else {
                            str1.append(str.charAt(i)+" - consonant)");
                        }
                    }

                }
                return str1.toString();
            }else if (vowel){
                return "Vowel";
            }else{
                return "Consonant";
            }

        }else {
            return "Error: String contains digit.";
        }

    }
}
