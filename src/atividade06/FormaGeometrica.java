package atividade06;

public abstract class FormaGeometrica {
    
    protected int x, y ;
    protected Cor borda, preench;
    
    public FormaGeometrica(int x, int y, Cor borda, Cor preench){
        this.x = x;
        this.y = y;
        this.borda = borda;
        this.preench = preench;
    }
    
    public abstract double calcArea();
    
    public abstract double calcperimetro();
}
