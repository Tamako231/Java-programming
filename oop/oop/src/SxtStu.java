/*
一个学生类
*/

public class SxtStu {
    long id;
    int age=18;
    String sname;

    public void study(){
        System.out.println("正在学习");
    }
    public void football(){
        System.out.println("正在踢球");
    }

    public static void main(String[] args) {
        SxtStu s1= new SxtStu();
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.sname);
        s1.id=110112;
        s1.sname="杜康灿";
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.study();
        s1.football();

    }
}
