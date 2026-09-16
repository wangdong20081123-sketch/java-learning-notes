package com.dong.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        /*微信余额：0元
        支付宝余额：10元
        银行卡余额：20元
        问题一：请问现在一共有多少钱？
        问题二：微信收了10元红包，又发了2元红包，余额多少？*/
//        1.定义一个变量记录微信余额
        double a =0;
        //        2.定义一个变量记录支付宝余额
        double b =10;
        //        3.定义一个变量记录银行卡余额
        double c =20;
        //        4.计算总金额
        double sum = a+b+c;
        System.out.println("总金额为："+sum);
        //        5.微信收了10元红包，又发了2元红包，余额多少？
        a = a+10-2;
        System.out.println("微信余额为："+a);
        }


    }

