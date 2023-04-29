package org.example;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
      public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);


        String AN1,AN2,AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();


                if (Objects.equals(AN1, "vertebrado")) {
                    if (Objects.equals(AN2, "ave")) {
                        if (Objects.equals(AN3, "carnivoro")) {
                            System.out.println("aguia");
                        } else {
                            System.out.println("pomba");
                        }
                    }
                }
          if (Objects.equals(AN1, "vertebrado")) {
              if (Objects.equals(AN2, "mamifero")) {
                  if (Objects.equals(AN3, "onivoro")) {
                      System.out.println("homem");
                  } else {
                      System.out.println("vaca");
                  }
              }
          }

          if (Objects.equals(AN1, "invertebrado")) {
              if (Objects.equals(AN2, "inseto")) {
                  if (Objects.equals(AN3, "hematofago")) {
                      System.out.println("pulga");
                  } else {
                      System.out.println("lagarta");
                  }
              }
          }
          if (Objects.equals(AN1, "invertebrado")) {
              if (Objects.equals(AN2, "anelideo")) {
                  if (Objects.equals(AN3, "hematofago")) {
                      System.out.println("sanguessuga");
                  } else {
                      System.out.println("minhoca");
                  }
              }
          }


    }
}