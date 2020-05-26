package atividade06;

public class Triangulo extends FormaGeometrica{

    private final double base, altura;
    
    public Triangulo(double base, double altura, Cor borda, Cor preench){
        super(borda, preench);
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public double calcArea(){
        double area;
        area = base * altura / 2;
        return area;
    }
    
    @Override
    public double calcPerimetro(){
        double perimetro;
        perimetro = base * 3;
        return perimetro;
    }
}
