package util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TextFile {
    Path path;

    public TextFile (Path location){
        path = location.resolve(
                LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("MM-dd-yy-hh-mm-ss"))
                        +".txt");
        try {
            Files.createDirectories(path.getParent());
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void append (String line){
        try {
            Files.writeString(path, line+"\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read () throws IOException{
        try (var reader = Files.newBufferedReader(path)) {
            System.out.println("Reading from file: ");
            String currentLine;
            while ((currentLine = reader.readLine()) != null)
                System.out.println(currentLine);
        }

    }
}
