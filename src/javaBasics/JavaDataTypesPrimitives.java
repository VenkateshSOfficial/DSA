package javaBasics;

public class JavaDataTypesPrimitives {
    public static void main(String[] args) {
        /*
        * In total, we have 8 primitive data types as listed below :
        * 1 : byte  -> 1 byte ,-128 to 127 in total 256 numbers can be stored
        * 2 : short -> 2 bytes
        * 3 : long  -> 8 bytes
        * 4 : int -> 4 bytes
        * 5 : double -> 8 bytes
        * 6 : float -> 4 bytes
        * 7 : char    -> 2 bytes
        * 8 : boolean -> 1 byte
        * */
        byte val=8;
        System.out.println("The byte val is : " + val);
        char ch='v';
        System.out.println("The character is : " + ch);
        boolean bol=true;
        System.out.println(bol);
        float price=23.67f;
        System.out.println("The float val is : " + price);
        int num=3000;
        System.out.println("The int val is : " + num);

    }
}
