public class Sensor {

  private String tipo;
  private double valor;

  public Sensor() {

  }

  public Sensor(String t, double v) {
    this.tipo = t;
    this.valor = v;
  }

  public String getTipo() {
    return tipo;
  }

  public double getValor() {
    return valor;
  }

  public void setTipo(String t) {
    this.tipo = t;
  }

  public void setValor(double v) {
    this.valor = v;
  }

  public String toString() {
    return "Sensor tipo: " + this.tipo + "\n" + "valor: " + this.valor;
  }

}