package org.example;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Converter {

    public static String convertArabicToRoman(int number,String one, String five, String ten){

        if(number>=1&&number<4){
            String result = "";
            for (int i = 0; i < number; i++) {
                result+=one;
            }
            return result;
        }
        else if(number==4){
            return one+five;
        } else if (number==5) {
            return five;
        } else if (number>5&&number<9) {
            String result = "";
            result+=five;
            for (int i = 0; i < number-5; i++) {
                result+=one;
            }
            return result;
        } else if (number==9) {
            return one+ten;
        }else if (number==10){
            return ten;
        }

        return "";
    }
    public static String convertToRoman(int number){
        String result = "";
        if (number<=0||number>4000000){
            return null;
        }
        String oneToRoman = convertArabicToRoman(number%10,"I","V","X");
        number/=10;
        String tenToRoman = convertArabicToRoman(number%10,"X","L","C");
        number/=10;
        String hundredToRoman = convertArabicToRoman(number%10,"C","D","M");
        number/=10;
        String thousandToRoman = "";
        if (number%10<4||(number%10>5&&number%10<9)){

            thousandToRoman+= convertArabicToRoman(number%10,"M","_V","_X");
        }
        else{
            thousandToRoman+= convertArabicToRoman(number%10,"_I","_V","_X");
        }
        number/=10;
        String tenThousandToRoman = convertArabicToRoman(number%10,"_X","_L","_C");
        number/=10;
        String hundredThousandToRoman = convertArabicToRoman(number%10,"_C","_D","_M");
        number/=10;
        String illionToRoman = convertArabicToRoman(number%10,"_M","","");
        result+=illionToRoman+hundredThousandToRoman+tenThousandToRoman+thousandToRoman+hundredToRoman+tenToRoman+oneToRoman;
        return result;
    }
}
