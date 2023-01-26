import java.io.*;

public class PlikiProba3 {
    public static void zapisDoPliku() throws IOException {
        File file= new File("GacusSpi.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(int i=0;i<162;i++)
        {
            if(i%2==0&&i%3!=0) {
                bufferedWriter.append("Gacus is very tired and is sleeping on my bed");
                bufferedWriter.newLine();
                bufferedWriter.flush();

            }
            if(i%3==0)
            {
                bufferedWriter.append("Zzzzzzzzz");
                bufferedWriter.append(String.valueOf(i));
                bufferedWriter.newLine();
                bufferedWriter.flush();

            }
            else
            {
                bufferedWriter.append("Sometimes we all just need to sleep");
                bufferedWriter.newLine();
                bufferedWriter.flush();

            }

        }
        bufferedWriter.append("Gacus's sleeping story");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        fileWriter.close();
        bufferedWriter.close();

    }
    public static void odczytZPliku() throws IOException {
        File file = new File("GacusSpi.txt");
        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null)
        {
            System.out.println(line);
        }
        System.out.println("Plik zostal odczytany");
        fileReader.close();
        bufferedReader.close();

    }
}
