//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static EmailExample emailExample;
    private static final String [] validEmail = new String [] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    private static final String [] invalidEmail = new String [] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for(String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is: " + email + " is valid: " + isvalid);
        }
        for(String email : invalidEmail) {
            boolean isvaild = emailExample.validate(email);
            System.out.println("Email is: " + email + " is valid: " + isvaild);
        }
    }
}