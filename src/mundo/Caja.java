package mundo;

import java.net.URL;

import javax.swing.ImageIcon;

public class Caja extends Objeto{
	/**
	 * @author Jhonatan David Rico
	 */
	/**
	 * Constructor de la clase
	 * @param x = posicion de la pared en la matriz, equivalente a i
	 * @param y = pocicion de la pared en la matriz, equivalente a j
	 */
	public Caja(int x, int y){
		super(x, y);
		//Asignamos la ruta donde se encuentra guardado nuestro sprite para una caja
		URL ruta = this.getClass().getResource("Caja.png");
		//Creamos un icono con la imagen asignada
		ImageIcon icono = new ImageIcon(ruta);
		//Le asignamos esa imagen al objeto "Caja"
		this.setImagen(icono.getImage());
	}
}
