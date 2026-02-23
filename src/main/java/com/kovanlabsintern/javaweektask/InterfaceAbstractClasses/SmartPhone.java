package com.kovanlabsintern.javaweektask.InterfaceAbstractClasses;

interface Camera{
    abstract void open();
}
interface MusicPlayer{
    abstract void open();
}
interface Phone{
    abstract void open();
}
public class SmartPhone implements Camera,MusicPlayer,Phone{
    public void open()
    {
        System.out.println("Opening the device");
    }
    public static void main(String[] args) {
        Camera c = new SmartPhone();
        c.open();
        MusicPlayer m = new SmartPhone();
        m.open();
        Phone p = new SmartPhone();
        p.open();
    }
}
