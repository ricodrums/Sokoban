package mundo;

import java.awt.Image;

public class Objeto {
	/**
	 * @author Jhonatna David Rico
	 */
	/**
	 * Declaración de variables
	 * x = Coordenada i de la matriz donde estará el objeto
	 * y = Coordenada j de la matriz donde estará el objeto
	 */
	private int x, y;
	private Image imagen;
	/**
	 * Contructor de la clase
	 * @param x Coordenada i del objeto en la matriz
	 * @param y Coordenada j del objeto en la matriz
	 */
	public Objeto(int x, int y){
		this.x = x;
		this.y = y;
	}

	
	
	/**
	 * Getters y Setters
	 */
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}
}
