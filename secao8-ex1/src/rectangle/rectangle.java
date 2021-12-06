package rectangle;

public class rectangle {
	public double width;
	public double heigth;
	
	public double area() {				
		return width * heigth;
	}
	
	public double perimetro() {
		return 2 * (width + heigth);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + heigth * heigth);
	}

}
