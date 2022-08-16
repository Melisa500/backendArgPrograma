package com.melisaportfolio.melisa.Service;

import com.melisaportfolio.melisa.Entity.Usuario;
import com.melisaportfolio.melisa.Interface.IUsuarioService;
import com.melisaportfolio.melisa.Repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpUsuarioService implements IUsuarioService{
    
    @Autowired IUsuarioRepository iusuarioRepository;
    
    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> usuario = iusuarioRepository.findAll();
        return usuario;
    }

    
    @Override
    public void saveUsuario(Usuario usuario) {
        try {
            iusuarioRepository.save(usuario);
        }catch(Exception e ){
            System.out.println("error " + e.getMessage());
            throw e;
        }
    }

    @Override
    public void deleteUsuario(Long id) {
        iusuarioRepository.deleteById(id);    
    }

    @Override
    public Usuario findUsuario(Long id) {
        Usuario usuario = iusuarioRepository.findById(id).orElse(null);
        return usuario;
    }
    
}