class Solution {
    public boolean isValid(String word) {
        // Rule 1: The word must be at least 3 characters long.
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        // Iterate through each character of the word.
        for (char c : word.toCharArray()) {
            // Rule 2: The word must consist only of alphanumeric characters.
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }

            // Check if the character is a letter to test for vowels/consonants.
            if (Character.isLetter(c)) {
                // Convert to lowercase for a single, simple check.
                char lowerC = Character.toLowerCase(c);
                if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u') {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        // Rule 3 & 4: The word must contain at least one vowel and one consonant.
        return hasVowel && hasConsonant;
    }
}