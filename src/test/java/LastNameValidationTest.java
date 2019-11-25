import com.regex.UserRegistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LastNameValidationTest
{
    private UserRegistration userRegistration;

    @Test
    public void checkLastName_ifValid_ShouldReturnTrue()
    {
        System.out.println("Validating Last name of User");
        Assert.assertTrue(userRegistration.lastNameValidation("Patil"));
    }

    @Before
    public void initialize()
    {
        userRegistration=new UserRegistration();
    }
}
