
package selectCourse;
 
 
public class Student extends Person{ 
    String c;
    public Student(int number, String name,String sex) {
		super(number,name,sex);
		this.number = number;
		this.name = name;
		this.sex = sex;
	}

	 public String toString(){
	        return "Student(学生信息):  姓名：" + name
	                + "    学号：" + number + "   性别：" + sex ;
	    }
	 void tuike() {
    	 c=null;
     }
	 void delete() {
	      if(c== null);{
	  	  System.out.println("学生目前未选课");}
	  	 
	    }
}

 
	