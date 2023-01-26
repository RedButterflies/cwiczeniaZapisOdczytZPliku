import java.io.*;

public class PlikiProba2 {
    public static void zapisDoPliku() throws IOException {
        File file = new File("Bobo.txt");
        FileWriter fileWriter= new FileWriter(file);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        for(int i =0;i<60;i++)
        {
            bufferedWriter.append("I am a care giving penguin ").append(String.valueOf(i));
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }bufferedWriter.append("Penguins for Ben");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        fileWriter.close();
        bufferedWriter.close();

    }
    public static void odczytZPliku() throws IOException {
        File file = new File("Bobo.txt");
        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        while((line= bufferedReader.readLine())!=null)
        {
            System.out.println(line);
        }
        System.out.println("Plik odczytany");
        fileReader.close();
        bufferedReader.close();
    }
}
