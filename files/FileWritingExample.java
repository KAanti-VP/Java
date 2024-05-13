import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWritingExample {

    public static void main(String[] args) {

        String sourceFile = "./out/resources/my-file.txt";
        String targetFile = "./out/resources/myNewFile.txt";

        List<String> content = FileReadingExample.readFileContent(sourceFile);
        content.add("");
        content.add("My name is Bond, ... James Bond.");

        Path newPath = Paths.get(targetFile);
        try {
            Files.write(newPath, content);
            System.out.println("A new file has been created.");
        } catch (IOException e) {
            System.err.printf("Unable to write file: %s", targetFile);
            System.exit(2);
        }

    }
}
