package selectCourse;

public class Teacher{
    int number;
    String name;
    String sex;
    String lesson;

    public Teacher(int number, String name,String sex, String lesson) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.lesson = lesson;
    }



    public String toString() {
        return "Teacher:" + "   ��ţ�" + number + "    ������" + name + "   �Ա�" + sex + "     ���ڿγ̣�" + lesson;
    }

}