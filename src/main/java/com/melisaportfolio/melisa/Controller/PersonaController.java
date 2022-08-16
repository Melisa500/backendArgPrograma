package com.melisaportfolio.melisa.Controller;

import com.melisaportfolio.melisa.Entity.Usuario;
import com.melisaportfolio.melisa.Interface.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
   @Autowired IUsuarioService iusuarioService; 
   
   @GetMapping("usuario")
   public List<Usuario> getUsuario() {
       return iusuarioService.getUsuario();
    }
   
   @PostMapping("usuario")
   public String createUsuario (@RequestBody Usuario usuario){
       iusuarioService.saveUsuario(usuario);
       return "Se creó un nuevo usuario";
   }
   
   @DeleteMapping("usuario/{id}")
   public String deleteUsuario(@PathVariable Long id){
       iusuarioService.deleteUsuario(id);
       return "Se borro el usuario";
   }
   
   @PutMapping("usuario/{id}")
   public Usuario editUsuario(@PathVariable Long id,@RequestBody Usuario usuario){
      Usuario editUsuario = iusuarioService.findUsuario(id);
      
      editUsuario.setNombre(usuario.getNombre());
      editUsuario.setApellido(usuario.getApellido());
      editUsuario.setTitulo(usuario.getTitulo());
      editUsuario.setSobre_mi(usuario.getSobre_mi());
      editUsuario.setUrl_foto(usuario.getUrl_foto());
      editUsuario.setUsername(usuario.getUsername());
      editUsuario.setPassword(usuario.getPassword());
      
      iusuarioService.saveUsuario(editUsuario);
      return editUsuario;
   }
   
   
   
}
