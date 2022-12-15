package corejavastrings;

public class CoreJavaCompareTwoStrings {
    public static void main(String[] args) {
        
        //compare two strings.
        String emailFromUserInput = " ayubkibirio@gmail.com ";
        String emailFromDatabase  = " ayubkibirio@gmail.com";

        if(emailFromUserInput!=null && emailFromDatabase.trim().equals(emailFromUserInput.trim())){
            System.out.println("Login will be allowed, redirect to main page");
        }else{
            System.out.println("Login will NOT be allowed, redirect to login page");
        }


    }
    
}
