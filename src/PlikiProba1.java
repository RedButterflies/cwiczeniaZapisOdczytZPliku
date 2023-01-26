import java.io.*;


public class PlikiProba1 {
    public static void zapisDoPliku() throws IOException {
        File file = new File("I shouldn't date boys");
        FileWriter fileWriter = new FileWriter("Paczek.txt", false);
        for (int i = 0; i < 10; i++) {
            fileWriter.append("Gacus\n");
        }
        fileWriter.close();
    }

    public static void odczytZPliku() throws IOException {
        File file= new File("Paczek.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        while((line=bufferedReader.readLine())!=null)
        {
            System.out.println(line);
        }
        System.out.println("Plik sie zakonczyl");
        fileReader.close();
        bufferedReader.close();

    }



}
