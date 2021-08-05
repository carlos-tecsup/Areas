package com.example.demo;
import com.example.demo.entity.Circulo;
import com.example.demo.entity.Cuadrado;
import com.example.demo.entity.Triangulo;
import com.example.demo.repository.CirculoRepository;
import com.example.demo.repository.CuadradoRepository;
import com.example.demo.repository.TrianguloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;

import java.util.Scanner;
public class ClaseMain implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ClaseMain.class, args);
  }
  CuadradoRepository cuadradoRepository;

  public void run(String... args) throws Exception {


    Scanner entrada = new Scanner(System.in);

    System.out.print("Bienvenido al calculador de areas\n");
    System.out.println("---------------------------------------------");

    System.out.print("Ingrese tamaño del lado del cuadrado: ");
    double tamaño_cuadrado = entrada.nextDouble();
    Cuadrado cuadrado1 = new Cuadrado();
    cuadrado1.setLado(tamaño_cuadrado);

    System.out.println("El area del cuadrado es:\n"+cuadrado1.calcularArea());

    System.out.println("---------------------------------------------");

    System.out.println("Área de un circulo");

    System.out.print("Ingrese radio del circulo: ");
    double radio = entrada.nextDouble();
    Circulo circulo = new Circulo();
    circulo.setRadio(radio);
    System.out.println("El area del circulo es:\n"+ circulo.calcularArea());

    System.out.println("---------------------------------------------");

    System.out.println("Área de un triangulo");

    System.out.print("Ingrese base del triangulo: ");
    double base  = entrada.nextDouble();

    System.out.print("Ingrese altura del triangulo: ");
    double altura = entrada.nextDouble();

    Triangulo triangulo = new Triangulo();
    triangulo.setAltura(altura);
    triangulo.setBase(base);
    System.out.println("El area del triangulo es:\n"+triangulo.calcularArea());


  }

}
