package com.ip.calculate;

import com.ip.calculate.CalcBinaries.ConvertirNumberToBinario;

import javax.swing.*;

public class Main {
    static short Oct1,Oct2, Oct3, Oct4;
    public static void main(String[] args) {
        solDatos();
        doCalculate();
    }
    private static void solDatos(){
        JOptionPane.showMessageDialog(null, "BIENVENIDO...\n" +
                "Ingrese la ip seccionado en 4 octetos" +
                "\nEl rango tiene que ser desde 0 a 255");
        Oct1 = Short.parseShort(JOptionPane.showInputDialog("Octeto1"));
        Oct2 = Short.parseShort(JOptionPane.showInputDialog("Octeto2"));
        Oct3 = Short.parseShort(JOptionPane.showInputDialog("Octeto3"));
        Oct4 = Short.parseShort(JOptionPane.showInputDialog("Octeto4"));
    }
    private static void doCalculate(){
        ConvertirNumberToBinario binIP = new ConvertirNumberToBinario(Oct1,
                Oct2,
                Oct3,
                Oct4);
        JOptionPane.showMessageDialog(null,binIP.getResultado());
    }
}
