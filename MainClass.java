/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brick.breaker.game;

/**
 *
 * @author AVANI PAYASi
 */
import javax.swing.JFrame;
public class MainClass 
{
    public static void main(String args[])
    {
        JFrame obj = new JFrame();
        GamePlay gamePlay=new GamePlay();
        obj.setBounds(10,10,800,800);
        obj.setTitle("Brick Breaker!");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        
        
    }
}
