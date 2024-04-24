package com.example.videobackend.IService;

import java.util.List;
import java.util.Optional;

import com.example.videobackend.Entity.Tarea;

public interface ITareaService {

  List<Tarea> findAll();

  Optional<Tarea> findById(Long id);

  Tarea save(Tarea tarea);

  void update(Tarea tarea, Long id);

  void delete(Long id);

}
