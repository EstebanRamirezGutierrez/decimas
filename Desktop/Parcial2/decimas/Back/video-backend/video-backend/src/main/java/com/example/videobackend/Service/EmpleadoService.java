package com.example.videobackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.videobackend.Entity.Empleado;
import com.example.videobackend.IRespository.IEmpleadoRepository;
import com.example.videobackend.IService.IEmpleadoService;

@Service
public class EmpleadoService implements IEmpleadoService {

  @Autowired
  private IEmpleadoRepository repository;

  @Override
  public List<Empleado> findAll() {
    return repository.findAll();
  }

  @Override
  public Optional<Empleado> findById(Long id) {
    return repository.findById(id);
  }

  @Override
  public Empleado save(Empleado empleado) {
    return repository.save(empleado);
  }

  @Override
  public void update(Empleado empleado, Long id) {
    // Obtener el objeto cliente y el id
    // Verificar con el id, si exiten los datos
    Optional<Empleado> ps = repository.findById(id);

    // Cargar nuevo objeto
    if (ps.isEmpty()) {
      Empleado empleadoUpdate = ps.get();
      empleadoUpdate.setFechaContratacion(empleado.getFechaContratacion());

      // Actualizar el objeto cliente
      repository.save(empleadoUpdate);
    } else {
      System.out.println("No existe el empleado");
    }
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }

}
