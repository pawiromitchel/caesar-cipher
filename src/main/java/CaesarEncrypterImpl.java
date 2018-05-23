public class CaesarEncrypterImpl implements CaesarEncrypter {
    public String encrypt(String message, int shift){

        String messageEncrypted = "";

        // calculate the length of the message
        int len = message.length();
        // loop through every character of the message
        for(int x = 0; x < len; x++){
            // convert the String to char
            char c = (char)(message.charAt(x) + shift);
            // Add shift to the character and if it falls off the end of the alphabet then subtract shift from the number of letters in the alphabet (26)
            // If the shift does not make the character fall off the end of the alphabet, then add the shift to the character.
            if (c > 'z'){
                messageEncrypted += (char)(message.charAt(x) - (26-shift));
            } else if ((char)(message.charAt(x)) == ' ') {
                // detected a space, so dont shift the space
                messageEncrypted += (char)(message.charAt(x));
            } else {
                messageEncrypted += (char)(message.charAt(x) + shift);
            }
        }

        return messageEncrypted;
    }
}
