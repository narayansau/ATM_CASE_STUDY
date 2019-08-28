package com.narayan.Java_How_To_Program;

import javax.swing.*;
import java.awt.*;

public class LinesRectsOvalsJPanel extends JPanel{
    public void paintComponent (Graphics g) {
        super.paintComponent( g );
        this.setBackground( Color.WHITE );
        g.setColor( Color.RED );
        for ( int i = 5 ,j = 30 ; i < 180 && j < 180 ; i++, j++) {
            g.drawLine( j,i,380,30 );

        }



    }
}
