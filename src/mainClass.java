import model.Student;

public class mainClass {
	public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Christian Karl Calano");
        student1.setAge(23);
        student1.setGender("Male");
        student1.setId_no("001");
        
        System.out.println("======Student======");
        System.out.println("Name: "+student1.getName()+"\nAge: "+student1.getAge()+"\nGender: "+student1.getGender()+"\nID NO: "+student1.getId_no());
	}
}
