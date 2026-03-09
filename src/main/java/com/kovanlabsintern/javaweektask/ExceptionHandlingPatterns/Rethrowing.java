package com.kovanlabsintern.javaweektask.ExceptionHandlingPatterns;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("serial")
class DataProcessingException extends RuntimeException
{
    DataProcessingException(String message,Throwable cause)
    {
        super(message,cause);
    }
}

class Process
{
    public static void process() throws DataProcessingExgception
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Paul Ezra\\Desktop\\summa\\Jack.txt"));
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            throw new DataProcessingException("processing your file",e);
        }
    }
}

public class Rethrowing
{
    public static void main(String[] args) {
        try
        {
            Process.process();
        }
        catch(DataProcessingException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
