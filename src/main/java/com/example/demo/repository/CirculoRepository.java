package com.example.demo.repository;

import com.example.demo.entity.Circulo;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CirculoRepository extends Circulo implements AreaService{

  @Override
  public double calcularArea() {
    return 3.1416*getRadio()*getRadio();
  }
}
