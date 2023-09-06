public class Variables {
    public static void main (String [] args) {
        byte myByteMin = -128; // 8 bit
        byte myByteMax = 127;

        short myShortMin; // 16 bit
        myShortMin = -32768;
        short myShortMax = 32767;

        int myIntMin = -2_147_483_648; // 32 bit
        int myIntMax = 2_147_483_647 ;

        long myLongMin;  // 64 bit
        myLongMin = -9_223_372_036_854_775_808L;
        long myLongMax = 9_223_372_036_854_775_807L;

        float myFloat; // 32 bit
        myFloat = 7833.34F;

        double myDouble; //64 bit
        myDouble = 3489648736487.34343;

        char myChar = 'A'; // 16 bit

        boolean myBool = true;


        System.out.println(myIntMin + myIntMax);
        System.out.println(myBool);
    }
}
