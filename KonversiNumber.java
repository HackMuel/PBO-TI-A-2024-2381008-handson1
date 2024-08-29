public class KonversiNumber {
    public static void main(String[] args) {
        //Widening
        byte tipeDataByte = 10;
        System.out.println(tipeDataByte);
        short tipeDataShort = tipeDataByte;
        System.out.println(tipeDataShort);
        int tipeDataInt = tipeDataShort;
        System.out.println(tipeDataInt);
        long tipeDataLong = tipeDataInt;
        System.out.println(tipeDataLong);
        float tipeDataFloat = tipeDataLong;
        System.out.println(tipeDataFloat);
        double tipeDataDouble = tipeDataFloat;
        System.out.println(tipeDataDouble);

        //Narrowing
        int tipeDataInt2 = 129;
        byte tipeDataByte2 = (byte) tipeDataInt2;
        System.out.println(tipeDataByte2);
    }
}
