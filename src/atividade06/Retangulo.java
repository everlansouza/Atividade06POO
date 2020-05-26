package atividade06;

public class Retangulo extends FormaGeometrica{

    private final double base, altura;
    
    public Retangulo(double base, double altura, Cor borda, Cor preench){
        super( borda, preench);
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public double calcArea(){
        double area;
        area = base * altura;
        return area;
    }
    
    @Override
    public double calcPerimetro(){
        double perimetro;
        perimetro = (2 * base) + (2* altura);
        return perimetro;
    }
}
