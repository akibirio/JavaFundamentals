package corejavastrings;

public class SplitString {
    public static void main(String[] args) {
        String text = "Java is a fun programming Language!";

        //splitting string from space
        String [] result = text.split(" ");

        System.out.println("Result = ");
        for (String string : result) {
            System.out.println(string + " , ");
            
        }
    }
    
}
