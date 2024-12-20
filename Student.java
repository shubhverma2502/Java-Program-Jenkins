public class Student {
    int id;
    String name;

    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void print(){
        Student student = new Student(2137,"shubham");
        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);
        
    }
}
