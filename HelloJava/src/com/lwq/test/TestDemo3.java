package com.lwq.test;

import java.util.Random;

/*案例3:开发验证码
* 定义方法实现随机产生一个指定位数的验证码，每位可能是数字、大写、小写字母
*
*定义一个方法，生成验证码返回：返回值类型是String，需要形参接收位数。
*在方法内部使用for循环依次生成每位随机字符，并连接起来。
*把连接好的随机字符作为一组验证码返回。
* */
public class TestDemo3 {
    public static void main(String[] args) {
        System.out.println(randomGen(4));
    }
    //定义一个可能生成大写字母、小写字母、数字的方法
    public static String randomGen(int length){
        String base = "wqetryuioplkjhgfdsazxcvbmnABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rd=new Random();
        //用来接收生成验证码的变量
        StringBuilder res= new StringBuilder();
        for(int i=0;i<length;i++){
            int p=rd.nextInt(base.length());
            res.append(base.charAt(p));
        }
        return res.toString();
    }
}
