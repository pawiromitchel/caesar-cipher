public class Main {
    public static void main(String[] args) {
        String messageEncrypted = "";
        String message = "caesar decipher rules";
        int shift = 3;

        // calculate the length of the message
        int len = message.length();
        // loop through every character of the message
        for(int x = 0; x < len; x++){
            // convert the String to char
            char c = (char)(message.charAt(x) + shift);
            // Add shift to the character and if it falls off the end of the alphabet then subtract shift from the number of letters in the alphabet (26)
            // If the shift does not make the character fall off the end of the alphabet, then add the shift to the character.
            if (c > 'z')
                messageEncrypted += (char)(message.charAt(x) - (26-shift));
            else
                messageEncrypted += (char)(message.charAt(x) + shift);
        }
        System.out.println(messageEncrypted);
    }
}
