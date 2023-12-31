package com.app.web.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Categoria;
import com.app.web.repositorio.CategoriaRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServicio {

	@Autowired
    private CategoriaRepositorio repositorio;

    

    public List<Categoria> listarTodasLasCategorias() {
        return repositorio.findByVisibilidadTrue();
        
        
    }
    
    public Categoria guardarCategoria(Categoria categoria) {
    	
    	return repositorio.save(categoria);
    	
    }
    

    public Categoria obtenerCategoriaPorId(int id) {
    	return repositorio.findById(id).get();
		
	}


    public Categoria crearCategoria(Categoria categoria) {
        return repositorio.save(categoria);
    }

    public Categoria actualizarCategoria(Categoria categoria) {
    	System.out.println("OlaKAse3");
        return repositorio.save(categoria);
    }

    public void ocultarCategoria(int id) {
    	repositorio.softDelete(id);
    }
    
    public int obtenerMaximoId() {
    	
    	return repositorio.obtenerMaximoId();
    	
    }
    
    
    
}

