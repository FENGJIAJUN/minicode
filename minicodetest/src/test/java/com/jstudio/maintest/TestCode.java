package com.jstudio.maintest;

import com.jstudio.main.MiniCodeTest;
import org.junit.Test;

public class TestCode {
    @Test
    public void test1(){
        int[] number = { 2, 3};
        int n = number.length;
        MiniCodeTest.digitalConverts(number, n);
    }

    @Test
    public void test2(){
        int[] number = { 9};
        int n = number.length;
        MiniCodeTest.digitalConverts(number, n);
    }

}
