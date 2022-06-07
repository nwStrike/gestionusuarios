package com.test.gestionusuarios.dao;

import com.test.gestionusuarios.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional

public class UsuarioDaoimp implements UsuarioDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuario() {
        String query = "FROM Usuario ";
        return entityManager.createQuery(query).getResultList();

    }
}
