import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest {
    private String actualClassString;

    @Before
    public void getActualClassString() {
        MainClass mainClass = new MainClass();
        this.actualClassString = mainClass.getClassString();
    }

    @Test
    public void testGetClassString() {
        String classStringPattern = ".*[Hh]ello.*";
        boolean classStringMatches;

        classStringMatches = actualClassString.matches(classStringPattern);

        final String errorMessage = String.format("Результат функции MainClass.getClassString() = " +
                "\"%1$s\" не соответстует заданному паттерну = \"%2$s\".",
                actualClassString, classStringPattern);

        Assert.assertTrue(errorMessage, classStringMatches);
    }
}
