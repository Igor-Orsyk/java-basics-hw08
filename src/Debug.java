import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class Debug {


    public static void main(String[] args) {

        String content = "8.8.8.8";
        String strin = ".*\\d+.\\d.\\d.\\d.*";
        Pattern pattern1 = Pattern.compile(strin);
        Matcher matcher = pattern1.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
