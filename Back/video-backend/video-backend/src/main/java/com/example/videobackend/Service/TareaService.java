package com.example.videobackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.videobackend.Entity.Tarea;
import com.example.videobackend.IRespository.ITareaRepository;
import com.example.videobackend.IService.ITareaService;

@Service
public class TareaService implements ITareaService {

  @Autowired
  private ITareaRepository repository;

  @Override
  public List<Tarea> findAll() {
    return repository.findAll();
  }

  @Override
  public Optional<Tarea> findById(Long id) {
    return repository.findById(id);
  }

  @Override
  public Tarea save(Tarea tarea) {
    return repository.save(tarea);
  }

  @Override
  public void update(Tarea tarea, Long id) {
    // Obtener el objeto cliente y el id
    // Verificar con el id, si exiten los datos
    Optional<Tarea> ps = repository.findById(id);

    // Cargar nuevo objeto
    if (ps.isEmpty()) {
      Tarea tareaUpdate = ps.get();
      tareaUpdate.setDescripcion(tarea.getDescripcion());
      tareaUpdate.setFechaVencimiento(tarea.getFechaVencimiento());
      // Actualizar el objeto cliente
      repository.save(tareaUpdate);
    } else {
      System.out.println("No existe el empleado");
    }
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }

}
