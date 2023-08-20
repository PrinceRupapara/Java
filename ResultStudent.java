import java.util.Scanner;

class Student{
    /*Data Members: Enrollment_No, Student_Name, Semester, CPI and SPI 
Member Functions: GetStudentDetails () and DisplayStudentDetails ().
 */
    int Enrollment_No;
    String Student_Name;
    int Semester;
    double CPI;
    double SPI;
    int count;


    Student(){
        Enrollment_No=0;
        Student_Name="Not found";
        Semester=0;
        CPI=0.0;
        SPI=0.0;
        count++;
    }
    Student(int e,String n,int sem,double c,double s){
        Enrollment_No=e;
        Student_Name=n;
        Semester=sem;
        CPI=c;
        SPI=s;
        count++;
    }
    public void GetStudentDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Person " + count + " Detail:\n");
        System.out.print("Enter EnrollmentNo:");
        Enrollment_No=sc.nextInt();
        System.out.print("Student_Name:");
        Student_Name=sc.next();
        System.out.print("Semester:");
        Semester=sc.nextInt();
        System.out.print("CPI:");
        CPI=sc.nextDouble();
        System.out.print("SPI:");
        SPI=sc.nextDouble();
    }
    public void DisplayStudentDetails(){
        System.out.print("\n\nEnrollmentNo:"+Enrollment_No+"\nStudent_Name:"+Student_Name+"\nSemester:"+Semester+"\nCPI:"+CPI+"\nSPI:"+SPI);
    }
}
public class ResultStudent {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.GetStudentDetails();
        s1.DisplayStudentDetails();
    }
}
