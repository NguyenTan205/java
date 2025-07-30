import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String TELEPHONE_REGAX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public TelephoneExample() {
        pattern = Pattern.compile(TELEPHONE_REGAX);
    }

    public boolean validateTelephone(String regax) {
        matcher = pattern.matcher(regax);
        return matcher.matches();
    }
}
