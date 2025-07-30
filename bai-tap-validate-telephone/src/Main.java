//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static TelephoneExample telephoneExample;
    private static final String [] validTelephone = new String [] {"(84)-(0978489648)"};
    private static final String [] invalidTelephone = new String[] {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        telephoneExample = new TelephoneExample();
        for (String telephone : validTelephone) {
            boolean isvalid = telephoneExample.validateTelephone(telephone);
            System.out.println("Telephone is: " + telephone + " is valid: " + isvalid);
        }
        for (String telephone : invalidTelephone) {
            boolean isvalid = telephoneExample.validateTelephone(telephone);
            System.out.println("Telephone is: " + telephone + " is valid: " + isvalid);
        }
    }
}