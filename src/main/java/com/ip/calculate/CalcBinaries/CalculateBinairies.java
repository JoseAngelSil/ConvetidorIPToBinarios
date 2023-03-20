package com.ip.calculate.CalcBinaries;

public class CalculateBinairies {
    private static int intNumberBinary;
    private static char[] binario = new char[8];

    public void setIntNumberBinary(int intNumberBinary) {
        if (intNumberBinary >= 0 && intNumberBinary <= 255)
            this.intNumberBinary = intNumberBinary;
        else
            this.intNumberBinary = 0;
    }

    public char[] getBinario() {
        return binario;
    }
    protected void convertirBinario(){
        byte j = 0;
        for (int i = 7; i >= 0; i--){
            int base = (int) Math.pow(2,i);
            if (this.intNumberBinary >= base){
                binario[j] = '1';
                intNumberBinary -= base;
                j++;
            }else{
                binario[j] = '0';
                j++;
            }
        }
    }
}
