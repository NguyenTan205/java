import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String SUDENT_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public StudentExample() {
        pattern = Pattern.compile(SUDENT_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
