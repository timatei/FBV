import java.util.Scanner;


class ConversorDecBinOctHex {
    /**
     * Converte decimal em bin�rio
     * */
    public static String ConverterDecimalToBinario(int numeroDecimal){
        String binario = "";
        if (numeroDecimal==0){return "0";}
        while(numeroDecimal > 0) {
            binario = (numeroDecimal % 2) + binario;
            numeroDecimal /= 2;
        }
        return binario;
    }
 
    /**
     * Converte decimal em Octal
     * */
    public static String ConverterDecimalToOctal(int numeroDecimal){
        String octal = "";
        if (numeroDecimal == 0){return "0";}
        while(numeroDecimal > 0) {
            octal = (numeroDecimal % 8) + octal;
            numeroDecimal /= 8;
        }
        return octal;
    }
 
    /**
     * Converte decimal em hexadecimal
     * */
    public static String ConverterDecimalToHexa(int numeroDecimal){
        String hexa = "";
        if (numeroDecimal==0){return "0";}
        while(numeroDecimal > 0) {
            hexa = ConvertToHexa((numeroDecimal % 16)) + hexa;
            numeroDecimal /= 16;
        }
        return hexa;
    }
 
    //-------------------------------------------------
    /**
     * Converte binario em decimal
     * */
    public static int ConverterBinarioToDecimal(String numeroBinario){
        int sum = 0;
        int size = numeroBinario.length();
        char c;
        for(int i = 0; i < size; i++){
            c = numeroBinario.charAt(i);
            if (c == '0') continue;
            sum += Math.pow(2, (size-(i+1)));
        }
        return sum;
    }
    /**
     * Converte octal em decimal
     * */
    public static int ConverterOctalToDecimal(int numeroOctal) {
        return ConverterOctalToDecimal(String.valueOf(numeroOctal));
    }
    /**
     * Converte octal em decimal
     * */
    public static int ConverterOctalToDecimal(String numeroOctal){
        int sum = 0;
        int size = numeroOctal.length();
        char c;
        for(int i = 0; i < size; i++){
            c = numeroOctal.charAt(i);
            if (c == '0') continue;
            sum += Integer.parseInt(String.valueOf(c)) * Math.pow(8, (size-(i+1)));
        }
        return sum;
    }
    /**
     * Converte hexadecimal em decimal
     * */
    public static int ConverterHexaToDecimal(String numeroHexaDecimal){
        int sum = 0;
        int size = numeroHexaDecimal.length();
        char c;
        int multp = 0;
        for(int i = 0; i < size; i++){
            c = numeroHexaDecimal.charAt(i);
            if (c == '0') continue;
            multp = ConvertFromHexa(c); if (multp <= 0) continue;
            sum += multp * Math.pow(16, (size-(i+1)));
        }
        return sum;
    }
 
    //-------------------------------------------------
    /**
     * Converte hexadecimal em bin�rio
     * */
    public static String ConverterHexaToBinario(String numeroHexaDecimal) {
        String binario = ""; String nBin;
        for(int i = 0; i < numeroHexaDecimal.length(); i++){
            nBin = ConverterDecimalToBinario(ConvertFromHexa(numeroHexaDecimal.charAt(i)));
            while(nBin.length() < 4){nBin="0" + nBin;}
            binario += nBin;
        }
        //while(binario.startsWith("0")) binario = binario.substring(1);
        return binario;
    }
    /**
     * Converte bin�rio em hexadecimal
     * */
    public static String ConverterBinarioToHexa(String numeroBinario){
        String hexaDecimal = "";
        if (numeroBinario.length() <= 4) {
            return ConvertToHexa(ConverterBinarioToDecimal(numeroBinario));
        }
        int size = numeroBinario.length();
        //pares de 4
        String parS4;
        for(int i = 0; i < size; i += 4){
            parS4 = numeroBinario.substring(i, i+4 < size ? i+4 : size);
            hexaDecimal += ConvertToHexa(ConverterBinarioToDecimal(parS4));
        }
        return hexaDecimal;
    }
    //-------------------------------------------------
    /**
     * Converte octal em bin�rio
     * */
    public static String ConverterOctalToBinario(String numeroOctal) {
        String binario = ""; String nBin;
        for(int i = 0; i < numeroOctal.length(); i++){
            nBin = ConverterDecimalToBinario(ConvertFromHexa(numeroOctal.charAt(i)));
            while(nBin.length() < 3){nBin="0" + nBin;}
            binario += nBin;
        }
        while(binario.length()%2!=0){binario="0"+binario;}
        //while(binario.startsWith("0")) binario = binario.substring(1);
        return binario;
    }
    /**
     * Converte bin�rio em octal
     * */
    public static String ConverterBinarioToOctal(String numeroBinario){
        while(numeroBinario.startsWith("0")) {numeroBinario = numeroBinario.substring(1);}
        String octal = "";
        if (numeroBinario.length() <= 3) {
            return ConverterDecimalToOctal(ConverterBinarioToDecimal(numeroBinario));
        }
        int size = numeroBinario.length();
        //pares de 3
        String parS3;
        for(int i = 0; i < size; i += 3){
            parS3 = numeroBinario.substring(i, i+3 < size ? i+3 : size);
            octal += ConverterDecimalToOctal(ConverterBinarioToDecimal(parS3));
        }
        return octal;
    }
    //-------------------------------------------------
    /**
     * Converte octal em hexadecimal
     * */
    public static String ConverterOctalHexaDecimal(String numeroOctal) {
        return ConverterBinarioToHexa(ConverterOctalToBinario(numeroOctal));
    }
    /**
     * Converte hexadecimal em octal
     * */
    public static String ConverterHexaToOctal(String numeroHexadecimal) {
        return ConverterBinarioToOctal( ConverterHexaToBinario(numeroHexadecimal));
    }
    //-------------------------------------------------
    /**
     * Fun��o auxiliar qua transforma um int em um valor de representa��o hexadecimal.
     * Ex: 10=A, 11=B, etc..
     * */
    public static String ConvertToHexa(int numeroDecimal) {
        return ConvertToHexa(String.valueOf(numeroDecimal));
    }
    /**
     * Fun��o auxiliar qua transforma uma String em um valor de representa��o hexadecimal.
     * Ex: 10=A, 11=B, etc..
     * */
    public static String ConvertToHexa(String numeroDecimal) {
        if (numeroDecimal.equals("10")) { return "A"; }
        else if (numeroDecimal.equals("11")) { return "B"; }
        else if (numeroDecimal.equals("12")) { return "C"; }
        else if (numeroDecimal.equals("13")) { return "D"; }
        else if (numeroDecimal.equals("14")) { return "E"; }
        else if (numeroDecimal.equals("15")) { return "F"; }
        return numeroDecimal;
    }
    /**
     * Fun��o auxiliar que recupera o valor inteiro de um char hexadecimal.
     * Ex: A=10, B=11, etc..
     * */
    public static int ConvertFromHexa(char c){
        if (c == 'A') { return 10; }
        else if (c == 'B') { return 11; }
        else if (c == 'C') { return 12; }
        else if (c == 'D') { return 13; }
        else if (c == 'E') { return 14; }
        else if (c == 'F') { return 15; }
        try { return Integer.parseInt(String.valueOf(c)); } catch (Exception e) {
            return -1;
        }
    }
}
 
public class main {
 
   
    public static void main(String[] args) {
        //ConversorDecBinOctHex.ConverterDecimalToBinario, ConversorDecBinOctHex.ConverterBinarioToDecimal
        //ConversorDecBinOctHex.ConverterDecimalToOctal, ConversorDecBinOctHex.ConverterOctalToDecimal
        //ConversorDecBinOctHex.ConverterDecimalToHexa, ConversorDecBinOctHex.ConverterHexaToDecimal
        //ConversorDecBinOctHex.ConverterHexaToBinario, ConversorDecBinOctHex.ConverterBinarioToHexa
        //ConversorDecBinOctHex.ConverterOctalToBinario, ConversorDecBinOctHex.ConverterBinarioToOctal
        //ConversorDecBinOctHex.ConverterOctalHexaDecimal, ConversorDecBinOctHex.ConverterHexaToOctal
    	Scanner sc = new Scanner(System.in);
        int numeroDecimal = 0;
        System.out.println("Digite o Numero Decimal para Convers�o: ");
        numeroDecimal = sc.nextInt();
        String binario = ConversorDecBinOctHex.ConverterDecimalToBinario(numeroDecimal);
        String octal = ConversorDecBinOctHex.ConverterDecimalToOctal(numeroDecimal);
        String hexa = ConversorDecBinOctHex.ConverterDecimalToHexa(numeroDecimal);
 
        System.out.println("Decimal: " +numeroDecimal+  " = (binario) " + binario + " = (decimal) " + ConversorDecBinOctHex.ConverterBinarioToDecimal(binario));
 
        binario = ConversorDecBinOctHex.ConverterOctalToBinario(octal);
        System.out.println("Decimal: " +numeroDecimal+  " = (octal) " + octal + " = (decimal) " + ConversorDecBinOctHex.ConverterOctalToDecimal(octal) + " = (binario) " + binario + " = (octal) " + ConversorDecBinOctHex.ConverterBinarioToOctal(binario));
 
        binario = ConversorDecBinOctHex.ConverterHexaToBinario(hexa);
        System.out.println("Decimal: " + numeroDecimal+  " = (hexa) " + hexa + " = (decimal) = " + ConversorDecBinOctHex.ConverterHexaToDecimal(hexa) + " = (binario) " + binario + " = (hexa) " + ConversorDecBinOctHex.ConverterBinarioToHexa(binario));
 
        System.out.println("-----------------------------");
        //converterBinarioToHexa
        System.out.println("octal: " + octal + " = (hexadecimal) " + ConversorDecBinOctHex.ConverterOctalHexaDecimal(octal) );
        System.out.println("hexa: " + hexa  + " = (octal) " + ConversorDecBinOctHex.ConverterHexaToOctal(hexa));
    }
 
}