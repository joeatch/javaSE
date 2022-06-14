package com.lwq.test;


import java.util.Objects;
import java.util.Scanner;

/*案例1
*机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
*机票最终优惠价格的计算方案如下：
* 旺季（5-10月）头等舱9折，经济舱8.5折，
* 淡季（11月到来年4月）头等舱7折，经济舱6.5折。
 * */
public class TestDemo1 {
    public static void main(String[] args) {
        AirplaneTicket ap=new AirplaneTicket();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票原价");
        ap.price=sc.nextDouble();
        System.out.println("请输入购买机票的月份");
        ap.month=sc.nextInt();
        System.out.println("请输入头等舱还是经济舱");
        ap.type=sc.next();
        System.out.println("实际购买机票的价格为");
        System.out.println(ap.priceCal(ap));
    }

    //创建一个机票类，机票类的信息包括机票原价，机票所属月份，头等舱还是经济舱
    public static class AirplaneTicket{
        //属性
        public double price;
        public int month;
        public String type;
        //方法
        public double priceCal(AirplaneTicket ap){
            double finalPrice=0;
            if(ap.month>=5&ap.month<=10){
                if(Objects.equals(ap.type, "头等舱")){
                    finalPrice= ap.price*0.9;
                }else{
                    finalPrice= ap.price*0.85;
                }
            }else{
                if(Objects.equals(ap.type, "头等舱")){
                    finalPrice= ap.price*0.7;
                }else{
                    finalPrice= ap.price*0.65;
                }
            }
            return finalPrice;
        }
    }

}
