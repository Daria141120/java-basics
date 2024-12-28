package lab5;

public class Main {
    public static void main(String[] args){

        // test task 1
        String s = "The string literal \"\\(hello\\)\" is illegal";
        System.out.println("String : "+s);
        System.out.println("THE LONGEST WORD : " + longestWord(s));


        // test task 2
        System.out.println("-------------");
        String myStr = "Noon";
        if (isWordPalindrome(myStr))
            System.out.println(myStr +" - palindrome");
        else
            System.out.println(myStr + " - NOT a palindrome");


        //test task 3
        System.out.println("-------------");
        String myStr2 = "У медведя в корзинке была всякая бяка. Но главная бяка в лесу - некультурный турист";
        System.out.println(myStr2);
        System.out.println(censorship(myStr2));


        //test task 4
        System.out.println("-------------");
        String mystr3 = "There are a lot of cats. Cats on the roof, cats on the grass, cats everywhere. The Catworld";
        String substr = "cat";
        System.out.println(mystr3);
        System.out.printf("amount of substring \"%s\" = %d\n", substr, quantitySubstr(mystr3, substr));


        //test task 5
        System.out.println("-------------");
        String mystr4 = "This is a test string";
        String reversStr = invertWords(mystr4);

        System.out.println(mystr4);
        System.out.println(reversStr);
    }

    // task 1
    public static String longestWord(String str) {
        if ((str == null) || (str.isEmpty())) {
            System.out.println("String empty or null");
            return "";
        }
        String[] words = str.split("\\W+");

        int indexLongestWord = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[indexLongestWord].length() < words[i].length()) {
                indexLongestWord = i;
            }
        }

        return words[indexLongestWord];
    }

    // task 2
    public static boolean isWordPalindrome(String str) {
        if ((str == null) || (str.isEmpty())) {
            System.out.println("String empty or null");
            return false;
        }
        String strLower = str.toLowerCase();
        for (int i = 0, j = strLower.length() - 1; i < j; i++, j--) {
            if (strLower.charAt(i) != strLower.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    //task 3
    public static String censorship(String str){
        if ((str == null) || (str.isEmpty())) {
            System.out.println("String empty or null");
            return "";
        }
        return str.replace("бяка","[вырезано цензурой]");
    }

    //task 4
    public static int quantitySubstr(String str, String substr ){
        if ((str == null) || (str.isEmpty())) {
            System.out.println("String empty or null");
            return -1;
        }
        String strLower = str.toLowerCase();
        String substrLower = substr.toLowerCase();

        int i = 0;
        int count =0;
        while ((i = strLower.indexOf(substrLower, i)) != -1) {
            count++;
            i = i + substrLower.length();
        }
        return count;
    }

    //task 5
    public static String invertWords(String str){
        if ((str == null) || (str.isEmpty())) {
            System.out.println("String empty or null");
            return "";
        }

        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();

        String [] arrayStr = strBuilder.toString().split(" ");
        strBuilder.delete(0,strBuilder.length());

        for (int i = arrayStr.length - 1; i >= 0; i--) {
            strBuilder.append(arrayStr[i]);
            if (i != 0) {
                strBuilder.append(" ");
            }
        }

        return new String((strBuilder));
    }

}
