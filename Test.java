package selectCourse;

public class Test {
    public static void main(String[] args) {
        Student me = new Student(2020311571, "�Ž���", "MAN");
        System.out.println("ѧ����Ϣ");
        System.out.println(me);
        Teacher b = new Teacher(01, "����", "WOMAN", "���Դ���");
        System.out.println("��ʦ��Ϣ");
        System.out.println(b);
        Course c = new Course("���Դ���", 01, "205", 90f);
        System.out.println("�γ���Ϣ");
        System.out.println(c);
        me.tuike();
        me.delete();

    }
}   