/**
 * Regular expressions.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class RegExp {

  /**
   * Get IP address from text.
   * @param text text to parse
   * @return String with IP address
   */
  public static String getIpAddress(String text) {
    String result = "";
    String reg_ex = ("\\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
    Pattern pattern = Pattern.compile(reg_ex);
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()){
      result = matcher.group();
    }
    return result;
  }
}