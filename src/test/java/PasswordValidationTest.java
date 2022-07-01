import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {

    @Test
    void passwordLength(){
        //Given
        String password= "neuefische";
        //When
        int result = PasswordValidation.PasswordLength(password);
        //Then
        Assertions.assertEquals(10,result);
    }

    @Test
    void numbersIncludedNo(){
        //Given
        String password= "neueFische";
        //When
        boolean result = PasswordValidation.PumbersIncluded(password);
        //Then
        Assertions.assertEquals(false,result);
    }

    @Test
    void numbersIncludedYes(){
        //Given
        String password= "neueFische1";
        //When
        boolean result = PasswordValidation.PumbersIncluded(password);
        //Then
        Assertions.assertEquals(true,result);
    }

    @Test
    void containUpperCaseNo(){
        //Given
        String password= "neuefische";
        //When
        boolean result = PasswordValidation.ContainUpperCase(password);
        //Then
        Assertions.assertEquals(false,result);
    }

    @Test
    void containUpperCaseYes(){
        //Given
        String password= "neueFische";
        //When
        boolean result = PasswordValidation.ContainUpperCase(password);
        //Then
        Assertions.assertEquals(true,result);
    }
}
