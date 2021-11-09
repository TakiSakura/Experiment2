package selectCourse;

public class Test {
    public static void main(String[] args) {
        Student me = new Student(2020311571, "张锦程", "MAN");
        System.out.println("学生信息");
        System.out.println(me);
        Teacher b = new Teacher(01, "冯媛", "WOMAN", "线性代数");
        System.out.println("教师信息");
        System.out.println(b);
        Course c = new Course("线性代数", 01, "205", 90f);
        System.out.println("课程信息");
        System.out.println(c);
        me.tuike();
        me.delete();

    }
}   