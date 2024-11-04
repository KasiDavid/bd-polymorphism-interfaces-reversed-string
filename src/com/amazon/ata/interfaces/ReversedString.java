package com.amazon.ata.interfaces;

/**
 * Reverse a String and act like a <code>CharSequence</code>.
 * <p>
 * Change this class definition to implement CharSequence.
 */
public class ReversedString implements CharSequence {
    private String characters;
    private String reversed;
    /**
     * Implement this constructor during the interfaces prework.
     *
     * @param chars The String of chars to be reversed
     */
    public ReversedString(final String chars) {
        this.characters = chars;
        this.reversed = (String) subSequence(0,characters.length());
    }

    @Override
    public int length() {
        return characters.length();
    }

    @Override
    public char charAt(int index) {
        return characters.charAt(characters.length()-1 + (index * -1));
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String reversed = "";
        for (int i = start; i < end; i++){
            reversed += (characters.charAt(characters.length() - 1 + (i * -1)));
        }
        return reversed;
    }

    @Override
    public String toString() {
        return reversed;
    }
}
