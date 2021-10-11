import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader(new File("weapons.csv"))))
        {
            List<Integer> list= Files.lines(new File("weapons.csv").toPath())
                    .skip(1)
                    .map(s -> s.split(";"))
                    .map(s -> {

                            }

                    )
                    .collect(Collectors.toList());
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
