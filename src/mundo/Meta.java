package mundo;

import java.net.URL;

import javax.swing.ImageIcon;

public class Meta extends Objeto{
	/**
	 * @author Jhonatan David Rico
	 */
	/**
	 * Constructor de la clase
	 * @param x = posicion de la pared en la matriz, equivalente a i
	 * @param y = pocicion de la pared en la matriz, equivalente a j
	 */
	public Meta(int x, int y){
		super(x, y);
		//Asignamos la ruta donde se encuentra guardado nuestro sprite para una meta
		URL ruta = this.getClass().getResource("Meta.png");
		//Creamos un icono con la imagen asignada
		ImageIcon icono = new ImageIcon(ruta);
		//Le asignamos esa imagen al objeto "Meta"
		this.setImagen(icono.getImage());
	}
}
