package modelo;

import java.io.Serializable;


public class PersonaFactory implements Serializable{
    public Persona crearPersona(String tipoPersona, int id,int idFactura){
        if(tipoPersona.equals("Juridico")){
            return new PersonaJuridica(id,idFactura);
        }
        else if(tipoPersona.equals("Fisico")){  	
            return new PersonaFisica(id,idFactura);
        }
        return null;
    }
}
