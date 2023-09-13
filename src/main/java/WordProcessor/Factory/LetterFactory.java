package WordProcessor.Factory;

import WordProcessor.Implementations.Letter;
import WordProcessor.Interfaces.ILetter;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

    private static Map<Character, ILetter> letterCache = new HashMap<>();

    public static ILetter createLetter(char character){

        if(letterCache.containsKey(character)){
            return letterCache.get(character);
        }
        else{
            ILetter letter = new Letter(character,10,"Arial");
            letterCache.put(character, letter);
            return letter;
        }

        //return null;
    }
}
