public class Vowels {
    public static void main(String[] args) {
        String word = "ebroin technologies";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            switch (ch){
                case'a':

                case'e':

                case'i':

                case'o':

                case'u': count++;
            }
        }
        System.out.println("total vowels count to = "+count);

    }
}
