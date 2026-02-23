package com.kovanlabsintern.javaweektask.InterfaceAbstractClasses;

interface Plugin{
    void execute();
}
public class CoreSystem {
    public static void main(String[] args) {
        Plugin[] p = new Plugin[]{new Plugin() {
            public void execute()
            {
                System.out.println("1-Additional plugins are installing");
            }
        },new Plugin() {
            public void execute()
            {
                System.out.println("2-Additional plugins are installing");
            }
        },new Plugin() {
            public void execute()
            {
                System.out.println("3-Additional plugins are installing");
            }
        }
        };
        for(Plugin res : p)
        {
            res.execute();
        }
    }
}
