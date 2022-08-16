
package com.melisaportfolio.melisa.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 20, message = "No válido")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 20, message = "No válido")
    private String apellido;
        
    @NotNull
    @Size(min = 1, max = 80, message = "No válido")
    private String titulo;
        
    @NotNull
    @Size(min = 1, max = 150, message = "No válido")
    private String sobre_mi;
        
    @Size(min = 1, max = 200, message = "No válido")
    private String url_foto;
            
    @NotNull
    @Size(min = 1, max = 20, message = "No válido")
    private String username;
                
    @NotNull
    @Size(min = 1, max = 20, message = "No válido")
    private String password;
    
    
}
