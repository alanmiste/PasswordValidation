import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {

    @Test
    void passwordLength(){
        //Given
        String password= "neuefische";
        //When
        int result = PasswordValidation.passwordLength(password);
        //Then
        Assertions.assertEquals(10,result);
    }

    @Test
    void numbersIncludedNo(){
        //Given
        String password= "neueFische";
        //When
        boolean result = PasswordValidation.numbersIncluded(password);
        //Then
        Assertions.assertEquals(false,result);
    }

    @Test
    void numbersIncludedYes(){
        //Given
        String password= "neueFische1";
        //When
        boolean result = PasswordValidation.numbersIncluded(password);
        //Then
        Assertions.assertEquals(true,result);
    }
    @Test
    void spaceIncludedNo(){
        //Given
        String password= "neueFische1";
        //When
        boolean result = PasswordValidation.spaceIncluded(password);
        //Then
        Assertions.assertEquals(false,result);
    }
    @Test
    void spaceIncludedYes(){
        //Given
        String password= "neue Fische1";
        //When
        boolean result = PasswordValidation.spaceIncluded(password);
        //Then
        Assertions.assertEquals(true,result);
    }


    @Test
    void containUpperCaseNo(){
        //Given
        String password= "neuefische";
        //When
        boolean result = PasswordValidation.containUpperCase(password);
        //Then
        Assertions.assertEquals(false,result);
    }

    @Test
    void containUpperCaseYes(){
        //Given
        String password= "neueFische";
        //When
        boolean result = PasswordValidation.containUpperCase(password);
        //Then
        Assertions.assertEquals(true,result);
    }

    @Test
    void passCheck1(){
        //Given
        String password = "neue";
        //When
        boolean result = PasswordValidation.passCheck(password);
        //Then
        Assertions.assertEquals(false,result);
    }
    @Test
    void passCheck2(){
        //Given
        String password = "neuefische";
        //When
        boolean result = PasswordValidation.passCheck(password);
        //Then
        Assertions.assertEquals(false,result);
    }
    @Test
    void passCheck3(){
        //Given
        String password = "neueFische";
        //When
        boolean result = PasswordValidation.passCheck(password);
        //Then
        Assertions.assertEquals(false,result);
    }
    @Test
    void passCheck4(){
        //Given
        String password = "neuefi3";
        //When
        boolean result = PasswordValidation.passCheck(password);
        //Then
        Assertions.assertEquals(false,result);
    }
@Test
    void passCheck5(){
        //Given
        String password = "neueFi3";
        //When
        boolean result = PasswordValidation.passCheck(password);
        //Then
        Assertions.assertEquals(false,result);
    }
@Test
    void passCheck6(){
        //Given
        String password = "neueFische3";
        //When
        boolean result = PasswordValidation.passCheck(password);
        //Then
        Assertions.assertEquals(true,result);
    }

}
