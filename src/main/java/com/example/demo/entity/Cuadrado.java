package com.example.demo.entity;

import com.example.demo.service.AreaService;

public class Cuadrado  implements  AreaService {
  private  double lado;

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }
  @Override
  public double calcularArea() {
    return getLado()*getLado();
  }

}
