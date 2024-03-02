package com.example.demo.service;

import java.util.List;

import com.example.demo.service.to.EstudianteTO;

public interface IEstudianteService {
	public void save(EstudianteTO estudiante);
	
	public EstudianteTO search(Integer id);
	
	public List<EstudianteTO> searchAllTO();
	
}
