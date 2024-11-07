package school.sptech;

public class Circulo extends Figura{

    private Double raio;

    @Override
    public Double calcularArea(){
        return 3.14159 * Math.pow(raio,2);
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
