package lesson20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileSaver {

    private final ExecutorService executorService;
    private final String userHomeDirectory;

    public FileSaver() {
        executorService = Executors.newSingleThreadExecutor();
        userHomeDirectory = System.getProperty("user.home");
    }

    public void saveToFile(String lines) {
        executorService.execute(() -> {
            try {
                String fileName = System.currentTimeMillis() + ".tmp";
                File file = new File(userHomeDirectory + File.separator + fileName);
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(lines);
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
