package my.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
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
        try (
                final SeekableByteChannel seekableByteChannel = Files.newByteChannel(
                        Paths.get("readme.txt"),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.WRITE
                )
        ) {
            seekableByteChannel
                    .write(ByteBuffer.allocate(s.length()).put(s.getBytes()).position(0));
        }
    }

    public static String readFromReadMeFile() throws IOException {
        final Path path = Paths.get("readme.txt");
        try (
                final FileChannel seekableByteChannel = (FileChannel) Files.newByteChannel(path)
        ) {
            MappedByteBuffer byteBuffer = seekableByteChannel.map(FileChannel.MapMode.READ_ONLY, 0, Files.size(path));
            byte[] bytes = new byte[byteBuffer.capacity()];
            byteBuffer.get(bytes);
            return new String(bytes);
        }
    }

    public static void main(String[] args) throws IOException {
        String s = "Hello World - I love Java";
        saveToReadMeFile2(s);
        String s2 = readFromReadMeFile();
        System.out.println(s2);

    }

}
