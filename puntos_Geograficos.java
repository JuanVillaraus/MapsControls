package Introduction;
import gov.nasa.worldwind.BasicModel;
import gov.nasa.worldwind.awt.*;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.layers.LayerList;
import gov.nasa.worldwind.layers.RenderableLayer;
import gov.nasa.worldwind.render.PointPlacemark;

//import javax.swing.*;


public class puntos_Geograficos
{



public puntos_Geograficos()
{
	//constructor
}

public void addPuntos(WorldWindowGLCanvas mapa, Double Latitud, Double Longitud, String Etiqueta)
{
    LayerList listaCapas = mapa.getModel().getLayers();
	RenderableLayer capaPuntos = new RenderableLayer();
	PointPlacemark myPunto = new PointPlacemark(Position.fromDegrees(Latitud, Longitud));
	myPunto.setLabelText(Etiqueta);
	capaPuntos.addRenderable(myPunto);
	listaCapas.add(capaPuntos);
}

	
public static void main(String[] args) 
{
		
	}

}
