
public class Main {
    public static void main(String[] args) {

        String s = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord(s));

    }


    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");

        for(int i = words.length - 1; i >= 0; i--){

            if(!words[i].isEmpty()){
                String theWord = words[i];
                return theWord.length();
            }

        }


        return 1;
    }


    }

