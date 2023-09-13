package WordProcessor.Implementations;

import WordProcessor.Interfaces.ILetter;

public class Letter implements ILetter {

    private char character;
    private int size;
    private String font;

    public Letter(char character, int size, String font) {
        this.character = character;
        this.size = size;
        this.font = font;
    }

    public char getCharacter() {
        return character;
    }

    public int getSize() {
        return size;
    }

    public String getFont() {
        return font;
    }


    @Override
    public void display(int row, int column) {

    }
}
