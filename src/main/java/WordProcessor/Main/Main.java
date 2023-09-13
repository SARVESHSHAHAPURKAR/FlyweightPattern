package WordProcessor.Main;

import WordProcessor.Factory.LetterFactory;
import WordProcessor.Implementations.Letter;
import WordProcessor.Interfaces.ILetter;

public class Main {

    public static void main(String[] args) {

        ILetter letter1 = LetterFactory.createLetter('A');
        letter1.display(5,10);

        ILetter letter2 = LetterFactory.createLetter('B');
        letter2.display(4,6);

    }
}
