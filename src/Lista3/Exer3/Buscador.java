package Lista3.Exer3;
import java.io.File;
import java.io.FilenameFilter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

//aqui é feito o codigo que roda em cada thread
public class Buscador extends Thread {
   
	public static int numExec = 0;
    
    private File arquivo1;
    private String nome1;
    private String ext1;
    private boolean nome2;
    private boolean ext2;
    FileChooser fc = new FileChooser();
    
    //metodo responsavel por setar os valores pra classe
    public Buscador(File arquivo1, String nome1, String ext1, boolean nome2, boolean ext2) {
        
    	numExec++;
        this.arquivo1 = arquivo1;
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.ext1 = ext1;
        this.ext2 = ext2;
        
    }
    
    //aqui inicia a thread
    @Override
    public void run() {
        search(arquivo1, nome1, ext1, nome2, ext2);
        numExec--;
    }

    //aqui esta o metodo que a thread reproduz
    public void search(File arquivo1, String nome1, String ext1, boolean nome2, boolean ext2) {

        File arquivo = arquivo1;
        String nome = nome1;
        String ext = ext1;
        boolean nomen = nome2;
        boolean extn = ext2;

        if (arquivo.exists()) {

            System.out.println("Arquivos da pasta: " + arquivo);
            String[] arquivos = arquivo.list();

            int contarquivos = 1;

            //aqui mostra os arquivos dentro da pasta
            for (String file : arquivos) {
                System.out.println(contarquivos + " - " + file);
                contarquivos++;

                
                //esta serie de ifs � dedicada a encerrar o programa quando ele obter o resultado
                if (file.startsWith(nome) && file.endsWith(ext) && !nomen && !extn) {

                    System.out.println("\n\nUm arquivo conforme especificado foi encontrado na pasta:\n\n" + arquivo + "/");
                    System.exit(0);  
                    
                } else {
                    if (file.startsWith(nome) && extn) {
                        System.out.println("\n\nUm arquivo conforme especificado foi encontrado na pasta:\n\n" + arquivo + "/");
                        System.exit(0);
                    } else {
                        if (file.endsWith(ext) && nomen) {
                            System.out.println("\n\nUm arquivo conforme especificado foi encontrado na pasta:\n\n" + arquivo + "/");
                            System.exit(0);
                        }
                    }
                }

            }
            
            //aqui � analizado se uma subpasta foi encontrada, ent�o por meio de recursividade
            // � criada uma nova thread dentro da thread pai
            for (String file : arquivos) {

                if (new File(arquivo + "/" + file).isDirectory()) {
                    System.out.println("\nPasta encontrada: " + file + "\n");

                    File arquivo2 = new File(arquivo + "/" + file);
       
                    System.out.println("Nova thread para " + arquivo2);
                    Buscador w = new Buscador(arquivo2, nome, ext, nomen, extn);
                    w.start();
                }
            }

         
        }
    }
}
