/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author glauco.todesco
 */
public class Bola {
        int x = 0;
	int y = 0;
	public int xa = 1;
	public int ya = 1;
        
        void mover()
        {
           x=x + xa;
           y=y +ya;
        }

        void desenha(Graphics g)
        {
           g.setColor(Color.pink);
           g.fillOval(x,y,40,40);
        }
    
}
