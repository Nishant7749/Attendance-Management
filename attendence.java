import java.util.*;
public class attendence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStudents = sc.nextInt();

        String[] name = new String[numStudents];
        boolean[] attendance = new boolean[numStudents];

        for(int i=0; i<numStudents; i++)  {
            System.out.println(("Enter name : "+ (i+1) ));
            name[i] = sc.next();
           //attendance[i] = sc.nextBoolean();
        }

        while(true) {
            System.out.println(" === ENTER NAME & MARK ATTENDANCE === ");
            System.out.println("1. mark attendance");
            System.out.println("2. view attendance");
            System.out.println("3. exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) { 
                case 1: MarkAttendance(name, attendance, sc);
                break; 

                case 2: ViewAttendance(name, attendance);
                break;

                case 3: System.out.println("Exiting..");
                return;

                default: System.out.println("Invalid choice !!");
            }

        } }

        public static void MarkAttendance(String[] name, boolean[] attendance, Scanner sc)  {
            System.out.println("Marking Attendance : ");

            for(int i=0; i<name.length; i++) {

                System.out.println(name[i]+ " is present or not ? (y/n)  : ");
                String res = sc.next();

                if(res.equals("y")) {
                    attendance[i] = true;
                }

                else { 
                    attendance[i] = false; 
                } }

                System.out.println("Attendance Marked !");
        }


        public static void ViewAttendance(String[] name, boolean[] attendance) {
            System.out.println("Showing Attendance report : ");

            for(int i=0; i<name.length; i++) {
                System.out.println(name[i]+ " : " + (attendance[i] ? "Present" : "Absent"));
            }
        }
    
}
