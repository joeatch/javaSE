package com.api.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
* bigdecimal大十进制类型
*   解决浮点数运算精度失真问题
*   add,subtract,multiply,divide
* */
public class Test {
    public static void main(String[] args) {
        System.out.println(0.1+0.2);//0.30000000000000004
//        包装浮点数为bigdecimal对象
        BigDecimal bd=BigDecimal.valueOf(0.1);
        BigDecimal bd2=BigDecimal.valueOf(0.2);
        System.out.println(bd.add(bd2));

        BigDecimal bd3=BigDecimal.valueOf(10);
        BigDecimal bd4=BigDecimal.valueOf(3);
        BigDecimal bd5=bd3.divide(bd4,2, RoundingMode.HALF_UP);
        System.out.println(bd5);
//        将BigDecimal转化为double类型数据
        double res=bd2.doubleValue();
    }
}
