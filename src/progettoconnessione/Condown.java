/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettoconnessione;

import static java.lang.Thread.sleep;

/**
 *
 * @author Informatica
 */
public class Condown extends Thread
{
    public int timeout=5000;
    public void run()
    {
        for(int i=0; i<500; i+=1000)
        {
            try {
                sleep(1000);
                        
                        } catch (InterruptedException ex) {
                System.out.println("Condown");
            }
                   
        }
    }
}
