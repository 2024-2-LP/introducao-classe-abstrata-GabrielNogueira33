package school.sptech;

public abstract class Figura {
    private String cor;
    private Integer espessura;

    public abstract Double calcularArea();

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "cor='" + cor + '\'' +
                ", espessura=" + espessura +
                '}';
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }
}
