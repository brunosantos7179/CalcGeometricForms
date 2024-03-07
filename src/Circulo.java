public class Circulo extends FormasGeometricas {
  private double raioCirculo;

  public Circulo(double raioCirculo){
    this.raioCirculo = raioCirculo;
  }

  @Override
  public double area() {
    return (Math.PI * raioCirculo * raioCirculo);
  }
}
