import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ClassBTests {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test //with @Rule
    public void testConstructorFailForInvalidArgumentRULE() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage(errorVersionMustMatchPattern);
        ClassB classB = new ClassB("invalid_argument");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullArgument() {
        ClassB classB = new ClassB("invalid_argument");
    }

//classic way of handling - Assert.fail()
//    @Test
//    public void testFailForInvalidArguments() {
//        try {
//            ClassB classB = new ClassB("invalid_argument");
//            fail(errorVersionMustMatchPattern);
//        } catch (Exception e) {
//            assertThat(e)
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage(errorVersionMustMatchPattern);
//        }
//    }

    @Test
    public void testConstructorInvalidArgumentMessageTryCatch() {
        try {
            ClassB classB = new ClassB("invalid_argument");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), errorVersionMustMatchPattern);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidArgumentExpectedApproach() {
        ClassB classB = new ClassB("invalid_argument");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullParameter() {
        ClassB classB = new ClassB(null);
    }

    // Expected error messages
    private static final String errorVersionMustNotBeNull = "'version' must not be null!";
    private static final String errorOtherMustNotBeNull = "'other' must not be null!";
    private static final String errorVersionMustMatchPattern = "'version' must match: 'major.minor.patch(-SNAPSHOT)'!";


}
