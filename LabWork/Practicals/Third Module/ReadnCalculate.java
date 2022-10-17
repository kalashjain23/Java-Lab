/* Read the content from file and calculate number of characters, line and words in the file. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadnCalculate
{
    public static void main(String[] args) {
        BufferedReader br = null;
        int charCount = 0;
        int wordsCount = 0;
        int linesCount = 0;
        try
        {
            br = new BufferedReader(new FileReader("LabWork/Text.txt"));
            String currentline = br.readLine();

            while(currentline != null)
            {
                linesCount++;
                currentline.trim();
                String[] words = currentline.split(" ");
                wordsCount += words.length;
                for(String word : words){
                    charCount += word.length();
                }
                currentline = br.readLine();
            }
            System.out.println("Number of chars in file: " + charCount);
            System.out.println("Number of lines in file: " + linesCount);
            System.out.println("Number of words in file: " + wordsCount);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try{
                br.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
