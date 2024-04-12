package map;

import java.math.BigInteger;

public class HashCodeForStrings {
    public final static int COEFF = 33;

    /**
     * Converts a given string key to the integer in the range from 0 to size - 1
     * using polynomial hash function
     * @param key string
     * @param size size of the hash table
     * @return index where this string hashes in the hash table
     */
    public static int hash(String key, int size) {
        if (key == null)
            throw new IllegalArgumentException();
        int firstAscii = key.charAt(0);
        BigInteger result  = BigInteger.valueOf(firstAscii);
        // FILL IN CODE: Implement the polynomial hash function for a string

        // Don't forget to take modulus size before returning the value
        return result.intValue();
    }


    public static void main(String[] args) {
        System.out.println(hash("red", 7)); // 4
        System.out.println(hash("blue", 7)); //5
        System.out.println(hash("green", 11)); // 0
        System.out.println(hash("purple", 11)); // 2
    }
}