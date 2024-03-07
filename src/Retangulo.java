public class Retangulo extends FormasGeometricas {
  private double largura;
  private double altura;

  public Retangulo(double largura, double altura){
    this.largura = largura;
    this.altura = altura;
  }

  @Override
  public double area() {
    return (largura * altura);
  }
}