package com.melisaportfolio.melisa.Interface;

import com.melisaportfolio.melisa.Entity.Usuario;
import java.util.List;


public interface IUsuarioService {
    
   //public Usuario getUsuarioo();
   
    //Traer Lista
   public List<Usuario> getUsuario();
   
   //Guardar un objeto
   public void saveUsuario (Usuario usuario);
   
   //Eliminar objeto por id
   public void deleteUsuario(Long id);
   
   //Buscar un usuario por ID
   public Usuario findUsuario(Long id);
}
