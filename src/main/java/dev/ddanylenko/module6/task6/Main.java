package dev.ddanylenko.module6.task6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.RandomAccess;

public class Main {
    public static void main(String[] args) {
        try {
            readFromChannel("notes.txt");
            writeToFile("notes.txt", "hello world");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readFromChannel(String fileName) throws FileNotFoundException, IOException {
        try(RandomAccessFile raf = new RandomAccessFile(fileName, "rw")){
            FileChannel channel = raf.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(100);
            int number = channel.read(buffer);
            while (number > 0) {
                buffer.flip();

                while (buffer.hasRemaining()) {
                    char c = (char) buffer.get();
                    System.out.print(c);
                }

                buffer.clear();
                number = channel.read(buffer);
            }
        }
    }

    public static void writeToFile(String fileName, String text) throws IOException {
        ByteBuffer mark = ByteBuffer.wrap(text.getBytes());
        Path path = Paths.get(fileName);
        try(FileChannel channel = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.READ)){
            channel.position(channel.size() - 1);
            channel.write(mark);
        }
    }
}
