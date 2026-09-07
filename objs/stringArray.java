class Student{
    String name;
    int marks;
    int rollno;
}

public class stringArray {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "sudeep";
        s1.marks = 90;
        s1.rollno = 5;

        Student s2 = new Student();
        s2.name = "rahul";
        s2.marks = 80;
        s2.rollno= 6;

        Student s3 = new Student();
        s3.name = "nabil";
        s3.marks = 70;
        s3.rollno = 7;

        Student students[] = new Student[3];
        students[0] =s1;
        students[1] = s2;
        students[2] = s3;

        for(int i =0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }







    }
}
