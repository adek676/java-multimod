package util;

public class StringUtilities {
    public static String concat(String... inp) {
        if (inp.length == 0) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < inp.length; i++) {
            sb.append(inp[i]);
        }
        return sb.toString();
    }
}
