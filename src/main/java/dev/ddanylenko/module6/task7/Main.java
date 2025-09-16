package dev.ddanylenko.module6.task7;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static class FileVisitor extends SimpleFileVisitor<Path> {

        private Path source;
        private Path target;

        public FileVisitor(Path target, Path source) {
            this.target = target;
            this.source = source;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            if(file.getFileName().toString().endsWith(".txt")) {
                Path relative = source.relativize(file);
                Path resolved = target.resolve(relative);
                Files.copy(file, resolved, StandardCopyOption.REPLACE_EXISTING);
                System.out.println(file.toAbsolutePath());
            }
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            Path relative = source.relativize(dir);
            Path resolved = target.resolve(relative);
            Files.copy(dir, resolved, StandardCopyOption.REPLACE_EXISTING);
            return FileVisitResult.CONTINUE;
        }
    }
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("temp");
        Path pathTo = Paths.get("backup");
        Files.walkFileTree(path, new FileVisitor(pathTo, path));
    }
}
