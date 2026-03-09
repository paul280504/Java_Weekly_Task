package com.kovanlabsintern.javaweektask.FileIOSerialization;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class LogFileAnalyzer {
    private static String randomIP() {
        return ThreadLocalRandom.current().nextInt(1, 255) +
                "." + ThreadLocalRandom.current().nextInt(0, 255) +
                "." + ThreadLocalRandom.current().nextInt(0, 255) +
                "." + ThreadLocalRandom.current().nextInt(0, 255);
    }
    public static void main(String[] args) throws IOException {
        List<Integer> statuscode = List.of(200, 201, 400, 401, 403, 404, 500);
        List<String> urls = List.of("/home", "/login", "/dashboard", "/products", "/cart", "/checkout", "/profile", "/admin");
        Files.deleteIfExists(Paths.get("C:\\Users\\Paul Ezra\\Desktop\\summa\\server.log"));
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("C:\\Users\\Paul Ezra\\Desktop\\summa\\server.log"))) {
            for(int i=0;i<1000;i++)
            {
                String ip = randomIP();
                String timestamp = LocalDateTime.now().toString();
                int status = statuscode.get(ThreadLocalRandom.current().nextInt(statuscode.size()));
                String url = urls.get(ThreadLocalRandom.current().nextInt(urls.size()));
                writer.write(String.format(ip+" "+timestamp+" "+status+" "+url));
                writer.newLine();
            }
        }

        //Converting Lines to String Array
        List<String[]> log =Files.lines(Paths.get("C:\\Users\\Paul Ezra\\Desktop\\summa\\server.log")).map(x->x.split(" ")).collect(Collectors.toList());

        //Count total requests per IP address
        Map<String,Long> filter1 = log.stream().collect(Collectors.groupingBy(x->x[0],Collectors.counting()));
        System.out.println("total requests per IP address\n"+filter1);

        //Find the Top 3 most requested URLs
        Map<String,Long> filter2 = log.stream().collect(Collectors.groupingBy(x->x[3],Collectors.counting()));
        List<Map.Entry<String, Long>> sort =filter2.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(3).collect(Collectors.toList());
        System.out.println("Top 3 most requested URLs\n"+sort);

        //Calculate the percentage of "404 Error" responses
        int filter3 = (int) log.stream().filter(x->x[2].equals("404")).count();
        double percentage404 = (filter3*100)/1000;
        System.out.println("the percentage of \"404 Error\" responses = "+percentage404);
    }
}
