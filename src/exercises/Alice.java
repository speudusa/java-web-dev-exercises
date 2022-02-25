package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner search = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        // -- lcSentence will make the sentence all lowercase
        // -- this will increase the chances for the user to find their word
        // -- TODO: will need to make user input lowercase to match, too
        String lcSentence = sentence.toLowerCase();
        System.out.println("Enter a word to search for:");
        // -- user term lowercase
        String searchTerm = search.nextLine().toLowerCase();

        // -- Task 1:  T||F my search term is contained in the sentence
        boolean wordSearch = lcSentence.contains(searchTerm);
        System.out.println("Is your word in the sentence?  " + wordSearch);

        // -- Task 2:  Print out its index within the string and its length.
        // -- sting method ideas: indexOf and length??
        int whereWord = lcSentence.indexOf(searchTerm);
        int wordLength = searchTerm.length();
        System.out.println("Your word is located: " + whereWord);
        System.out.println("Your word has a length of: " + wordLength);


        // -- Task 3: remove the word from the string and print the sentence again to confirm your code.
        // -- Use slice?  substring:  https://beginnersbook.com/2013/12/java-string-substring-method-example/
        String shorterSentence = lcSentence.replace(searchTerm,"");
        System.out.println(shorterSentence);

        // -- try this?
        String shortSentence1 = lcSentence.substring(0, whereWord);
        String shortSentence2 = lcSentence.substring(whereWord+wordLength, lcSentence.length()-1);
        System.out.println(shortSentence1 + shortSentence2);
        System.out.println(lcSentence.length());
    }

}
