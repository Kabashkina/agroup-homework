/*There is a file somewhere on disk with ASCII text (any book in English).
  JAVA program should take name of the file as a program argument.
  It should parse file text and identify all separate words.
  Then it should count every word occurrences and print out in System.out all identified words
  and number of their occurrences in specific order: more popular words come first.
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> wordsArray = new ArrayList<>();
        Map<String, Integer> wordsMap = new HashMap<>();

        if(args.length > 1) {
            System.out.println("\nThere must be only one argument.\n");
            return;
        }

        String programArgument = args[0];

        FileReader file = new FileReader(programArgument);
        StreamTokenizer st = new StreamTokenizer(file);

        System.out.println("\nPath to the text file: " + programArgument);

        while ((st.nextToken()) != StreamTokenizer.TT_EOF) {
            if (st.ttype == StreamTokenizer.TT_WORD) {
                String word = "";
                if(st.sval.endsWith(".")) {
                    word = st.sval.replace(".", "");
                } else word = st.sval;

//              Case-insensitive option
                word = word.toLowerCase();

                wordsArray.add(word);
                wordsMap.merge(word, 1, Integer::sum);
            }
        }

        file.close();

        System.out.println("\nNumber of words in the file: " + wordsArray.size());
        System.out.println("\nList of all words in the file (not sorted):\n" + wordsArray);

        System.out.println("\nList of sorted words: ");
        wordsMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}



