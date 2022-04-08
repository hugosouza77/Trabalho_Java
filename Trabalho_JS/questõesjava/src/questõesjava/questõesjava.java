public class trabalho {
	public static void main(String[] args) {
		System.out.println("Questão 1");

		double pi = 3.14159;
		double raio = 21;
		double areaCirculo = pi * (raio * raio);

		System.out.println("Área do Círculo = " + areaCirculo);
		System.out.println();


		System.out.println("Questão 2");

		double A = 10;
		double B = 15;
		double C = 20;
		double areaTriangulo = (A * C)/2;
		double areaCirculo2 = pi * (C * C);
		double areaTrapezioPT1 = (A + B) * C;
		double areaTrapezioPT2 = areaTrapezioPT1 / 2;
		double areaQuadrado = B * B;
		double areaRetangulo = A * B;

		System.out.println("Área do Triângulo = " + areaTriangulo);
		System.out.println("Área do Círculo = " + areaCirculo2);
		System.out.println("Área do Trapézio = " + areaTrapezioPT2);
		System.out.println("Área do Quadrado = " + areaQuadrado);
		System.out.println("Área do Retangulo = " + areaRetangulo);
		System.out.println();


		System.out.println("Questão 3");

		double a = 3;
		double b = -15;
		double c = 12;
		double delta = Math.pow(b, 2.0) - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

    }

}