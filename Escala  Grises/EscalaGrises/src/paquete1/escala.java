package paquete1;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class escala {

    private int grises1[] = new int[27];
    private int grises2[] = new int[27];
    private int grises3[] = new int[27];

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
                max = Math.max(Math.max(r, g), b);
                min = Math.min(Math.min(r, g), b);
                res = (max + min) / 2;
                color = new Color(res, res, res);
                Gris.setRGB(i, j, color.getRGB());
                if (res == 229 && res == 228 && res == 226) {
                    grises1[0] += 1;
                }
                if (res == 205 && res == 205 && res == 205) {
                    grises1[1] += 1;
                }
                if (res == 215 && res == 208 && res == 183) {
                    grises1[2] += 1;
                }
                if (res == 190 && res == 190 && res == 190) {
                    grises1[3] += 1;
                }
                if (res == 180 && res == 188 && res == 192) {
                    grises1[4] += 1;
                }
                if (res == 185 && res == 184 && res == 181) {
                    grises1[5] += 1;
                }
                if (res == 145 && res == 163 && res == 176) {
                    grises1[6] += 1;
                }
                if (res == 145 && res == 163 && res == 176) {
                    grises1[7] += 1;
                }
                if (res == 150 && res == 152 && res == 154) {
                    grises1[8] += 1;
                }
                if (res == 144 && res == 144 && res == 144) {
                    grises1[9] += 1;
                }
                if (res == 155 && res == 143 && res == 121) {
                    grises1[10] += 1;
                }
                if (res == 145 && res == 136 && res == 139) {
                    grises1[11] += 1;
                }
                if (res == 139 && res == 133 && res == 137) {
                    grises1[12] += 1;
                }
                if (res == 129 && res == 135 && res == 139) {
                    grises1[13] += 1;
                }
                if (res == 132 && res == 132 && res == 130) {
                    grises1[14] += 1;
                }
                if (res == 143 && res == 129 && res == 127) {
                    grises1[15] += 1;
                }
                if (res == 115 && res == 134 && res == 120) {
                    grises1[16] += 1;
                }
                if (res == 128 && res == 128 && res == 128) {
                    grises1[17] += 1;
                }
                if (res == 135 && res == 125 && res == 96) {
                    grises1[18] += 1;
                }
                if (res == 135 && res == 121 && res == 78) {
                    grises1[19] += 1;
                }
                if (res == 83 && res == 104 && res == 120) {
                    grises1[20] += 1;
                }
                if (res == 93 && res == 103 && res == 112) {
                    grises1[21] += 1;
                }
                if (res == 102 && res == 102 && res == 102) {
                    grises1[22] += 1;
                }
                if (res == 89 && res == 100 && res == 106) {
                    grises1[23] += 1;
                }
                if (res == 73 && res == 96 && res == 99) {
                    grises1[24] += 1;
                }
                if (res == 85 && res == 85 && res == 85) {
                    grises1[25] += 1;
                }
                if (res == 52 && res == 52 && res == 52) {
                    grises1[26] += 1;
                }

            }
        }

        return Gris;
    }

    public BufferedImage imagenPromedio(File imagenOriginal) throws IOException {
        BufferedImage img;
        BufferedImage Promedio;

        img = ImageIO.read(imagenOriginal);
        Promedio = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
        int res;
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                int rgb = img.getRGB(i, j);
                Color color = new Color(rgb, true);
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                res = (r + g + b) / 3;
                color = new Color(res, res, res);
                Promedio.setRGB(i, j, color.getRGB());
                if (res == 229 && res == 228 && res == 226) {
                    grises2[0] += 1;
                }
                if (res == 205 && res == 205 && res == 205) {
                    grises2[1] += 1;
                }
                if (res == 215 && res == 208 && res == 183) {
                    grises2[2] += 1;
                }
                if (res == 190 && res == 190 && res == 190) {
                    grises2[3] += 1;
                }
                if (res == 180 && res == 188 && res == 192) {
                    grises2[4] += 1;
                }
                if (res == 185 && res == 184 && res == 181) {
                    grises2[5] += 1;
                }
                if (res == 145 && res == 163 && res == 176) {
                    grises2[6] += 1;
                }
                if (res == 145 && res == 163 && res == 176) {
                    grises2[7] += 1;
                }
                if (res == 150 && res == 152 && res == 154) {
                    grises2[8] += 1;
                }
                if (res == 144 && res == 144 && res == 144) {
                    grises2[9] += 1;
                }
                if (res == 155 && res == 143 && res == 121) {
                    grises2[10] += 1;
                }
                if (res == 145 && res == 136 && res == 139) {
                    grises2[11] += 1;
                }
                if (res == 139 && res == 133 && res == 137) {
                    grises2[12] += 1;
                }
                if (res == 129 && res == 135 && res == 139) {
                    grises2[13] += 1;
                }
                if (res == 132 && res == 132 && res == 130) {
                    grises2[14] += 1;
                }
                if (res == 143 && res == 129 && res == 127) {
                    grises2[15] += 1;
                }
                if (res == 115 && res == 134 && res == 120) {
                    grises2[16] += 1;
                }
                if (res == 128 && res == 128 && res == 128) {
                    grises2[17] += 1;
                }
                if (res == 135 && res == 125 && res == 96) {
                    grises2[18] += 1;
                }
                if (res == 135 && res == 121 && res == 78) {
                    grises2[19] += 1;
                }
                if (res == 83 && res == 104 && res == 120) {
                    grises2[20] += 1;
                }
                if (res == 93 && res == 103 && res == 112) {
                    grises2[21] += 1;
                }
                if (res == 102 && res == 102 && res == 102) {
                    grises2[22] += 1;
                }
                if (res == 89 && res == 100 && res == 106) {
                    grises2[23] += 1;
                }
                if (res == 73 && res == 96 && res == 99) {
                    grises2[24] += 1;
                }
                if (res == 85 && res == 85 && res == 85) {
                    grises2[25] += 1;
                }
                if (res == 52 && res == 52 && res == 52) {
                    grises2[26] += 1;
                }

            }
        }

        return Promedio;
    }

    public BufferedImage imagenLuminosidad(File imagenOriginal) throws IOException {
        BufferedImage img;
        BufferedImage Luminosidad;

        img = ImageIO.read(imagenOriginal);
        Luminosidad = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
        int res;
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                int rgb = img.getRGB(i, j);
                Color color = new Color(rgb, true);
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                res = (int) ((r * .299) + (g * .587) + (b * .114));
                color = new Color(res, res, res);
                Luminosidad.setRGB(i, j, color.getRGB());

                if (res == 229 && res == 228 && res == 226) {
                    grises3[0] += 1;
                }
                if (res == 205 && res == 205 && res == 205) {
                    grises3[1] += 1;
                }
                if (res == 215 && res == 208 && res == 183) {
                    grises3[2] += 1;
                }
                if (res == 190 && res == 190 && res == 190) {
                    grises3[3] += 1;
                }
                if (res == 180 && res == 188 && res == 192) {
                    grises3[4] += 1;
                }
                if (res == 185 && res == 184 && res == 181) {
                    grises3[5] += 1;
                }
                if (res == 145 && res == 163 && res == 176) {
                    grises3[6] += 1;
                }
                if (res == 145 && res == 163 && res == 176) {
                    grises3[7] += 1;
                }
                if (res == 150 && res == 152 && res == 154) {
                    grises3[8] += 1;
                }
                if (res == 144 && res == 144 && res == 144) {
                    grises3[9] += 1;
                }
                if (res == 155 && res == 143 && res == 121) {
                    grises3[10] += 1;
                }
                if (res == 145 && res == 136 && res == 139) {
                    grises3[11] += 1;
                }
                if (res == 139 && res == 133 && res == 137) {
                    grises3[12] += 1;
                }
                if (res == 129 && res == 135 && res == 139) {
                    grises3[13] += 1;
                }
                if (res == 132 && res == 132 && res == 130) {
                    grises3[14] += 1;
                }
                if (res == 143 && res == 129 && res == 127) {
                    grises3[15] += 1;
                }
                if (res == 115 && res == 134 && res == 120) {
                    grises3[16] += 1;
                }
                if (res == 128 && res == 128 && res == 128) {
                    grises3[17] += 1;
                }
                if (res == 135 && res == 125 && res == 96) {
                    grises3[18] += 1;
                }
                if (res == 135 && res == 121 && res == 78) {
                    grises3[19] += 1;
                }
                if (res == 83 && res == 104 && res == 120) {
                    grises3[20] += 1;
                }
                if (res == 93 && res == 103 && res == 112) {
                    grises3[21] += 1;
                }
                if (res == 102 && res == 102 && res == 102) {
                    grises3[22] += 1;
                }
                if (res == 89 && res == 100 && res == 106) {
                    grises3[23] += 1;
                }
                if (res == 73 && res == 96 && res == 99) {
                    grises3[24] += 1;
                }
                if (res == 85 && res == 85 && res == 85) {
                    grises3[25] += 1;
                }
                if (res == 52 && res == 52 && res == 52) {
                    grises3[26] += 1;
                }

            }
        }

        return Luminosidad;
    }

    public BufferedImage imagen(BufferedImage imagenGris) throws IOException {
        BufferedImage otsu=null;
        BufferedImage imagenOriginalGris = null;
        
        imagenOriginalGris = new BufferedImage(imagenGris.getWidth(), imagenGris.getHeight(), imagenGris.getType());
        for (int i = 0; i < imagenGris.getWidth(); i++) {
            for (int j = 0; j < imagenGris.getHeight(); j++) {
                int rgb = imagenGris.getRGB(i, j);
                Color color = new Color(rgb, true);
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                Color nuevo = new Color(r, g, b);
                imagenOriginalGris.setRGB(i, j, nuevo.getRGB());

            }
        }
        otsu= new BufferedImage(imagenOriginalGris.getWidth(),imagenOriginalGris.getHeight(),imagenOriginalGris.getType());
        Color Nuevo;
        for (int i = 0; i < imagenOriginalGris.getWidth(); i++) {
            for (int j = 0; j <imagenOriginalGris.getWidth(); j++) {
                int rgb= imagenOriginalGris.getRGB(i, j);
                Color color = new Color(rgb,true);
                int r=color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
               
                if(r<=128){
                   Nuevo= new Color(0,0,0);
                   otsu.setRGB(i, j, Nuevo.getRGB());
               }else{
                    Nuevo= new Color(255,255,255);
                   otsu.setRGB(i, j, Nuevo.getRGB());
                }
                
            }
        }

        return otsu;
    }

    public int formula(int arreglo[]) {
        int arreglofiinal[] = new int[arreglo.length];
        int valor1 = 0, valor2 = 0, valor3 = 0, valor1Oscuro = 0, valor2Oscuro = 0, valor3Oscuro = 0, resultadoFinal = 0;
        for (int i = 0; i < arreglofiinal.length; i++) {
            arreglofiinal[i] = arreglo[i];
        }
        for (int i = 0; i < arreglofiinal.length; i++) {

            if (i < 15) {
                valor2 += arreglofiinal[i] + i;
                valor1 += arreglofiinal[i];
            }

        }
        valor1 /= 27;
        valor2 /= 15;
        for (int i = 1; i <= 15; i++) {
            valor3 += Math.pow((i - valor2), 2) * arreglofiinal[i];
        }
        valor3 /= 15;
        for (int i = 15; i < arreglofiinal.length; i++) {
            valor1Oscuro += arreglofiinal[i];
            valor2Oscuro += arreglofiinal[i] * i;
        }
        valor1Oscuro /= 27;
        valor2Oscuro /= 12;
        for (int i = 15; i < arreglofiinal.length; i++) {
            valor3Oscuro += Math.pow((i - valor2Oscuro), 2) * arreglofiinal[i];

        }
        valor3Oscuro /= 12;
        resultadoFinal = (valor1 * valor3) + (valor1Oscuro * valor3Oscuro);
        return resultadoFinal;
    }

    public int[] getGrises1() {
        return grises1;
    }

    public void setGrises1(int[] grises) {
        this.grises1 = grises;
    }

    public int[] getGrises2() {
        return grises2;
    }

    public void setGrises2(int[] grises2) {
        this.grises2 = grises2;
    }

    public int[] getGrises3() {
        return grises3;
    }

    public void setGrises3(int[] grises3) {
        this.grises3 = grises3;
    }

}
