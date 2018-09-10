public class Vowel_Consonant {
    public static void main(String[] args){
        Reader rd=new Reader();
        String str=rd.nextString();
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
                System.out.print("Vowel Consonant (should it be ");
                for (int i=0;i<str.length();i++){
                    if(str.charAt(i)=='a'
                            || str.charAt(i)=='e'
                            || str.charAt(i)=='i'
                            ||  str.charAt(i)=='o'
                            ||  str.charAt(i)=='u'){
                        if (i!=str.length()-1){
                            System.out.print(str.charAt(i)+" - vowel, ");
                        }else {
                            System.out.println(str.charAt(i)+" - vowel)");
                        }
                    }else{
                        if (i!=str.length()-1){
                            System.out.print(str.charAt(i)+" - consonant, ");
                        }else {
                            System.out.println(str.charAt(i)+" - consonant)");
                        }
                    }
                }
            }else if (vowel){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }

        }else {
            System.out.println("Error: String contains digit.");
        }

    }
}
