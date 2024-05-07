package com.example.videobackend.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.videobackend.Entity.Tarea;
import com.example.videobackend.IService.ITareaService;

@RestController
@RequestMapping("api/tarea")
public class TareaController {

  @Autowired
  private ITareaService service;

  @GetMapping()
  public List<Tarea> findAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Tarea> findById(@PathVariable Long id) {
    return service.findById(id);
  }

  @PostMapping()
  public Tarea save(@RequestBody Tarea tarea) {
    return service.save(tarea);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody Tarea tarea, @PathVariable Long id) {
    service.update(tarea, id);
  }

  @DeleteMapping("{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }

}
