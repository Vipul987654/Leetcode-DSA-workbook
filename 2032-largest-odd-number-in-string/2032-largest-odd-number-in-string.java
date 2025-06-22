class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) { // Corrected loop condition to include index 0
            char digitChar = num.charAt(i); // Get the character at index i
            int digit = digitChar - '0'; // Convert character to integer

            if (digit % 2 != 0) {
                return num.substring(0, i + 1); // Corrected substring end index to be exclusive
            }
        }
        return ""; // Return an empty string if no odd digit is found
    }
}