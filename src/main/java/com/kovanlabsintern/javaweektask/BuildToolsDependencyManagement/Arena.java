package com.kovanlabsintern.javaweektask.BuildToolsDependencyManagement;
import com.google.gson.Gson;

public class Arena {

    public static void main(String[] args) throws Exception
    {
            Gson gson = new Gson();

            Characters p1 = new Warrior(700,20,5);
            Characters p2 = new Mage(700,20);

            String json1 = gson.toJson(p1);
            String json2 = gson.toJson(p2);

            System.out.println("Player 1 JSON: " + json1);
            System.out.println("Player 2 JSON: " + json2);

            while(p1.getHealth()>0 && p2.getHealth()>0)
            {
                p1.attack(p2);
                p2.attack(p1);
            }
            if(p1.getHealth()>0)
            {
                System.out.println(p1.getClass().getSimpleName()+" is the winner");
            }
            else
            {
                System.out.println(p2.getClass().getSimpleName()+" is the winner");
            }
    }
}

