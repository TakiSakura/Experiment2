# Experiment2
## 实验目的
* 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
* 掌握面向对象的类设计方法（属性、方法）；
* 掌握通过构造方法实例化对象；
* 学会使用数组。
## 业务要求
* 学校人员分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。
* 每名教师可讲授多门课程，每名学生可选修多门课程。
* 多门课程，可用课程数组形式表达。
* 对象示例：
* 教师（编号、姓名、性别、所授课程、......）
* 学生（编号、姓名、性别、所选课程、......）
* 课程（编号、课程名称、上课地点、时间、......）
## 实验要求
1.编写上述实体类以及测试主类\
2.在测试主类中，实例化多个类实体 \
3.模拟教师开设某课操作；学生选课操作、退课操作
* 打印学生课表信息（包括：编号、课程名称、上课地点、时间、授课教师等
* 编写实验报告。
## 解题思路
1. 首先定义三个角色类，分别为教师Teacher类、学生Students类、课程Course类。
2. 通过理解实验目的，弄清楚这三个类之间的关系。其中course类将其他两个类联结起来。学生去选择课程，而老师则是去教授课程。
3. 本次我想设计的是学生可以选多门课程，老师只交一节课。所以老师只绑定了一个课程。而学生如何去绑定多门课程，这就需要用到数组
4. 这次创建的数组不是int型也不是string型，而是course型。因为string型只能存放较少信息。如果定义course型。在覆盖Object根类中的toString后。\
就能将course类中的所有信息，存放在student类中的列表内，并可以以字符串形式表现出来
5. 在初始化对象的时候用到了构造方法。在student和teacher类中定义属性，并构建构造方法，并在test类中实例化，并填入相应的参数，完成实例化。
6. 在学生类中创建SetCourse方法。目的是在实例化学生对象后，以一个具体学生的身份，调用这个方法，就能达到将一个列表赋给一个具体对象的目的
7. 在student和teacher类中用到了toString方法。目的是将所要显示的内容以字符串的形式显示出来
8. 最后打印出学生老师和课程的信息
## 关键代码
1.学生与老师的构造函数
```
public Student(int number, String name, int age, String major, String sex) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.major = major;
        this.sex = sex;
    }
```
```
public Teacher(int number, String name,String sex, String lesson) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.lesson = lesson;
    }
```
2.实例化学生与老师还有课程
```
Student friend = new Student(2020311571, "张锦程", 21, "安全工程", "MAN");
Student me = new Student(2020311593, "熊文豪", 20, "物联网", "MAN");
```
```
Teacher b = new Teacher(1, "冯媛", "WOMAN", "线性代数");
Teacher d = new Teacher(2, "魏薇", "WOMAN", "离散数学");
Teacher e = new Teacher(3, "张建军", "MAN", "机械工程基础");
```
```
Course c = new Course("线性代数", "MATH201-1", "205", 90f);
Course f = new Course("离散数学", "CST201-1", "303", 90f);
Course g = new Course("机械工程基础", "null", "3402", 90f);
```
3.使用toString方法，将类中的信息，转化为字符串形式，方便输出
```
public String toString() {
        return "Student:   学号：" + number + "   姓名:" + name + "   年龄:" + age + "   专业:" + major + "   性别：" + sex;
    }
```
```
public String toString() {
        return "Teacher:" + "   编号：" + number + "    姓名：" + name + "   性别：" + sex + "     所授课程：" + lesson;
    }
```
```
public String toString() {
        return CourseName + "     课程编号：" + id + "   上课地点：" + place + "    课程时间：" + time + "min";
    }
```
4.在学生类中创造课程列表，并定义SetCourse方法。将Course类中的信息，放到列表中
```
Course[] CourseList = new Course[2];
void setCourse(Course[] s) {
        this.CourseList = s;
    }
```
```
Course[] CourseList1 = new Course[2];
Course[] CourseList2 = new Course[2];
CourseList1[0] = c;
CourseList1[1] = g;
CourseList2[0] = c;
CourseList2[1] = f;
friend.setCourse(CourseList1);
me.setCourse(CourseList2);
```
5.输出信息
```
System.out.println("学生" + friend.name + "所选课程:\n" + friend.CourseList[0] + "\n" + friend.CourseList[1]);
        System.out.println("学生" + me.name + "所选课程:\n" + me.CourseList[0] + "\n" + me.CourseList[1]);
```
##感想与体会
* 这次实验让我对构造方法的使用更加熟悉了。在有相同名称的构造方法的情况下，只要方法中的参数类型和个数不同，就能互不干扰。
* 本次实验第一次用到了数组。并让我了解到，java的数组不只限于int和string类型。该可以根据类本身定义类型，这让我有了很多的想法，并迫不及待的去尝试数组的更多用途
* 编写代码的过程中遇到了很多的麻烦。例如代码的语法或者格式不对，导致报错和无法运行。我觉得这是我对某些知识或者代码样式还没完全记下来。导致不能以正确的方式表达出来
* 
