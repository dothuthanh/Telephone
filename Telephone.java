import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telephone {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String TELEPHONE_REGEX = "^[(]84[)][-][(]0(\\d{9})[)]$";
    public Telephone(){
        pattern = Pattern.compile(TELEPHONE_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}
