package com.example.demo.entity;

import com.example.demo.service.AreaService;

public class Triangulo   implements AreaService {
  private double base;
  private double altura;

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
  public double calcularArea(){
    return base*altura/2;
  }
}
