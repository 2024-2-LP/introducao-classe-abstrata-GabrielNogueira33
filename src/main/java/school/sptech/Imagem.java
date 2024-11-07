package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras = new ArrayList<>();
   // private List<Figura> areas = new ArrayList<>();

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double resultado = 0.0;

        for (Figura figura : figuras) {
            resultado += figura.calcularArea();
        }
        return resultado;
    }

    public List <Figura> buscarPorAreaMaiorQue20(){

        List <Figura> figuraMaior = new ArrayList<>();

        for (Figura figura : figuras) {
            if(figura.calcularArea() > 20){
                figuraMaior.add(figura);
            }
        }

        return figuraMaior;

    }

    public List<Figura> buscarQuadrados(){

        List<Figura> quadrados = new ArrayList<>();

        for (Figura figura :figuras) {
            if(figura instanceof Quadrado){
                quadrados.add(figura);
            }
        }

        return quadrados;
    }
}
