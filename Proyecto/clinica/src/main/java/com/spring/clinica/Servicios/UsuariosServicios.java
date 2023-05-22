package com.spring.clinica.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.clinica.Modelo.Usuarios;
import com.spring.clinica.Repositorios.UsuariosRepositorio;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsuariosServicios {

    @Autowired
    private UsuariosRepositorio usuarioRepositorio;
    
    // Encontrar todos los usuarios
    public List<Usuarios> findAll() {
        return usuarioRepositorio.findAll();
    }

    // Encontrar un usuario por ID
    public Usuarios findByusuarCodigoIdentificacion(UUID id) {
        Optional<Usuarios> usuario = usuarioRepositorio.findByusuarCodigoIdentificacion(id);
        if (usuario.isPresent()) {
            return usuario.get();
        } else {
            throw new RuntimeException("Usuario no encontrado con el ID: " + id);
        }
    }

    // Encontrar un usuario por nombre
    public List<Usuarios> findByName(String usuarNombre) {
        return usuarioRepositorio.findByUsuarNombre(usuarNombre);
    }

    // Guardar un usuario
    public Usuarios save(Usuarios usuario) {
        return usuarioRepositorio.save(usuario);
    }

    // Actualizar un usuario existente
    public Usuarios update(UUID uuid, Usuarios usuarDetalles) {
        Usuarios usuario = findByusuarCodigoIdentificacion(uuid);
        
        usuario.setUsuarNumSS(usuarDetalles.getUsuarNumSS());
        usuario.setUsuarDni(usuarDetalles.getUsuarDni());
        usuario.setUsuarNombre(usuarDetalles.getUsuarNombre());
        usuario.setUsuarApellidos(usuarDetalles.getUsuarApellidos());
        usuario.setUsuarGenero(usuarDetalles.getUsuarGenero());
        usuario.setUsuarFechaNacimiento(usuarDetalles.getUsuarFechaNacimiento());
        usuario.setUsuarDomicilio(usuarDetalles.getUsuarDomicilio());
        usuario.setUsuarPoblacion(usuarDetalles.getUsuarPoblacion());
        usuario.setUsuarProvincia(usuarDetalles.getUsuarProvincia());
        usuario.setUsuarPais(usuarDetalles.getUsuarPais());
        usuario.setUsuarCodigoPostal(usuarDetalles.getUsuarCodigoPostal());
        usuario.setUsuarTelefono(usuarDetalles.getUsuarTelefono());
        usuario.setUsuarEmail(usuarDetalles.getUsuarEmail());
        usuario.setUsuarConsentimientoDatos(usuarDetalles.isUsuarConsentimientoDatos());

        return usuarioRepositorio.save(usuario);
    }

    // Eliminar usuario por ID
    public void deleteById(UUID id) {
        Usuarios existeUsuario = findByusuarCodigoIdentificacion(id);
        usuarioRepositorio.delete(existeUsuario);
    }
}