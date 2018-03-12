package Lista3.Exer3;


import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.filechooser.*;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

public class FileChooser extends JPanel{
	
	public boolean nomenao = true;
	public boolean extnao = true;
	
	public String nomesim = " ";
	public String extsim = " ";
	
	JButton diretorioinicial;
	JButton procurar;
	
	JLabel nomeprocurado;
	JTextField nomeaqui;
	JButton nomeaceitar;
	JButton nomerecusar;
	
	JLabel extprocurado;
	JTextField extaqui;
	JButton extaceitar;
	JButton extrecusar;
	
	public JFileChooser chooser;
	static String choosertitle;
	File arquivoz;

	public FileChooser() {
		
			//botao que faz procurar diretorio inicial
			diretorioinicial = new JButton("Escolher diretorio inicial");
			add(diretorioinicial);
			diretorioinicial.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	
					//aqui é criada a interface de selecionar o diretorio inicial
					//o pendrive aparece em volumes, dentro da raiz
					JFileChooser chooser = new JFileChooser();
					chooser.setCurrentDirectory(new java.io.File("."));
					chooser.setDialogTitle("choosertitle");
					chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					chooser.setAcceptAllFileFilterUsed(false);

					if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
						arquivoz = chooser.getSelectedFile();
					} else {
						System.out.println("Nao vai procurar?");
					}

				}
			});

			procurar = new JButton("Iniciar busca");
			add(procurar);
			procurar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
		 
					//Aqui a thread � criada pela primeira vez no programa e � setado os valores
					//para a classe work
					File arquivo = arquivoz;	     	
					Buscador worq = new Buscador(arquivo, nomesim, extsim, nomenao, extnao);
                                        worq.start();
                                        while (worq.numExec != 0) {
                                            try {
                                                Thread.sleep(500);
                                            } catch (InterruptedException ex) {
                                                Logger.getLogger(FileChooser.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                    }
							 
				}
			});

			//daqui em diante � s� pra criar a interacao que pede
			//se o usuario quer especificar nome ou extensao
			
			nomeprocurado = new JLabel("Selecione o nome do arquivo que voce deseja");
			add(nomeprocurado);
			
			nomeaqui = new JTextField(15);
			add(nomeaqui);
			
			nomeaceitar = new JButton("OK");
			add(nomeaceitar);
			nomeaceitar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	
					nomesim = nomeaqui.getText();
					nomenao = false;

				}
			});
			
			nomerecusar = new JButton("Nao definir nome");
			add(nomerecusar);
			nomerecusar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	
					nomenao = true;

				}
			});
			
			extprocurado = new JLabel("Selecione a extensao do arquivo que voce deseja");
			add(extprocurado);
			
			extaqui = new JTextField(13);
			add(extaqui);
			
			extaceitar = new JButton("OK");
			add(extaceitar);
			extaceitar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	
					extsim = extaqui.getText();
					extnao = false;

				}
			});
			
			extrecusar = new JButton("Nao definir extensao");
			add(extrecusar);
			extrecusar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	
					extnao = true;

				}
			});
			
			
			
		}

 
}
