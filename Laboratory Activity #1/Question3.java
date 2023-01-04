import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question3 {
    public static void main(String[]args) throws IOException{

    int vowelCount = 0;

    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Z3m\\.vscode\\files\\question 3\\Question3\\dummy.txt"))) {

        for (int i = 0; i < 5; i++) {
            String text = br.readLine();

            if (text == null) {
                
                break;
            }

            vowelCount += countVowels(text);
        }
    }
        System.out.println("Number of vowels in the first 5 lines: " + vowelCount);
    }
    
    public static int countVowels(String s) {

      int count = 0;
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
          count++;
        }
      }
      return count;
    }
    }
