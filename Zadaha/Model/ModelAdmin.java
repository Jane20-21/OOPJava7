package Zadaha.Model;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ModelAdmin {
    ArrayList<String> filmsLine = new ArrayList<>();
    public ArrayList<String> checkFilm() throws IOException {
        FileReader inFile = new FileReader("D:/Geek/Java/OOPHomeWork7/JavaHomeWork/Zadaha/films.csv");
        Scanner file = new Scanner(inFile);
        while (file.hasNextLine()) {
            String line = file.nextLine();
            filmsLine.add(line);
        }
        return filmsLine;
    }
}