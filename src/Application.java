public class Application {
  public static void main(String[] args) {
    Triangulo triangulo = new Triangulo(10, 5);
    Circulo circulo = new Circulo(7);
    Retangulo retangulo = new Retangulo(8, 9);

    double areaTriangulo = triangulo.area();
    double areaCirculo = circulo.area();
    double areaRetangulo = retangulo.area();

    System.out.println(areaTriangulo);
    System.out.println(areaRetangulo);
    System.out.println(areaCirculo);
  }
}