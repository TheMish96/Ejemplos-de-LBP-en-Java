/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lbp;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author c106
 */
public class LBP {

    private int grises1[] = new int[27];
    private int ciclo[] = new int[20];

    public static void main(String[] args) {
        // TODO code application logic here
    }

    public BufferedImage imagenGris(File imagenOriginal) throws IOException {
        BufferedImage img;
        BufferedImage Gris;

        img = ImageIO.read(imagenOriginal);
        Gris = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
        int max, min, res;
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                int rgb = img.getRGB(i, j);
                Color color = new Color(rgb, true);
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                int contador=0;         
               
                if(r!=255&&g!=255&&b!=255){
                    contador++;
                System.out.println("numero de puntos :"+contador);    
                }
                
              

            }
          
        
        }
   
          
        
        
        
        
        return Gris;
    }

}
