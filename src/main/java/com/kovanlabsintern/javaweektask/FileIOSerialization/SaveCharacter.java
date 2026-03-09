package com.kovanlabsintern.javaweektask.FileIOSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveCharacter
{
    public static void main(String[] args)
    {
        try
        {
            Characters player = new Warrior(700,25,5);

            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("character.dat"));

            out.writeObject(player);

            out.close();

            System.out.println("Character saved successfully!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
