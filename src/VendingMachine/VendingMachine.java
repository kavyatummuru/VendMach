/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMachine;



/**
 *
 * @author kavya
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class VendingMachine extends JApplet {
    private JButton soda,newspaper,water,cookie;
    private JButton one,five,ten,quart;
    private JLabel cost,remamnt;
   
    private int ra=0,tot=0;
    
    public  VendingMachine() 
    {
        getContentPane().setLayout(new BorderLayout());
        
        
        JPanel p = new JPanel();
        p.setBackground(Color.GRAY);
        soda = new JButton("soda");
        p.add(soda);
        newspaper = new JButton("Newspaper");
        p.add(newspaper);
        water = new JButton("water");
        p.add(water);
        cookie = new JButton("cookie");
        p.add(cookie);
        getContentPane().add(BorderLayout.NORTH,p);
        
        JPanel q = new JPanel();
        q.setBackground(Color.GRAY);
        one = new JButton("one");
        q.add(one);
        five = new JButton("five");
        q.add(five);
        ten = new JButton("ten");
        q.add(ten);
        quart = new JButton("quart");
        q.add(quart);
        getContentPane().add(BorderLayout.SOUTH, q);
        
        JPanel r = new JPanel();
        r.setBackground(Color.cyan);
        cost = new JLabel(" ");
        r.add(cost);
        
        
        remamnt = new JLabel(" ");
        r.add(remamnt);
        getContentPane().add(BorderLayout.CENTER,r);
        Handler handler = new Handler();
        soda.addActionListener(handler);
        newspaper.addActionListener(handler);
        water.addActionListener(handler);
        cookie.addActionListener(handler);
        one.addActionListener(handler);
        five.addActionListener(handler);
        ten.addActionListener(handler);
        quart.addActionListener(handler);

       
     }
    
class Handler implements ActionListener{
  
   public void actionPerformed(ActionEvent e)
    { 
        
        if(e.getSource() == soda)
        {
           
            
            tot = 20;
            ra=tot;
            cost.setText("soda costs 20 cents");
        }
        else if(e.getSource() == newspaper)
        {
            
            tot = 30;
            ra=tot;
            cost.setText("newspaper costs 30 cents");
           
        }
        else if(e.getSource() == water)
        {
           
           tot = 40;
           ra=tot;
           cost.setText("water costs 40 cents");
            
        }
        else if(e.getSource() == cookie)
        {
            
            tot = 50;
            ra=tot;
            cost.setText("cookie costs 50 cents");
        }
        
        
        if(e.getSource() == one)
        {
           
           ra = ra-1;
           if(ra>0)
           {
           remamnt.setText("Remaining amount : "+ra);
           }
           else if(ra<=0)
           {
                 
                 JOptionPane.showMessageDialog(null, "Thank you!!!! Have a Nice Day");
                   }
        }
        
        else if(e.getSource() == five)
        {
           
           ra =ra-5;
           
           if(ra>0)
                   {
           remamnt.setText("Remaining amount : "+ra);
        }
           else if (ra<=0)
           {
               
              JOptionPane.showMessageDialog(null, "Thank you!!!! Have a Nice Day");
           }
        }
           
        else if(e.getSource() == ten)
        {
            
            ra = ra - 10;
            
            if(ra>0)
            {
            remamnt.setText("Remaining amount : "+ra);
            }
            else if(ra<=0)
            {
                
                JOptionPane.showMessageDialog(null, "Thank you!!!! Have a Nice Day");
            }
        }
        else if(e.getSource() == quart)
        {   
            
                ra = ra - 25;
                if(ra>0)
                {
                   remamnt.setText("Remaining amount : "+ra);
                }
                else if(ra<=0)
                {
                    
                    JOptionPane.showMessageDialog(null, "Thank you!!!! Have a Nice Day");
                }

        }

    }
}
}


