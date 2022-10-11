
// import necessary packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args)
            throws IOException {
        // list that holds strings of a file
        List<String> listOfStrings = new ArrayList<String>();

        // load data from file
        BufferedReader bf = new BufferedReader(
                new FileReader("province.txt"));

        // read entire line as string
        String line = null;
        String maTinh = "33";

        while ((line = bf.readLine()) != null) {
            listOfStrings.add(line);
            String tmpNum = line.substring(line.length() - 2, line.length());
            String tmpChar = line.substring(0, line.length() - 2);
            if (tmpNum.equals(maTinh)) {

                System.out.println(tmpChar);
            }

        } // end while

        // closing bufferreader object
        bf.close();

    }
}
