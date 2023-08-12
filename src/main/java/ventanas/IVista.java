package ventanas;

import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public interface IVista {

    void setActionListener(ActionListener controlador);

    void setWindowListener(WindowListener controlador);

    void ejecutar();

    void cerrarVentana();


    void lanzarVentanaEmergente(String mensaje);
    
    void setKeyListener();
}
