package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {
	
	public Estudiante seleccionar(Integer id);
	public void insertar(Estudiante estudiante);

	public List<Estudiante> seleccionarTodos();
}
