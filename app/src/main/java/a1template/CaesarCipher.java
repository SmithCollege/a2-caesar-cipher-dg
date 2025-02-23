// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class CaesarCipher {

    /** Character array to store the letters in the alphabet in order */
    Character[] alphabet;

    /** DynamicArray object providing ArrayList-like operations for Characters */
    DynamicArray<Character> cipher;

    /** Private offset that tracks how many positions to shift the index for
    * This cipher */
    private int offset;

    /** Constructor that should define the instance variables, including
     * populating the alphabet
     * @param offset Offset to use when creating `cipher` of DynamicArray type
     */
    CaesarCipher(int offset){
        this.offset = offset;
        alphabet = new Character[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        cipher = new DynamicArray<>(offset, alphabet);
    }

    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        for (int i = 0; i < this.alphabet.length; i++) {
            if (this.alphabet[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    /** Encode a message using the cipher
     * @param message message to encode
     * @return encoded message */  
    public String encode(String message){
        message = message.toLowerCase();
        char[] characters = message.toCharArray();
        String nMessage = "";
        for (int i = 0; i < characters.length; i++) {
            nMessage += cipher.get(i,offset);
        }

        return nMessage;
     }

    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding (the offset?)
     * @return decoded message
    */
    public String decode(String message){
        char[] characters = message.toCharArray();
        String decodedMessage = "";
        
        for (int i = 0; i < characters.length; i++) {
            decodedMessage += cipher.get(i,0);
            }
        
        return decodedMessage;
    }

    public static void main(String[] args) {
    }
    
}
