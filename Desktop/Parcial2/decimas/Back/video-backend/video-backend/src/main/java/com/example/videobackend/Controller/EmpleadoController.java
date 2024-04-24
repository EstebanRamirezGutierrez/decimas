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

import com.example.videobackend.Entity.Empleado;
import com.example.videobackend.IService.IEmpleadoService;

@RestController
@RequestMapping("api/empleado")
public class EmpleadoController {

  @Autowired
  private IEmpleadoService service;

  @GetMapping()
  public List<Empleado> findAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Empleado> findById(@PathVariable Long id) {
    return service.findById(id);
  }

  @PostMapping()
  public Empleado save(@RequestBody Empleado empleado) {
    return service.save(empleado);
  }

  @PutMapping("/{id}")
  public void update(@RequestBody Empleado empleado, @PathVariable Long id) {
    service.update(empleado, id);
  }

  @DeleteMapping("{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }

}
