package com.kovanlabsintern.javaweektask.ExceptionHandlingPatterns;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Resource1 implements AutoCloseable
{
    public void process()  {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\Paul Ezra\\Desktop\\summa\\Paul.txt"));
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void close() throws Exception {

        throw new Exception("Resourse closed");
    }

}


public class Auto_Closeable {
    public static void main(String[] args) throws Exception {
        try(Resource1 r = new Resource1()) {
            r.process();
            throw new RuntimeException("Something Went Wrong!!");
        }
        catch(RuntimeException e)
        {
            e.printStackTrace();
        }
    }
}

