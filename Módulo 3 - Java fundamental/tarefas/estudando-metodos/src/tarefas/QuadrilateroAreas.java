package tarefas;

public class QuadrilateroAreas {
	
	public static float areaQuadrilatero(float lado) {
		float area = lado * lado;
		return area;
	}
	public static float areaQuadrilatero(float lado1,float  lado2) {
		float area = lado1 * lado2;
		return area;
	}
	public static float areaQuadrilatero(float baseMenor,float baseMaior, float altura) {
		float area = (baseMaior+baseMenor)*altura / 2;
		return area;
	}
	
	public static void informarArea(float area) {
		System.out.println("A área do seu quadrilátero é "+area);
		
	}

}
