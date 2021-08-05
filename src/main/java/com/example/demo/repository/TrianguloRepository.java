package com.example.demo.repository;

import com.example.demo.entity.Cuadrado;
import com.example.demo.entity.Triangulo;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TrianguloRepository implements AreaService {

  Triangulo triangulo;
  @Override
  public double calcularArea(){
    return triangulo.getBase()*triangulo.getAltura()/2;
  }
}
