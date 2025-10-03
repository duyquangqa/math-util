/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.duyquang.mathutil.test.core;

import com.duyquang.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author nguye
 */
public class MathUtilityTest {
    //Đây là class sẽ sử dụng các hàm của thư viện JUnit để kiểm tra code chính( KT giai thừa bên clas.core.MathUtil
    //Viết code để test code chính bên kia

    //có nhiều qtac đặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử
    //tình huống xài hàm theo kieue thành công và thất bại
    //hàm dưới đây là tính huống test hàm chạy thành côgn, trả về ngon
    //ta sẽ xài hàm kiểu well - đưa 5!. 6! hok chơi đưa -5!
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test tình huống tử tế đâu vào, mày phải chạt đúng

        long expected = 1; //hy vọng 0! = 1
        //long actual = ; //gọi hàm cần test bên core/app chính//code chính
        long actual = MathUtil.getFactorial(n);

        //so sánh expected vs. actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);

        //gộp thêm vài case thành công/đưa đầu vào ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1)); //muốn 1! = 1
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
    }    //hàm giúp so sánh 2 gtri nào đó có giống nhau không
    //nếu giống -> thấy màu xanh đèn đường - đường thông, code ngon ít nhất  cho case đang test
    //nếu không -> thấy màu đỏ đèn đường
    //hàm ý không giống nhau giữa kỳ vọng và thực tế trả ra

    //hàm getF() ta thiết kế có 2 tình huôgs xử lí
    //1. đưa data tử tế  [0...20] ->Tính đúng được n! - done
    //2. đưa data vào cà chớn, âm, >20; THiết kế của hàm là nén ngoại lệ
    //Tao kỳ vọng ngoại lệ xuất hiện khi n < 0 || n > 20
    //rất mong ngoại lệ xuất hiện với n cà chơn này
    //nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ném ra ngoại lệ
    //-> Hàm chạy đúng như thiết kế -> XANH PHẢI XUẤT HIỆN
    //nếu hàm nhận vào n < 0 hoặc n > 20
    //sure, hàm chạy sai thiết kế, sai kỳ vọng, màu đỏ
    //Test case:
    //input: -5
    //expected: IllegalArgumentException xuất hiện
    //tình huống bất thường, ngaoị lệ, ngaoì dự tính, dự liệu
    //là những thé ko thể do lường so sánh theo kiểu value mà chỉ có thể đo lường = cách chúng có xuất hiệnkhông
    //assertEquals() ko dùng so sánh 2 ngoại lệ
    //equals() là bằng nhau hay ko trên value
    //MÀU ĐỎ, DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT, NHƯNG KO PAHỈ LÀ NGOẠI LỆ NHƯ KỲ VỌNG - THỰC SW KỲ VỌNG SAI. KHONG PHẢO HÀM NÉM SAI
//   @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowException(){
//        MathUtil.getFactorial(-5); //hàm @Test, hay getF() chạy
//                                    //sẽ ném về ngoại lệ NumberFormat...
//   }   
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowException() {
        MathUtil.getFactorial(-5); //hàm @Test, hay getF() chạy
        //sẽ ném về ngoại lệ NumberFormat...
    }
    //CÁCH KHÁC ĐỂ BẮT NGOẠI LỆ XUẤT HIỆN, VIẾT TỰ NHIÊN HƠN
    //xài lamda

    //Test case: hàm sẽ nèm về ngoại lệ nếu nhận vào 21
    //tôi cần thấy màu xanh khi chơi với 21 giai thừa
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_LamdaVersion() {

    }

    //Bắt ngoại lệ, xem hàm có ném về ngoại lệ ko khi n cà chớn
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_LamdaVersion_TryCatch() {

        //chủ động kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(-5); //hàm @Test, hay getF() chạy
            //sẽ ném về ngoại lệ NumberFormat...
        } catch (Exception e) {
            //bắt try catch là JUnit sẽ ra màu xanh vì đã chủ động kiểm soát ngoại lêj
            //nhưng ko chắc ngoại lệ mình cần có xuất hiện hay không??
            //-> phải có đoạn code kiêmrr soát đúng ngoại lệ IllegalArgument xuất hiện

            Assert.assertEquals("Invalid Argument. N must be between 0..20",
                    e.getMessage());

        }

    }
}
