import java.util.*;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name= " + name + '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Comparator<Student> comparator=new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };
        List<Student> number = new ArrayList<Student>();
        number.add(new Student(12,"Bharath"));
        number.add(new Student(15,"sarath"));
        number.add(new Student(17,"anbumani"));
        number.add(new Student(17,"Dharani"));
        number.add(new Student(19,"ragul"));
        number.add(new Student(21,"karthi"));
        Collections.sort(number, comparator);

        for (Student n:number)
            System.out.println(n);
    }
}