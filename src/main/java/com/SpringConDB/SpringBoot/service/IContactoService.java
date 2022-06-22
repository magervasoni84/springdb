
package com.SpringConDB.SpringBoot.service;

import java.util.List;
import com.SpringConDB.SpringBoot.model.Contacto;


public interface IContactoService {  
    public List<Contacto> verContacto();

    public void crearContacto(Contacto contac);

    public void borrarContacto(Long id);   

    public Contacto buscarContacto(Long id);


}
