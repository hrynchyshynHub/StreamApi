package ua.com.eleks;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static  final Set set = new HashSet(){
        {
            add("sda");
        }
    };
    public static void main(String[] args) {
        System.out.println(isPolindrome("A santa lived as a devi at NASA"));
        getWordsCount("www aaa www WWW aAa");
        GroupByAnagrams(new String[]{"cars", "for", "potatoes", "racs", "four", "scar", "creams", "scream"});
        String helloA = new String("hello");
        String helloB = new String("hello");
        System.out.println(helloA.intern() == helloB.intern());
        Random  random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::print);
        List<Integer>list = Arrays.asList(31,312,3,1,3,4,234);
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(multiple("-45,3", "2"));
    }

    public static boolean isPolindrome(String text) {
        StringBuilder stringBuilder = new StringBuilder(text.replaceAll(" ", ""));
        String s1 = new String(stringBuilder);
        String s = new String(stringBuilder.reverse());
        return (s.equalsIgnoreCase(s1)) ? true : false;
    }
    public static void getWordsCount(String text){
        String s = text.replaceAll("([.||\\-||,])", " ");
        String allWordsInText []  = s.split("([ ]){1,10}");
        Arrays.toString(allWordsInText);
        Set<String>unicWord  =  new HashSet();
        for(int i = 0 ; i<allWordsInText.length; i++){
            unicWord.add(allWordsInText[i].toLowerCase());
        }
       for(String w: unicWord){
           int counter = 0;
           for(int j = 0; j<allWordsInText.length; j++) {
               if (w.equals(allWordsInText[j].toLowerCase()))++counter;
           }
           System.out.print("{ " + w + ", " + counter + " }");
       }

    }
    public static void GroupByAnagrams(String[]text){
        for(int i = 0 ; i<text.length; i++){
            char[]symbols = text[i].toLowerCase().toCharArray();
            List<Character> characters = new ArrayList(Arrays.asList(symbols));
            System.out.println("Слово початкове - " + text[i] + " ");
            for(int j = 0; j< text.length -1 ; j++){
                if(characters.containsAll(new ArrayList<>(Arrays.asList(text[j].toLowerCase().toCharArray()))));
                System.out.print("знайдені слова " + text[j]);
            }

        }

    }
    public static String multiple(String a,String b){
        Double ax = Double.parseDouble(a);
        Double bx = Double.parseDouble(b);
        Double sum = ax * bx;
        String s = " " + sum;
        return s;
    }
}
