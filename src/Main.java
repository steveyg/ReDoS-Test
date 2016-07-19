import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by yg on 16-7-13.
 */
public class Main {
    private static String maxStr;
    private static long maxTime = 0;
    private static double sumTime = 0;

    public static void main(String[] str) {
        for (int i = 0; i < Config.TEST_CASE.length; i++) {
            test(Config.TEST_CASE[i]);
            displayProgress(i);
        }
        for (int i = 0; i < Config.TEST_COUNT; i++) {
            test();
            displayProgress(i + Config.TEST_CASE.length);
        }
        display();
    }

    private static void test(String str) {
        long startTime = System.currentTimeMillis();
        str.matches(Config.REGEX);
        long endTime = System.currentTimeMillis();
        long useTime = endTime - startTime;
        if (useTime > maxTime) {
            maxStr = str;
            maxTime = useTime;
        }
        sumTime += useTime;
    }

    private static void test() {
        String str = makeStr();
        test(str);
    }

    private static String makeStr() {
        int strLen = (int) (Math.random() * Config.STR_MAX_LENGTH) + Config.STR_MIN_LENGTH;
        return RandomStringUtils.random(strLen, Config.CHARACTER);
    }

    private static void display() {
        System.out.println("The longest time is : " + maxTime + "ms.");
        System.out.println("The str is : " + maxStr + ".");
        System.out.println("The avg time is : " + sumTime / Config.TEST_COUNT + "ms.");
    }

    private static void displayProgress(int i) {
        int count = Config.TEST_COUNT + Config.TEST_CASE.length;
        if (i % (count / 100) == 0) {
            System.out.println(i / (count / 100) + "%");
        }
    }

}
