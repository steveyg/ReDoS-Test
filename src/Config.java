/**
 * Created by yg on 16-7-13.
 */
public class Config {
    public static String REGEX = "^(a+)+$";
    public static int STR_MIN_LENGTH = 1;
    public static int STR_MAX_LENGTH = 100;
    public static int TEST_COUNT = 100;
    public static char[] CHARACTER = new char[]{
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    public static String[] TEST_CASE = {
            "aaaaaaaaaaaaaaaaaaaaaaaaaaa3",
            "aaaaaa"
    };

}
