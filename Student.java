package selectCourse;


public class Student {
    Course[] CourseList = new Course[2];
    int number;
    String name;
    int age;
    String major;
    String sex;

    public Student(int number, String name, int age, String major, String sex) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.major = major;
        this.sex = sex;
    }

    void setCourse(Course[] s) {
        this.CourseList = s;
    }

    public String toString() {
        return "Student:   学号：" + number + "   姓名:" + name + "   年龄:" + age + "   专业:" + major + "   性别：" + sex;
    }
}

 
	