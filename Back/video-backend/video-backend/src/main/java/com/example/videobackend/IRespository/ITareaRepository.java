package com.example.videobackend.IRespository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.videobackend.Entity.Tarea;

@Repository
public interface ITareaRepository extends JpaRepository<Tarea, Long> {
}