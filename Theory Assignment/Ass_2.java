import java.util.Scanner;

class Course{
    int course_code;
    String course_name;
    int marks;

    Course(int course_code, String course_name, int marks){
        this.course_code = course_code;
        this.course_name = course_name;
        this.marks = marks;
    }
}

class Student{
    int roll_number;
    Course[] courses = new Course[3];
    int total_marks;
    static int highest_marks;

    Student(int roll_number, int[] course_code, String[] course_name, int[] marks, int total_marks){
        this.roll_number= roll_number;
        for(int i = 0; i < 3; i++){
            courses[i] = new Course(course_code[i], course_name[i], marks[i]);
        }
        this.total_marks = total_marks;
    }
}

public class Ass_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[10];
        String[] course_name = {"Maths", "Physics", "Chemistry"};
        int[] course_code = {101, 102, 103};
        int[] marks = new int[3];
        for(int i = 1; i <= 5; i++){
            System.out.print("Student " + i + ", enter your marks: ");
            for(int j = 0; j < 3; j++){
                marks[j] = sc.nextInt();
            }
            int high = highest_marks(marks);
            if(high > Student.highest_marks) Student.highest_marks = high;
            students[i-1] = new Student(i, course_code, course_name, marks, 100);
        }
        System.out.println("");

        for(Student student : students){
            System.out.println("Roll Number: " + student.roll_number);
            System.out.print("Marks: ");
            for(int mark : marks) System.out.print(mark + " ");
            System.out.println("");
        }
    }

    static int highest_marks(int[] marks){
        int max = marks[0];
        for(int n : marks){
            if(n > max) max = n;
        }
        return max;
    }
}