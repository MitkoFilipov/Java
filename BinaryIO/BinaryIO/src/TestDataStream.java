package BinaryIO.src;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        try ( // Create an output stream for file temp.dat
              DataOutputStream output =
                      new DataOutputStream(new FileOutputStream("temp.dat"));
        ) {
            // Write student test scores to the file
            output.writeUTF("Georgi");
            output.writeDouble(90.5);
            output.writeUTF("Mladen");
            output.writeDouble(185.5);
            output.writeUTF("Ivan");
            output.writeDouble(115.25);
        }

        try ( // Create an input stream for file temp.dat
              DataInputStream input =
                      new DataInputStream(new FileInputStream("temp.dat"));
        ) {
            // Read student test scores from the file
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
}
