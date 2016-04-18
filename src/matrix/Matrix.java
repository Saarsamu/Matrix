/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author saarsamu
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    TreeMap cells = new TreeMap(); 
    private int rowCount = 0;
    private int colCount = 0;
    
    public void set(int x, int y, int value) {
        if(value != 0) {
            cells.put(new Point(x,y), value);
            if (x > rowCount) rowCount = x;
            if (y > colCount) colCount = y;
        }
    }
    public int get(int x, int y) {
        return (int) cells.get(new Point(x,y));
    }
    
    public void product(int coefficient) {
        
    }
    
    public boolean sum(Matrix other) {
        return false;
    }
    
    public int getRowCount() {
        return rowCount +1;
    }
    
    public int getColCount() {
        return colCount +1;
    }
    
    public void print() {
        for (int i = 0; i < getRowCount(); i++) {
            for (int j = 0; j < getColCount(); j++) {
                
                System.out.print(cells.get(new Point(i,j)) + " ");
            }
            System.out.println("");
        }
    }    
}
