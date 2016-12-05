package countries;

import java.io.*;
import java.util.*;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by jessedavila on 12/5/16.
 */
public class CountriesTextFile {
    private String folder = "src/countries";
    private Path folderPath = Paths.get(folder);
    private Path filePath = Paths.get(folder, "countries.txt");
    private List<String> names = new ArrayList<>();


    public void getFolder() throws IOException {
        if (Files.notExists(folderPath)) {
            Files.createDirectory(folderPath);
        }
    }

    public void getFile() throws IOException {
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }
    }

    public void readFile() throws IOException {
        List<String> countries = new ArrayList<>();
        FileReader fileReader = new FileReader(filePath.toFile());
        BufferedReader input = new BufferedReader(fileReader);

        String name = input.readLine();
        while(name != null) {
            countries.add(name);
            name = input.readLine();
        }

        for (String line: countries) {
            System.out.println(line);
        }
    }

    public void writeFile() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the name of a country");
        String name = (sc.nextLine());
        try (FileWriter fileWriter = new FileWriter(filePath.toFile());
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter output = new PrintWriter(bufferedWriter);) {
            output.append(name);
        }
        System.out.println("Thank you");
    }


}
