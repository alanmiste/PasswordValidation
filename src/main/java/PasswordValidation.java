import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least EIGHT characters.\n" +
                "2. A password must be without SPACES. \n"+
                "3. A password must consists at least ONE NUMBER.\n" +
                "4. A password must contain at least one CAPITAL character \n" +
                "Enter a password: ");
        String password = input.nextLine();

        if(PassCheck(password))
            System.out.println("Your Password is GOOD!");
        else System.out.println("Your password is NOT good, please read Terms and Conditions and try again!");
    }
    public static int PasswordLength(String password) {
        return password.length();
    }

    public static boolean NumbersIncluded(String password) {
        return password.matches(".*\\d.*");
    }

    public static boolean SpaceIncluded(String password) {
        if(password.contains(" "))
            return false;
        else return true;
    }

    public static boolean ContainUpperCase(String password) {
        for(int i=0;i<password.length();i++){
            if(Character.isUpperCase(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean PassCheck(String password) {
        if(PasswordLength(password)>=8 && NumbersIncluded(password) && ContainUpperCase(password) && SpaceIncluded(password))
            return true;
        else return false;
    }

}
