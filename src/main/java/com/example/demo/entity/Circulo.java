package com.example.demo.entity;

import com.example.demo.service.AreaService;

public class Circulo   implements AreaService {
  private  double radio;

  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  public double calcularArea(){
    return 3.1416*getRadio()*getRadio();
  }
}
