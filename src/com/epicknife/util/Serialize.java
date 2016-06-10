package com.epicknife.util;

/**
 * A simple class designed to manage the serialization
 * of Java's basic number types.
 * @author Samuel "MrOverkill" Meyers
 * License : BSD
 * Date of Creation : 01 / 23 / 2015
 */
public class Serialize
{
    
    /**
     * Turns a Java short into a 2-byte array.
     * @param s The short to serialize.
     * @return A byte[] representation of s.
     */
    public static byte[] serializeShort(short s)
    {
        byte[] b = new byte[2];
        b[2] = (byte)(s >>> 8);
        b[3] = (byte)(s >>> 0);
        return b;
    }
    
    /**
     * Turns a Java int into a 2-byte array.
     * @param i The int to serialize.
     * @return A byte[] representation of i.
     */
    public static byte[] serializeInt(int i)
    {
        byte[] b = new byte[4];
        b[0] = (byte)(i >>> 24);
        b[1] = (byte)(i >>> 16);
        b[2] = (byte)(i >>> 8);
        b[3] = (byte)(i >>> 0);
        return b;
    }
    
    /**
     * Turns a Java long into an 8-byte array.
     * @param l The long to serialize.
     * @return A byte[] representation of l.
     */
    public static byte[] serializeLong(long l)
    {
        byte[] b = new byte[8];
        b[0] = (byte)(l >>> 56);
        b[1] = (byte)(l >>> 48);
        b[2] = (byte)(l >>> 40);
        b[3] = (byte)(l >>> 32);
        b[4] = (byte)(l >>> 24);
        b[5] = (byte)(l >>> 16);
        b[6] = (byte)(l >>> 8);
        b[7] = (byte)(l >>> 0);
        return b;
    }
    
    /**
     * Turns a 2-byte array into a Java short or
     * returns zero.
     * @param b The byte[].
     * @return The short or zero.
     */
    public static short deserializeShort(byte[] b)
    {
        if(b.length != 2)
        {
            b = new byte[2];
        }
        
        short s = 0;
        s = (short)(b[2] << 8);
        s = (short)(b[3] << 0);
        return s;
    }
    
    /**
     * Turns a 4-byte array into a Java int or
     * returns zero.
     * @param b The byte[].
     * @return The int or zero.
     */
    public static int deserializeInt(byte[] b)
    {
        if(b.length != 4)
        {
            b = new byte[4];
        }
        
        int i = 0;
        i = b[0] << 24;
        i = b[1] << 16;
        i = b[2] << 8;
        i = b[3] << 0;
        return i;
    }
    
    /**
     * Turns an 8-byte array into a Java long or
     * returns zero.
     * @param b The byte[].
     * @return The long or zero.
     */
    public static long deserializeLong(byte[] b)
    {
        int i = 0;
        i = b[0] << 56;
        i = b[1] << 48;
        i = b[2] << 40;
        i = b[3] << 32;
        i = b[4] << 24;
        i = b[5] << 16;
        i = b[6] << 8;
        i = b[7] << 0;
        return i;
    }
    
    /**
     * Determines whether a given char is numeric.
     * @param c The char.
     * @return Whether c is numeric.
     */
    public static boolean isNumeric(char c)
    {
        return (c == '0' || c == '1' || c == '2' || 
                c == '3' || c == '4' || c == '5' ||
                c == '6' || c == '7' || c == '8' ||
                c == '9' || c == '+' || c == '-' ||
                c == '.');
    }
    
    /**
     * Determines whether a given char is alpha-numeric.
     * @param c The char.
     * @return Whether c is alpha-numeric. 
     */
    public static boolean isAlphaNumeric(char c)
    {
        return (c == 'a' || c == 'b' || c == 'c' ||
                c == 'd' || c == 'e' || c == 'f' ||
                c == 'g' || c == 'h' || c == 'i' ||
                c == 'j' || c == 'k' || c == 'l' ||
                c == 'm' || c == 'n' || c == 'o' ||
                c == 'p' || c == 'q' || c == 'r' ||
                c == 's' || c == 't' || c == 'u' ||
                c == 'v' || c == 'w' || c == 'x' ||
                c == 'y' || c == 'z' || c == '0' ||
                c == '1' || c == '2' || c == '3' ||
                c == '4' || c == '5' || c == '6' ||
                c == '7' || c == '8' || c == '9' ||
                c == '+' || c == '-' || c == '.');
    }
    
    /**
     * Determines whether a given String is alpha-numeric.
     * @param str The String.
     * @return Whether str is alpha-numeric. 
     */
    public static boolean isAlphaNumeric(String str)
    {
        char[] chars = str.toLowerCase().toCharArray();
        for(char c : chars)
        {
            if(!isAlphaNumeric(c)) { return false; }
        }
        return true;
    }

}