import java.io.*;

public class Pliki {
    public static void pisanieWPliku() throws IOException {
        File file = new File("NowyPlik.txt");
        FileWriter fileWriter = new FileWriter(file, false);
        for(int i=0;i<10;i++)
        {
            fileWriter.append("To jest nowa linijka "+i+"\n");
        }
        fileWriter.close();

    }

    public static void odczytywanieZPliku() throws IOException {
        File file = new File("NowyPlik.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String linia = null;
        while ((linia=bufferedReader.readLine())!=null)
        {
            System.out.println(linia);
        }
        System.out.println("Oczytano plik");
        bufferedReader.close();
        fileReader.close();



    }
}
