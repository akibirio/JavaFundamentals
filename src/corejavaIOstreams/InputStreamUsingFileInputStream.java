package corejavaIOstreams;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamUsingFileInputStream {
    public static void main(String[] args) {
        byte[] array = new byte[100];

        try {
            InputStream input = new FileInputStream("src/corejavaIOstreams/fileinputstream_input.txt");

            System.out.println("Available btes in the file: " + input.available());

            //Read byte from the input stream
            input.read(array);
            System.out.println("Data Read from the file: ");

            // Convert the byte array into string.
            String data = new String(array);
            System.out.println(data);

            // Close the input stream.
            input.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.getStackTrace();
        }
    }
    
}
