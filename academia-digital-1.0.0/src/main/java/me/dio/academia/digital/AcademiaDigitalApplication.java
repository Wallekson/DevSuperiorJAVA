package me.dio.academia.digital;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Boolean.TRUE;

public class Teste{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo = false;


//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.

        if (A == B) {
            if (B ==C) {
                triangulo = TRUE;

            }
        }
        if(triangulo){
            soma = A + B + C;
            System.out.println("Perimetro = " + soma%1f);
        }

        else {
        maior = ((A + B) * C) / 2;
        System.out.println("Area = " + maior%1f);

        }





    }

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class AcademiaDigitalApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(AcademiaDigitalApplication.class, args);
//	}
//
//}