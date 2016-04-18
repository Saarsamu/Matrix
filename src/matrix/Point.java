/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author saarsamu
 */
public class Point implements Comparable<Point>{
    private int x;
    private int y;

    public Point(){
        this(0,0);
    }
    public Point(int x, int y){
        setX(x);
        setY(y);
    }
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public int compareTo(Point o) {
        if(this.getX()<o.getX()) return -1;
        if(this.getX()==o.getX()) {
            if(this.getY()<o.getY()) return -1;
            if(this.getY()==o.getY()) return 0;
            return 1;
        }
        return 1;
    }
     @Override public String toString() {
        return "" + getX() + "," + getY();
    }
}
