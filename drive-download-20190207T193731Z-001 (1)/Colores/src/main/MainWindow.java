package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.plaf.FileChooserUI;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 792, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 203, 154);
		frame.getContentPane().add(scrollPane);

		JLabel label = new JLabel("");
		label.setIcon(null);
		scrollPane.setViewportView(label);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(292, 11, 203, 154);
		frame.getContentPane().add(scrollPane_1);

		JLabel label_1 = new JLabel("");
		scrollPane_1.setViewportView(label_1);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(531, 11, 203, 154);
		frame.getContentPane().add(scrollPane_2);

		JLabel label_2 = new JLabel("");
		scrollPane_2.setViewportView(label_2);
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(292, 178, 203, 191);
		frame.getContentPane().add(scrollPane_3);

		JLabel label_3 = new JLabel("");
		scrollPane_3.setViewportView(label_3);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(531, 176, 203, 191);
		frame.getContentPane().add(scrollPane_4);

		JLabel label_4 = new JLabel("");
		scrollPane_4.setViewportView(label_4);

		JButton btnSeleccionar = new JButton("Seleccionar...");
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc = new JFileChooser();
				fc.showOpenDialog(null);
				File archivoImagen = fc.getSelectedFile();
				String ruta = archivoImagen.getPath();

				ImageIcon img = new ImageIcon(ruta);

				label.setIcon(img);

				// gris:
				try {
					BufferedImage bf = ImageIO.read(archivoImagen);

					for (int x = 0; x < bf.getWidth(); x++) {
						for (int y = 0; y < bf.getHeight(); y++) {
							int rgb = bf.getRGB(x, y);
							Color color = new Color(rgb, true);
							int r = color.getRed();
							int g = color.getGreen();
							int b = color.getBlue();

							int grayLevel = (r + g + b) / 3;

							Color gris = new Color(grayLevel, grayLevel, grayLevel);
							bf.setRGB(x, y, gris.getRGB());
						}
					}

					label_1.setIcon(new ImageIcon(bf));

					// negativo:

					BufferedImage bf2 = ImageIO.read(archivoImagen);

					for (int x = 0; x < bf2.getWidth(); x++) {
						for (int y = 0; y < bf2.getHeight(); y++) {
							int rgb = bf2.getRGB(x, y);
							Color color = new Color(rgb, true);
							int r = color.getRed();
							int g = color.getGreen();
							int b = color.getBlue();

							int resta = 255;

							Color negativo = new Color(resta - r, resta - g, resta - b);
							bf2.setRGB(x, y, negativo.getRGB());

						}
					}
					label_2.setIcon(new ImageIcon(bf2));

					// MIN MAX
					BufferedImage bf3 = ImageIO.read(archivoImagen);
					for (int x = 0; x < bf3.getWidth(); ++x) {
						for (int y = 0; y < bf3.getHeight(); ++y) {
							int rgb = bf3.getRGB(x, y);
							Color color = new Color(rgb, true);
							int r = color.getRed();
							int g = color.getGreen();
							int b = color.getBlue();
							// int r = (rgb >> 16) & 0xFF;
							// int g = (rgb >> 8) & 0xFF;
							// int b = (rgb & 0xFF);

							int max = Math.max(Math.max((int) r, (int) g), (int) b);
							int min = Math.min(Math.min((int) r, (int) g), (int) b);

							int res = (max + min) / 2;

							// int grayLevel = (r + g + b) / 3;
							// int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel;

							Color grisMM = new Color(res, res, res);
							bf3.setRGB(x, y, grisMM.getRGB());

						}
					}
					label_3.setIcon(new ImageIcon(bf3));

					BufferedImage bf4 = ImageIO.read(archivoImagen);

					for (int x = 0; x < bf4.getWidth(); ++x) {
						for (int y = 0; y < bf4.getHeight(); ++y) {
							int rgb = bf4.getRGB(x, y);
							Color color = new Color(rgb, true);
							int r = color.getRed();
							int g = color.getGreen();
							int b = color.getBlue();

							int nitidez = (int) ((0.299*r)+(0.587*g)+(0.114*b));
							
							Color N = new Color(nitidez,nitidez,nitidez);
							
							bf4.setRGB(x, y, N.getRGB());
							
							
							
						}

					}
					label_4.setIcon(new ImageIcon(bf4));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		btnSeleccionar.setBounds(59, 176, 110, 23);
		frame.getContentPane().add(btnSeleccionar);

	}

	public static BufferedImage imageToBufferedImage(Image im) {
		BufferedImage bi = new BufferedImage(im.getWidth(null), im.getHeight(null), BufferedImage.TYPE_INT_RGB);
		Graphics bg = bi.getGraphics();
		bg.drawImage(im, 0, 0, null);
		bg.dispose();
		return bi;
	}
}
