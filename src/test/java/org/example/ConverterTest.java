package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void numberIsGreaterThan4000000(){
        assertNull(Converter.convertToRoman(5000000));
    }
    @Test
    public void numberIs0(){
        assertNull(Converter.convertToRoman(0));
    }
    @Test
    public void numberIsLessThan4000000(){
        assertNotNull(Converter.convertToRoman(3000000));
    }
    @Test
    public void numberIs1(){
        assertEquals("I",Converter.convertToRoman(1));
    }
    @Test
    public void numberIs4(){
        assertEquals("IV",Converter.convertToRoman(4));
    }
    @Test
    public void numberIs5(){
        assertEquals("V",Converter.convertToRoman(5));
    }
    @Test
    public void numberIs9(){
        assertEquals("IX",Converter.convertToRoman(9));
    }
    @Test
    public void numberIs7(){
        assertEquals("VII",Converter.convertToRoman(7));
    }
    @Test
    public void numberIs10(){
        assertEquals("X",Converter.convertToRoman(10));
    }
    @Test
    public void numberIs14(){
        assertEquals("XIV",Converter.convertToRoman(14));
    }
    @Test
    public void numberIs20(){
        assertEquals("XX",Converter.convertToRoman(20));
    }
    @Test
    public void numberIs33(){
        assertEquals("XXXIII",Converter.convertToRoman(33));
    }
    @Test
    public void numberIs40(){
        assertEquals("XL",Converter.convertToRoman(40));
    }
    @Test
    public void numberIs50(){
        assertEquals("L",Converter.convertToRoman(50));
    }
    @Test
    public void numberIs65(){
        assertEquals("LXV",Converter.convertToRoman(65));
    }
    @Test
    public void numberIs90(){
        assertEquals("XC",Converter.convertToRoman(90));
    }
    @Test
    public void numberIs100(){
        assertEquals("C",Converter.convertToRoman(100));
    }
    @Test
    public void numberIs135(){
        assertEquals("CXXXV",Converter.convertToRoman(135));
    }
    @Test
    public void numberIs150(){
        assertEquals("CL",Converter.convertToRoman(150));
    }
    @Test
    public void numberIs190(){
        assertEquals("CXC",Converter.convertToRoman(190));
    }
    @Test
    public void numberIs375(){
        assertEquals("CCCLXXV",Converter.convertToRoman(375));
    }
    @Test
    public void numberIs400(){
        assertEquals("CD",Converter.convertToRoman(400));
    }
    @Test
    public void numberIs656(){
        assertEquals("DCLVI",Converter.convertToRoman(656));
    }
    @Test
    public void numberIs900(){
        assertEquals("CM",Converter.convertToRoman(900));
    }
    @Test
    public void numberIs1000(){
        assertEquals("M",Converter.convertToRoman(1000));
    }
    @Test
    public void numberIs3465(){
        assertEquals("MMMCDLXV",Converter.convertToRoman(3465));
    }
    @Test
    public void numberIs4578(){
        assertEquals("_I_VDLXXVIII",Converter.convertToRoman(4578));
    }
    @Test
    public void numberIs9234(){
        assertEquals("_I_XCCXXXIV",Converter.convertToRoman(9234));
    }
    @Test
    public void numberIs15000(){
        assertEquals("_X_V",Converter.convertToRoman(15000));
    }
    @Test
    public void numberIs45700(){
        assertEquals("_X_L_VDCC",Converter.convertToRoman(45700));
    }
    @Test
    public void numberIs50000(){
        assertEquals("_L",Converter.convertToRoman(50000));
    }
    @Test
    public void numberIs92800(){
        assertEquals("_X_CMMDCCC",Converter.convertToRoman(92800));
    }
    @Test
    public void numberIs155000(){
        assertEquals("_C_L_V",Converter.convertToRoman(155000));
    }
    @Test
    public void numberIs400000(){
        assertEquals("_C_D",Converter.convertToRoman(400000));
    }
    @Test
    public void numberIs975467(){
        assertEquals("_C_M_L_X_X_VCDLXVII",Converter.convertToRoman(975467));
    }
    @Test
    public void numberIs1268345(){
        assertEquals("_M_C_C_L_X_VMMMCCCXLV",Converter.convertToRoman(1268345));
    }
    @Test
    public void numberIs2567890(){
        assertEquals("_M_M_D_L_X_VMMDCCCXC",Converter.convertToRoman(2567890));
    }
    @Test
    public void numberIs3000789(){
        assertEquals("_M_M_MDCCLXXXIX",Converter.convertToRoman(3000789));
    }
    @Test
    public void numberIs3500000(){
        assertEquals("_M_M_M_D",Converter.convertToRoman(3500000));
    }
    @Test
    public void numberIs3999999(){
        assertEquals("_M_M_M_C_M_X_C_I_XCMXCIX",Converter.convertToRoman(3999999));
    }










}