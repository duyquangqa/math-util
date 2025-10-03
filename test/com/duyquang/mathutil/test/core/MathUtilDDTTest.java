/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.duyquang.mathutil.test.core;

import com.duyquang.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author nguye
 */


//câu lệnh này là của JUnit báo hiệu rằng sẽ cần loop qua tập data
//để lấy cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //hàm này ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected | Input
    
    @Parameterized.Parameters //sau đây, JUnit sẽ loop qua tửng dòng của mảng để lấu ra được cặp data input/expected
    
    //tên hàm ko qtrong, quan trọng là @
    public static Object[][] initData(){
        return new Integer[][]{
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {6, 720}
                                
        };
    }
    //giả sử loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột vào
    //biến tương ứng input, expected để lát hồi feed cho hàm
    
    
    @Parameterized.Parameter(value = 0) //value = 0 là map với mảng data(ứng với cột 1 tức là a trong {a, b}
    public int n; //biến map với value cột 0 của mảng
    
    @Parameterized.Parameter(value = 1)
    public long expected; //long vì giá trị trả về của hàm getF() là long
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
