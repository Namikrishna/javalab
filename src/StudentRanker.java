 class Student {
    String name;
    int marks;

    Student(String studentName , int studentMarks){
        this.name = studentName;
        this.marks = studentMarks;

    }

    String calculateGrade(){
        if ( marks >= 90 )
            return "A";
        else if ( marks >= 75 )
            return "B";
        else if ( marks >= 60 )
            return "C";
        else
            return "Fail";
    }

    void studentResult(){
        System.out.println("Studentname:" + name);
        System.out.println("Studentmark:" + marks);
        System.out.println("StudentGrade:" + calculateGrade());

    }

}

public class StudentRanker {
    public static void main(String[] args){
        Student s1 = new Student("Namitha",85 );
        s1.studentResult();
        System.out.println();


    }
}
