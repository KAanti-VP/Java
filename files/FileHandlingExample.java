import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandlingExample {

    public static void main(String[] args) throws IOException {
        String fileName = "./out/resources/myNewFile.txt";
        Path filePath = Paths.get(fileName);
        String path =  fileName.substring(0, fileName.lastIndexOf("/") + 1);
        String directory = path + "newDirectory";
        Path directoryPath = Paths.get(directory);

        // Create a directory
        // .createDirectory
        try {
            Files.createDirectory(directoryPath);
            System.out.println("Directory has been created.");
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }

        // Check does directory exist
        // .isDirectory
        boolean isThereADirectory = Files.isDirectory(directoryPath);
        System.out.println("Directory " + (isThereADirectory ? "exists." : "doesn't exist."));

        // Delete directory
        // .deleteIfExists
        Files.deleteIfExists(directoryPath);
        System.out.println("Ditectory has been deleted.");

        System.out.println("Directory " + (Files.isDirectory(directoryPath) ? "exists." : "doesn't exist."));

        // Create file
        // .createFile
        try {
            Files.createFile(filePath);
            System.out.println("File has been created.");
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }

        // Check file
        // .exists
        boolean isFileThere = Files.exists(filePath);
        System.out.println("File " + (isFileThere ? "exists." : "doesn't exist."));

        // Delete file
        // .delete
        try {
            Files.delete(filePath);
            System.out.println("File has been deleted.");
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        // Files.deleteIfExists(filePath);

    }
}
