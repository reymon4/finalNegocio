package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.to.EstudianteTO;

@Service

public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	public void save(EstudianteTO estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(this.convertTO(estudiante));
	}

	@Override
	public EstudianteTO search(Integer id) {
		// TODO Auto-generated method stub
		return this.convert(this.estudianteRepository.seleccionar(id));
	}

	@Override
	public List<EstudianteTO> searchAllTO() {
		// TODO Auto-generated method stub
		List<Estudiante> list = this.estudianteRepository.seleccionarTodos();
		List<EstudianteTO> listTO = new ArrayList<>();
		for (Estudiante est : list) {
			listTO.add(this.convert(est));
		}
		return listTO;
	}

	public Estudiante convertTO(EstudianteTO estudianteTO) {
		Estudiante estu = new Estudiante();
		estu.setApellido(estudianteTO.getApellido());
		estu.setCedula(estudianteTO.getCedula());
		estu.setNombre(estudianteTO.getNombre());
		return estu;

	}
	
	public EstudianteTO convert(Estudiante estudiante) {
		EstudianteTO estu = new EstudianteTO();
		estu.setApellido(estudiante.getApellido());
		estu.setCedula(estudiante.getCedula());
		estu.setNombre(estudiante.getNombre());
		return estu;

	}
	

}
