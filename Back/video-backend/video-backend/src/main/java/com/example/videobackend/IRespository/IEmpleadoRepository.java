package com.example.videobackend.IRespository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.videobackend.Entity.Empleado;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {

}