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
        return "Student:   ѧ�ţ�" + number + "   ����:" + name + "   ����:" + age + "   רҵ:" + major + "   �Ա�" + sex;
    }
}

 
	