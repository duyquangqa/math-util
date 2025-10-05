/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duyquang.mathutil.core;

/**
 *
 * @author nguye
 */
public class MathUtil {
    //trong class này cung cấp cho ta/ai đó nhiều hàm xử lý toán học
    //clone class Math của JDK
    //hàm thư viện sài chung cho ai đó mà không cần lưu lại giá trị  -> chọn thiết kế là hàm static
    
    //hàm tính giai thừa!!
    //n! = 1.2.3.4...n
    //không có giai thừa cho số âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa 18 con số 0, vừa kịp cho đủ kiểu long của JAVA
    //21 giai thừa tràn hiểu long
    //bài này quy ước tính n! trong khoảng từ 0..20
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20){
//            throw new IllegalArgumentException("Invalid Argument. N must be between 0..20");
//           
//        }
//        if(n == 0 || n == 1){
//            return 1; //kết thúc cuộc chơi nếu nhận những đâu vào đặc biệt
//        }
//       long product = 1; //tích nhân dồn, thuật toán con heo đất
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }
    
    
    
    //Học về đệ quy - RECURSION
    //Hiện tượng gọi lại chính mình với 1 quy mô khác 
    //Con búp bê Nga, giống nhau và lồng trong nhau
    //búp bê to -> nhỏ -> nhỏ hơn ->.......-> điểm dừng
    
    //tinh giai thừa 6!
    //n! = 1.2.3.4.5.6....n
    //6! = 6 x 5!
    //5! = 5 x 4!
    //4! = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1! //điểm dừng
    //quy ước 1! = 0! = 1;
    //CHỐT LẠI: n! = n x (n-1)!
    public static long getFactorial(int n){
       
        if(n == 0 || n == 1)
            return 1; //kết thúc cuộc chơi nếu nhận những đâu vào đặc biệt
        
        return n * getFactorial(n - 1); //công thức đệ quy
    }
    
}
