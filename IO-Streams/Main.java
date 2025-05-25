import java.io.*;

public class Main {

    public static void main(String [] args) throws IOException {

        // Reader class -> reads character by character
        // Character Stream
        FileReader f = new FileReader("sample-file.txt");
        FileWriter w = new FileWriter("sample-file-output.txt");
        BufferedReader bufferedReader = new BufferedReader(f);
        // reads line by line
        while(bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
            w.write(bufferedReader.readLine().toString());
        }
        w.close(); // need to invoke close method after completing the write

        // reads char by char
        while(f.ready()) {
            System.out.println((char) f.read());
        }


    }

}
