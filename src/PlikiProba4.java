import java.io.*;

public class PlikiProba4 {
    public static File file = new File("Samaritha.txt");
    public static void zapisDoPliku() throws IOException {

        FileWriter fileWriter= new FileWriter(file);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        for(int i=0;i<144;i++)
        {
            bufferedWriter.append("Say hi to the bunny ");
            bufferedWriter.append(String.valueOf(i+1));
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }
        fileWriter.close();
        bufferedWriter.close();


    }
    public static void odczytZPliku() throws IOException {
        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line=bufferedReader.readLine())!=null)
        {
            System.out.println(line);
        }
        System.out.println("The file has been read");
        fileReader.close();
        bufferedReader.close();

    }
}
