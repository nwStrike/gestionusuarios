package com.test.gestionusuarios.controllers;

import com.test.gestionusuarios.dao.UsuarioDao;
import com.test.gestionusuarios.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuario(){
        return usuarioDao.getUsuario();
    }

    /*@RequestMapping(value = "usuario2")
    public Usuario editUsuario(){
        Usuario usuario=new Usuario();
        usuario.setNombre("paco");
        usuario.setApellido("manolo");
        usuario.setEmail("pacomanoloescopeta@test.com");
        usuario.setTelefono("84794645");
        return usuario;
    }*/

    @RequestMapping(value = "usuario3")
    public Usuario deleteUsuario(){
        Usuario usuario=new Usuario();
        usuario.setNombre("paco");
        usuario.setApellido("manolo");
        usuario.setEmail("pacomanoloescopeta@test.com");
        usuario.setTelefono("84794645");
        return usuario;
    }

    @RequestMapping(value = "usuario4")
    public Usuario buscar(){
        Usuario usuario=new Usuario();
        usuario.setNombre("paco");
        usuario.setApellido("manolo");
        usuario.setEmail("pacomanoloescopeta@test.com");
        usuario.setTelefono("84794645");
        return usuario;
    }
}

