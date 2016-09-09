import java.io.*;
class sev
{
public static String toCamel(String str) {
    String rtn = str;
    rtn = rtn.toLowerCase();
    Matcher m = Pattern.compile("_([a-z]{1})").matcher(rtn);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
        m.appendReplacement(sb, m.group(1).toUpperCase());
    }
    m.appendTail(sb);
    rtn = sb.toString();
    return rtn;
}}
