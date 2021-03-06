package atividade06;

public class Quadrado extends FormaGeometrica{
    
    private final double lado;
    
    public Quadrado(double lado, Cor borda, Cor preench){
        super(borda, preench);
        this.lado = lado;
    }
    
    @Override
    public double calcArea(){
        double area;
        area = lado * lado;
        return area;
    }
    
    @Override
    public double calcPerimetro(){
        double perimetro;
        perimetro = 4 * lado;
        return perimetro;
    }
}
