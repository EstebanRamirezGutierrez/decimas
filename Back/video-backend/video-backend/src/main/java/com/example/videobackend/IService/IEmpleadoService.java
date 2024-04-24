package com.example.videobackend.IService;

import java.util.List;
import java.util.Optional;

import com.example.videobackend.Entity.Empleado;

public interface IEmpleadoService {

  List<Empleado> findAll();

  Optional<Empleado> findById(Long id);

  Empleado save(Empleado empleado);

  void update(Empleado empleado, Long id);

  void delete(Long id);
}
