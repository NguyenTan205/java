//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static StudentExample studentExample;
    private static final String [] validStudent = new String[] {"C0223G", "A0323K"};
    private static final String [] invalidStudent = new String [] {"M0318G", "P0323A"};

    public static void main(String[] args) {
        studentExample = new StudentExample();
        for (String student : validStudent) {
            boolean isvalid = studentExample.validate(student);
            System.out.println("Student is " + student + " is valid: " + isvalid);
        }
        for (String student : invalidStudent) {
            boolean isvalid = studentExample.validate(student);
            System.out.println("Student is " + student + " is invalid: " + isvalid);
        }
    }
}