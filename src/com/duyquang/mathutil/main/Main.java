/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duyquang.mathutil.main;

import com.duyquang.mathutil.core.MathUtil;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        
        
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay không
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        //ví dụ: -5 coi tính được không
        //      0 coi tính mấy
        //      20 coi tính mấy
        //      21 coi tính mấy
        //TEST CASE: 1 tình huống hàm/app/màn hình/tính ắng được đưa vào sử dụng
        //giả lập hành vi xài của ai đó
        
        //TEST CASE: LÀ 1 TÌNH HUỐNG SỬ DỤNG, XÀI APP (HÀM) MÀ NÓ BAO HÀM
        //DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        //IUTPUT ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        //OUTPUT: ĐẦU RA ỨNG VỚI XỬ LÝ CỦA HÀM/CHỨC NĂNG CỦA AP, DĨ NHIÊN DÙNG ĐÂÌ VÀO ĐỂ XỬ LÝ
        //KỲ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
        //SO SÁNH XEM ĐỂ XEM KẾT QUẢ CÓ NHƯ KỲ VỌNG
        
        long expected = 120; //tao kỳ vọng ói về 120 nếu tính 5!
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected" );
        System.out.println("5! = " + actual + " actual" );
    }
}
