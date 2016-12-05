package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;

/**
 * Created by jessedavila on 12/5/16.
 */
public class FilesApp {
    public static void main(String[] args) throws IOException {
        String folder = "resources/movies";
        Path folderPath = Paths.get(folder);
        if (Files.notExists(folderPath)) {
            Files.createDirectory(folderPath);
        }
        Path filePath = Paths.get(folder,"movies.txt");
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        String[] titles = {"Home","The Avengers","it"};
        try (FileWriter fileWriter = new FileWriter(filePath.toFile());
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter output = new PrintWriter(bufferedWriter);){
            for(String title: titles) {
                output.println(title);
            }
        }
        List<String> movies = new ArrayList<>();

        FileReader fileReader = new FileReader(filePath.toFile());
        BufferedReader input = new BufferedReader(fileReader);

        String line = input.readLine();
        while(line != null) {
            movies.add(line);
            line = input.readLine();
        }

        for (String title: movies) {
            System.out.println(title);
        }
    }
}
