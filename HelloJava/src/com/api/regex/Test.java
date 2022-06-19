package com.api.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* 正则表达式
*   正则表达式可以用一些规定的字符来制定规则，并用来校验数据格式的合法性。
* */
public class Test {
    public static void main(String[] args) {
//        正则表达式检查字符的格式
        String re="93838888";
        System.out.println(checkQQ(re));
        System.out.println(checkQQ2(re));
//        按照正则表达式匹配的内容进行替换replaceAll(String regex,String newStr)

//        按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组。split(String regex)：

//          正则表达式支持爬取信息
        String rs = "来黑马程序学习Java,电话020-43422424，或者联系邮箱"+"itcast@itcast.cn,电话18762832633，0203232323"+"邮箱bozai@itcast.cn，400-100-32334001003232";
        // 需求：从上面的内容中爬取出 电话号码和邮箱。// 1.定义爬取规则
        String regex = "(\\w{1,}@\\w{2,10}(\\.\\w{2,10}){1,2})|"+ "(1[3-9]\\d{9})|(0\\d{2,5}-?\\d{5,15})|400-?\\d{3,8}-?\\d{3,8}";
        // 2.编译正则表达式成为一个匹配规则对象
        Pattern pattern = Pattern.compile(regex);
        // 3.通过匹配规则对象得到一个匹配数据内容的匹配器对象
        Matcher matcher = pattern.matcher(rs);
        // 4.通过匹配器去内容中爬取出信息
        while(matcher.find()){
            System.out.println(matcher.group());
        }


//        需求：假如现在要求校验一个qq号码是否正确，6位及20位之内，必须全部是数字 。
    }
    public static boolean checkQQ2(String res){
       return res.matches("\\d{6,20}");
    }
    public static boolean checkQQ(String res){
        if(res==null||res.length()<6||res.length()>20){
            return false;
        }
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)<'0'||res.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
}
