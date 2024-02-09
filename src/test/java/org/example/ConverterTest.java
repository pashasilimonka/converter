package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenNumberIsGreaterThan4000000Then(){
        assertNull(Converter.convertToRoman(5000000));
    }
    @Test
    public void whenNumberIs0Then(){
        assertNull(Converter.convertToRoman(0));
    }
    @Test
    public void whenNumberIsLessThan4000000Then(){
        assertNotNull(Converter.convertToRoman(3000000));
    }
    @Test
    public void whenNumberIs1Then(){
        assertEquals("I",Converter.convertToRoman(1));
    }
    @Test
    public void whenNumberIs4Then(){
        assertEquals("IV",Converter.convertToRoman(4));
    }
    @Test
    public void whenNumberIs5Then(){
        assertEquals("V",Converter.convertToRoman(5));
    }
    @Test
    public void whenNumberIs9Then(){
        assertEquals("IX",Converter.convertToRoman(9));
    }
    @Test
    public void whenNumberIs7Then(){
        assertEquals("VII",Converter.convertToRoman(7));
    }
    @Test
    public void whenNumberIs10Then(){
        assertEquals("X",Converter.convertToRoman(10));
    }
    @Test
    public void whenNumberIs30Then(){
        assertEquals("XXX",Converter.convertToRoman(30));
    }
    @Test
    public void whenNumberIs40Then(){
        assertEquals("XL",Converter.convertToRoman(40));
    }
    @Test
    public void whenNumberIs50Then(){
        assertEquals("L",Converter.convertToRoman(50));
    }
    @Test
    public void whenNumberIs60Then(){
        assertEquals("LX",Converter.convertToRoman(60));
    }
    @Test
    public void whenNumberIs80Then(){
        assertEquals("LXXX",Converter.convertToRoman(80));
    }
    @Test
    public void whenNumberIs90Then(){
        assertEquals("XC",Converter.convertToRoman(90));
    }
    @Test
    public void whenNumberIs100Then(){
        assertEquals("C",Converter.convertToRoman(100));
    }

    @Test
    public void whenNumberIs300Then(){
        assertEquals("CCC",Converter.convertToRoman(300));
    }
    @Test
    public void whenNumberIs400Then(){
        assertEquals("CD",Converter.convertToRoman(400));
    }
    @Test
    public void whenNumberIs500Then(){assertEquals("D",Converter.convertToRoman(500));}

    @Test
    public void whenNumberIs600Then(){
        assertEquals("DC",Converter.convertToRoman(600));
    }
    @Test
    public void whenNumberIs900Then(){
        assertEquals("CM",Converter.convertToRoman(900));
    }
    @Test
    public void whenNumberIs1000Then(){
        assertEquals("M",Converter.convertToRoman(1000));
    }
    @Test
    public void whenNumberIs3000Then(){
        assertEquals("MMM",Converter.convertToRoman(3000));
    }
    @Test
    public void whenNumberIs4000Then(){
        assertEquals("_I_V",Converter.convertToRoman(4000));
    }
    @Test
    public void whenNumberIs5000Then(){
        assertEquals("_V",Converter.convertToRoman(5000));
    }
    @Test
    public void whenNumberIs6000Then(){
        assertEquals("_VM",Converter.convertToRoman(6000));
    }
    @Test
    public void whenNumberIs8000Then(){
        assertEquals("_VMMM",Converter.convertToRoman(8000));
    }
    @Test
    public void whenNumberIs9000Then(){
        assertEquals("_I_X",Converter.convertToRoman(9000));
    }

    @Test
    public void whenNumberIs10000Then(){
        assertEquals("_X",Converter.convertToRoman(10000));
    }
    @Test
    public void whenNumberIs30000Then(){
        assertEquals("_X_X_X",Converter.convertToRoman(30000));
    }
    @Test
    public void whenNumberIs40000Then(){
        assertEquals("_X_L",Converter.convertToRoman(40000));
    }
    @Test
    public void whenNumberIs50000Then(){
        assertEquals("_L",Converter.convertToRoman(50000));
    }
    @Test
    public void whenNumberIs60000Then(){
        assertEquals("_L_X",Converter.convertToRoman(60000));
    }
    @Test
    public void whenNumberIs80000Then(){
        assertEquals("_L_X_X_X",Converter.convertToRoman(80000));
    }
    @Test
    public void whenNumberIs90000Then(){
        assertEquals("_X_C",Converter.convertToRoman(90000));
    }
    @Test
    public void whenNumberIs100000Then(){
        assertEquals("_C",Converter.convertToRoman(100000));
    }
    @Test
    public void whenNumberIs300000Then(){
        assertEquals("_C_C_C",Converter.convertToRoman(300000));
    }
    @Test
    public void whenNumberIs400000Then(){
        assertEquals("_C_D",Converter.convertToRoman(400000));
    }
    @Test
    public void whenNumberIs500000Then(){
        assertEquals("_D",Converter.convertToRoman(500000));
    }
    @Test
    public void whenNumberIs600000Then(){
        assertEquals("_D_C",Converter.convertToRoman(600000));
    }
    @Test
    public void whenNumberIs800000Then(){
        assertEquals("_D_C_C_C",Converter.convertToRoman(800000));
    }
    @Test
    public void whenNumberIs900000Then(){
        assertEquals("_C_M",Converter.convertToRoman(900000));
    }
    @Test
    public void numberIs1000000(){
        assertEquals("_M",Converter.convertToRoman(1000000));
    }
    @Test
    public void numberIs3000000(){
        assertEquals("_M_M_M",Converter.convertToRoman(3000000));
    }

    @Test
    public void numberIs3999999(){
        assertEquals("_M_M_M_C_M_X_C_I_XCMXCIX",Converter.convertToRoman(3999999));
    }










}