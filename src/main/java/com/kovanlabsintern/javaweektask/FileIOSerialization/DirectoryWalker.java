package com.kovanlabsintern.javaweektask.FileIOSerialization;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryWalker {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("C:\\Users\\Paul Ezra\\Desktop");
        Files.walk(p).forEach(path ->{
            try {
                System.out.println(path+" -- "+Files.size(path)+" Bytes");
            } catch (IOException e) {

                e.printStackTrace();
            }
        });
    }
}