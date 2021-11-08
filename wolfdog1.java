package test8;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;
import jdk.nashorn.internal.parser.JSONParser;
import sun.awt.geom.AreaOp;

public class wolfdog1 {
    String name;//狼狗的姓名
    int age;//狼狗的年龄
    String color;//狼狗的颜色
    public void bark(){//狼狗叫
        System.out.println("WolfDog named"+name+"dress"+color+"is bark at age"+age+".");
    }
    public static void main(String[] args){
        wolfdog1 Husky;//声明变量
        Husky = new wolfdog1();//初始化变量
        Husky.bark();//调用方法
    }
}
