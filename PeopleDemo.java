package test10;

class People{
    private String name;
    private int age;
    public int num;
    public People(String name,int age,int num){//有参数的构造方法(根据姓名、年龄、编号来初始化对象)
        this.name = name;
        this.age = age;
        this.num = num;
    }
    public void setName(String name){//设置姓名
        this.name = name;
    }
    public String getName(){//获取姓名
        return name;
    }
    public void setAge(int age){//设置年龄
        this.age = age;
    }
    public int getAge(){//获取年龄
        return age;
    }
    public void setNum(int num){//设置编号
        this.num = num;
    }
    public int getNum(){//获取编号
        return num;
    }
    @Override
    public String toString(){
        return "People[name="+name+",age="+age+",num="+num+"]";
    }
}

public class PeopleDemo {

    public static void main(String[] args) {
        People person = new People("李四", 12, 30);//初始化一个人
        System.out.println(person.toString());//格式化输出person的信息
        //person.age = 25;//age是private，不能进行修改
        person.num = 200;//修改公有属性
        System.out.println(person.toString());
        person.setAge(50);//调用包装方法设置年龄
        System.out.println(person.toString());
        System.out.println(person.getAge());
    }
}
