package atividade06;

import java.util.ArrayList;

public class ColecaoFomas {

    ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
    
    public void adicionarFomas(FormaGeometrica formas){
        this.formas.add(formas);
    }
    
    
    public double calcAreaTotal() {
        double areaTotal = 0;

        for (FormaGeometrica f : formas) {
            areaTotal += f.calcArea();
        }
        return areaTotal;
    }

    public double calcPerimetroTotal() {
        double perimetroTotal = 0;

        for (FormaGeometrica f : formas) {
            perimetroTotal += f.calcPerimetro();
        }
        return perimetroTotal;
    }
}
