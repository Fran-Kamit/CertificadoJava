package com.spring.clinica.Controladores;

import com.spring.clinica.Modelo.Usuarios;
import com.spring.clinica.Servicios.UsuariosServicios;

import org.owasp.html.PolicyFactory;
import org.owasp.html.Sanitizers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Controller //se utiliza para construir aplicaciones web y devuelve vistas.
@RequestMapping("/usuarios")
public class UsuariosControlador {

    @Autowired
    private UsuariosServicios usuariosServicios;

    // Instancia a Sanitizador de HTML import org.owasp.html.PolicyFactory; import org.owasp.html.Sanitizers;
    private static final PolicyFactory POLICY_FACTORY = Sanitizers.FORMATTING.and(Sanitizers.LINKS);

    /* Se crea poniendo la hora de forma automática*/
    @PostMapping("/crear")
    public String crearUsuario(@ModelAttribute Usuarios usuario) { 
        // Asigna y establece la hora de creación
        LocalDateTime currentDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        usuario.setUsuarCreado(currentDateTime);
        
        //Sanitizar inputs
        String sanitizarDomicilio = POLICY_FACTORY.sanitize(usuario.getUsuarDomicilio()); usuario.setUsuarDomicilio(sanitizarDomicilio);
        String sanitizarPoblacion = POLICY_FACTORY.sanitize(usuario.getUsuarPoblacion()); usuario.setUsuarPoblacion(sanitizarPoblacion);
        String sanitizarProvincia = POLICY_FACTORY.sanitize(usuario.getUsuarProvincia()); usuario.setUsuarProvincia(sanitizarProvincia);
        String sanitizarPais = POLICY_FACTORY.sanitize(usuario.getUsuarPais()); usuario.setUsuarPais(sanitizarPais);
        
        usuariosServicios.save(usuario);
        return "redirect:/usuarios/listado-usuarios";
    }
    
    @GetMapping("/crear-usuario")
    public String showCreateUserForm(Model model) {
        Usuarios usuario = new Usuarios();
        usuario.setUsuarCodigoIdentificacion(UUID.randomUUID()); // Generar un nuevo UUID
        model.addAttribute("usuario", usuario);
        return "/views/Usuarios/crear-usuario";
    }

    
    //metodo dar formato fechas.
    public String formatLocalDateTime(LocalDateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        return dateTime.format(formatter);
    }

    // Obtener todos los Usuarios (GET)
    @GetMapping
    public ResponseEntity<List<Usuarios>> getAllUsuarios() {
        List<Usuarios> usuarios = usuariosServicios.findAll();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    // Obtener un usuario por ID (GET)
    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> getUsuarioByusuarCodigoIdentificacion(@PathVariable UUID id) {
        Usuarios usuario = usuariosServicios.findByusuarCodigoIdentificacion(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    //Obtener usuario para editar en html
    @GetMapping("/detalle/{id}")
    public String verUsuarioDetalle(@PathVariable UUID id, Model model, HttpSession session) {
        Usuarios usuario = usuariosServicios.findByusuarCodigoIdentificacion(id);
        model.addAttribute("usuario", usuario);
        session.setAttribute("creado_dia", usuario.getUsuarCreado());
        return "/views/Usuarios/detalle-usuario";
    }
    
    /* Se actualiza poniendo la hora de forma automática*/
    // Actualizar un usuario existente (POST)
    @PostMapping("/actualizar/{id}")
    public String actualizarUsuario(@ModelAttribute("usuario") Usuarios usuario, @PathVariable UUID id, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            // Manejar errores de validación aquí
            return "views/Usuarios/detalle-usuario";
        }
        LocalDateTime currentDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        usuario.setUsuarModificado(currentDateTime);
        usuario.setUsuarCodigoIdentificacion(id);
        LocalDateTime usuarCreado = (LocalDateTime) session.getAttribute("creado_dia");
        usuario.setUsuarCreado(usuarCreado);

        //Sanitizar inputs
        String sanitizarDomicilio = POLICY_FACTORY.sanitize(usuario.getUsuarDomicilio()); usuario.setUsuarDomicilio(sanitizarDomicilio);
        String sanitizarPoblacion = POLICY_FACTORY.sanitize(usuario.getUsuarPoblacion()); usuario.setUsuarPoblacion(sanitizarPoblacion);
        String sanitizarProvincia = POLICY_FACTORY.sanitize(usuario.getUsuarProvincia()); usuario.setUsuarProvincia(sanitizarProvincia);
        String sanitizarPais = POLICY_FACTORY.sanitize(usuario.getUsuarPais()); usuario.setUsuarPais(sanitizarPais);

        usuariosServicios.save(usuario);
        return "redirect:/usuarios/listado-usuarios";
    }  

    //Eliminar un Usuario por ID (DELETE)
    @PostMapping("/eliminar/{id}")
    public String eliminarUsuario(@PathVariable UUID id) {
        usuariosServicios.deleteById(id);
        return "redirect:/usuarios/listado-usuarios";
    }

    //Creando la interfaz web
    public UsuariosControlador(UsuariosServicios usuariosServicios) {
        this.usuariosServicios = usuariosServicios;
    }

    //Obtener listado de usuarios
    @GetMapping("/listado-usuarios")
    public String listarUsuarios(Model model) {
        List<Usuarios> usuarios = usuariosServicios.findAll();
        model.addAttribute("usuarios", usuarios);
        return "/views/Usuarios/listado-usuarios";
    }  
}