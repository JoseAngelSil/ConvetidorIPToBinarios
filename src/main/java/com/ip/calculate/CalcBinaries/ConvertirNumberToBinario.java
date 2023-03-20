package com.ip.calculate.CalcBinaries;

public class ConvertirNumberToBinario {
    private static short[] direccionIP = new short[4];
    private static String[] binarioIP = new String[4];
    public ConvertirNumberToBinario(short Oct1, short Oct2, short Oct3, short Oct4 ) {
        direccionIP[0] = Oct1;
        direccionIP[1] = Oct2;
        direccionIP[2] = Oct3;
        direccionIP[3] = Oct4;
    }
   private static void convertirIP(){
       CalculateBinairies octIp[] = new CalculateBinairies[4];
        for(int i = 0; i < 4; i++){
            octIp[i] = new CalculateBinairies();
            octIp[i].setIntNumberBinary(direccionIP[i]);
            octIp[i].convertirBinario();
            char[] binOcteto = octIp[i].getBinario();
            String cadBin = "";
            for (int j = 0; j < 8;j++){
                cadBin += binOcteto[j];
            }
            binarioIP[i] = cadBin;
        }
   }
   public static String getDirecIpBinario(){
        convertirIP();
        String cadBinarioIP = "";
        for (short i = 0; i < 4; i++){
            if (i != 3)
                cadBinarioIP += binarioIP[i] + ".";
            else
                cadBinarioIP += binarioIP[i];
        }
        return  cadBinarioIP;
   }
    public static String getDirecIpDecimal(){
        String cadBinarioIP = "";
        for (short i = 0; i < 4; i++){
            if (i != 3)
                cadBinarioIP += String.valueOf(direccionIP[i]) + ".";
            else
                cadBinarioIP += String.valueOf(direccionIP[i]);
        }
        return  cadBinarioIP;
    }
    public static String getResultado(){
        return String.format("IP Decimal: %s \nIP en binario: %s",
                getDirecIpDecimal(),getDirecIpBinario());
    }
}
