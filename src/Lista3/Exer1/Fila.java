package Lista3.Exer1;

import java.util.*;

public class Fila {
    
    final int iMaxSize = 10;
    
    Item oInicio = null;
    Item oFim = null;
    int iSize = 0;        
    
    public boolean Insert(int iNum){        
        
        if (this.iSize >= this.iMaxSize) {
            return false;
        }
        
        Item oNew = new Item();
        oNew.setNum(iNum);

        if (oInicio == null) {
            oInicio = oNew;
            oFim = oNew;
            oNew.prox = null;
        } else {
            oFim.prox = oNew;
            oFim = oNew;
            oFim.prox = null;
        }

        this.iSize++;
        
        return true;
    }
    
    public int Delete(){
        if (oInicio == null) {            
            System.out.println("Fila vazia");
            return -1;
        } else {
            int iRetornar = oInicio.getNum();
            oInicio = oInicio.getProx();
            this.iSize--;
            return iRetornar;
        }
    }
    
    public void List(){
        if (oInicio == null) {
            System.out.println("Fila vazia");
        } else {
            Item oAux = oInicio;

            do {
                System.out.print(oAux.getNum());
                oAux = oAux.getProx();

                if (oAux != null) {
                   System.out.print(",");
                }
            } while (oAux != null); 
        }

        System.out.println("\n");                    
    }
}