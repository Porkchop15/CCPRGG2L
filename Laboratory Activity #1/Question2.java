import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question2 {
  public static void main(String[] args) throws IOException, FileNotFoundException{

    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Z3m\\.vscode\\files\\question 2\\Question2\\dummy.txt"))) {
      String text;

    int lineCount = 0;

      while ((text = br.readLine()) != null && lineCount < 5) {
        System.out.println(text);

        lineCount++;

        br.close();

      }
    } 
  }
}
