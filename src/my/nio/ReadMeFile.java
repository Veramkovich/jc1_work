package my.nio;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadMeFile {


    public static void saveToReadMeFile(String s) throws IOException {
        Path path = Paths.get("readme.txt");
        SeekableByteChannel fileChannel = Files.newByteChannel(path);
        ByteBuffer byteBuffer = ByteBuffer.allocate(10).put(s.getBytes());
        fileChannel.write(byteBuffer);
        fileChannel.close();
    }

    public static void saveToReadMeFile2(String s) throws IOException {
        Files.newByteChannel(
                        Paths.get("readme.txt"),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.WRITE
                )
                .write(ByteBuffer.allocate(s.length()).put(s.getBytes()));
    }

    public static String readFromReadMeFile() throws IOException {
        String s;
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        int size = Files.newByteChannel(Paths.get("readme.txt"))
                .read(byteBuffer);
        byte[] bytes = new byte[size];
        byteBuffer.get(bytes);
        s = new String(bytes);
        return s;
    }

    public static void main(String[] args) throws IOException {
        String s = "Hello World";
        saveToReadMeFile2(s);
    }

}
