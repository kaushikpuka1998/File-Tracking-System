/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenscreen;

import javax.swing.JLabel;

/**
 *
 * @author kaushik
 */
public class Screenscreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        splash Splash = new splash();
        start Start = new start();
        Splash.setVisible(true);
        try{
            for (int i = 0;i<=100;i++){
                Thread.sleep(40);
                Splash.loadingnum.setText(Integer.toString(i)+"%");
                Splash.loadingbar.setValue(i);
                if(i == 100)
                {
                    Splash.setVisible(false);
                    Start.setVisible(true);
                }
            }
        }catch(Exception e)
        {
            
        }
        
    }
    
}
