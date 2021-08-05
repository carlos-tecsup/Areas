package com.example.demo.repository;

import com.example.demo.entity.Cuadrado;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class  CuadradoRepository  implements AreaService {

  Cuadrado cuadrado;


  @Override
  public double calcularArea() {
    return cuadrado.getLado()*cuadrado.getLado();
  }
}
