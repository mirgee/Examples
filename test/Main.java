import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestCategories.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}