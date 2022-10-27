package develhope;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.lines;

/**
 * @author Drumstyle92
 * class that contains the core of the program.
 */
    public class Test {
    /**
     * @param args main parameter.
     * method that contains a path to a file, a check on it and reading it.
     */
    public static void main(String[] args) {
            // Path of the file to read in String
            String file = "C:\\Users\\dino_\\IdeaProjects\\stream1\\src\\develhope\\file.txt";
            // Initialize the file path
            Path path = Path.of(file);
            System.out.println("-------------reading-the-file---------------");
            try {
                lines(path).forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("--------------------------------------------");
        }
    }

