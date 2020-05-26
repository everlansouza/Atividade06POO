package atividade06;

public class Circulo extends FormaGeometrica{
    
    private final double raio, pi = 3.1416;
    
    public Circulo(double raio, Cor borda, Cor preench){
        super(borda, preench);
        this.raio = raio;
    }
    
    @Override
    public double calcArea(){
        double area;
        area = Math.pow(raio, 2) * pi;
        return area;
    }
    
    @Override
    public double calcPerimetro(){
        double perimetro;
        perimetro = 2 * pi * raio;
        return perimetro;
    }
}
