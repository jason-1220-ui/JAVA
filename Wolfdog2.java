package test9;
public class Wolfdog2 {
    String name;
    int age;
    String color;
    public Wolfdog2(){}//无参构造函数
    public void bark(){//无参返回方法
        System.out.println("Wolfdog2 bark.");
    }
    public String barkReturn(String name){//有参数有返回值的方法
        System.out.println("Wolfdog2 bark.Named"+name);
        return name;
    }
    public static void main(String[] args){
        Wolfdog2 dog =new Wolfdog2();//定义并初始化数据
        dog.bark();//调用无参返回方法
        String name1="Husky";
        String name2=dog.barkReturn(name1);//使用String接受有返回值的方法
        System.out.println(name2);
    }
}
