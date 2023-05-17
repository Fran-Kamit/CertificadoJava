package com.spring.clinica.Controladores;

import com.spring.clinica.Modelo.Usuarios;
import com.spring.clinica.Servicios.UsuariosServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller //se utiliza para construir aplicaciones web y devuelve vistas.
@RequestMapping("/usuarios")
public class UsuariosControlador {

    @Autowired
    private UsuariosServicios usuariosServicios;

    //metodo dar formato fechas.
    public String formatLocalDateTime(LocalDateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        return dateTime.format(formatter);
    }

 /*/   // Crear un nuevo usuario (POST)
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Usuarios> createUser(@ModelAttribute Usuarios usuario) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        usuario.setUsuarCreado(currentDateTime);
        Usuarios newUser = usuariosServicios.save(usuario);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }*/
    
    //añadir usuarios
    @PostMapping("/usuarios/crear")
    public String createUser(@ModelAttribute Usuarios usuario, BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }
        LocalDateTime currentDateTime = LocalDateTime.now();
        usuario.setUsuarCreado(currentDateTime);
        usuariosServicios.save(usuario);
        return "redirect:/Usuarios/crear-usuario";
    }

    // Actualizar un user existente (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Usuarios> updateUser(@PathVariable UUID id, @RequestBody Usuarios usuario) {
        Usuarios actualizarUsuario = usuariosServicios.update(id, usuario);
        return new ResponseEntity<>(actualizarUsuario, HttpStatus.OK);
    }

    // Obtener todos los Usuarios (GET)
    @GetMapping
    public ResponseEntity<List<Usuarios>> getAllUsers() {
        List<Usuarios> usuario = usuariosServicios.findAll();
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    // Obtener un user por ID (GET)
    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> getUserById(@PathVariable UUID id) {
        Usuarios usuario = usuariosServicios.findById(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    //Obtener usuario para editar en html
    @GetMapping("/detalle/{id}")
    public String verUserDetalle(@PathVariable UUID id, Model model) {
        Usuarios usuario = usuariosServicios.findById(id);
        model.addAttribute("usuario", usuario);
        model.addAttribute("creado_dia", formatLocalDateTime(usuario.getUsuarCreado()));
        return "/views/Usuarios/detalle-usuario";
    }

    //Eliminar un User por ID (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable UUID id) {
        usuariosServicios.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //Creando la interfaz web
    public UsuariosControlador(UsuariosServicios usuariosServicios) {
        this.usuariosServicios = usuariosServicios;
    }

    //Obtener listado de usuarios
    @GetMapping("/listado-usuarios")
    public String listarUsers(Model model) {
        List<Usuarios> usuarios = usuariosServicios.findAll();
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("usuario", new Usuarios());
        return "/views/Usuarios/listado-usuarios";
    }  
}