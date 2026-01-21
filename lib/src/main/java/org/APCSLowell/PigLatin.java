package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (int i = 0; i < sWord.length(); i++) {
            for (char vowel : vowels) {
                if (sWord.charAt(i) == vowel) return i;
            }
        }
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
	    
        return -1;
    }

    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        int firstVowelIndex = findFirstVowel(sWord);
        if (firstVowelIndex == -1) return (sWord + "ay");
        if (firstVowelIndex == 0) return (sWord + "way");
        if (sWord.substring(0, 2).equals("qu")) return (sWord.substring(2, sWord.length()) + "quay");
        if (firstVowelIndex != 0) return sWord.substring(firstVowelIndex, sWord.length()) + sWord.substring(0, firstVowelIndex) + "ay";

        return null;
    }
}
