package atividade06;

import java.util.ArrayList;

public class TesteFormasGeometrica {

    public static void main(String[] args) {

        //Cores
        Cor branca = new Cor(255, 255, 255);
        Cor azul = new Cor(0, 0, 255);
        Cor vermelha = new Cor(255, 0, 0);
        Cor amarela = new Cor(255, 255, 0);
        
        //Incerssão de dados
        Quadrado quadrado = new Quadrado(4, branca, vermelha);
        Retangulo retangulo = new Retangulo( 4, 2, amarela, branca);
        Triangulo triangulo = new Triangulo(2, 2, azul, vermelha);
        Circulo circulo = new Circulo(3, azul, branca);
        
        //
        ColecaoFomas colecao = new ColecaoFomas();
         colecao.adicionarFomas(quadrado);
         colecao.adicionarFomas(retangulo);
         colecao.adicionarFomas(triangulo);
         colecao.adicionarFomas(circulo);
         
         
        //testes áreas
        System.out.println("\nÁrea quadrado: " + quadrado.calcArea());
        System.out.println("Área retangulo: " + retangulo.calcArea());
        System.out.println("Área circulo: " + circulo.calcArea());
        System.out.println("Área triangulo: " + triangulo.calcArea());
        
        //testes perimetro
        System.out.println("\nPerimetro quadrado: " + quadrado.calcPerimetro());
        System.out.println("Perimetro retangulo: " + retangulo.calcPerimetro());
        System.out.println("Perimetro circulo: " + circulo.calcPerimetro());
        System.out.println("Perimetro triangulo: " + triangulo.calcPerimetro());
        
        //testes area e perimetro total
        System.out.println("\nÁrea total: " + colecao.calcAreaTotal());
        System.out.println("Perímetro total: " + colecao.calcPerimetroTotal());
         
    }
    
}
