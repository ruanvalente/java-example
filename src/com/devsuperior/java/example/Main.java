package com.devsuperior.java.example;

import com.devsuperior.java.example.entitys.Triangle;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(4.0, 2.0, 3.0);

        System.out.println(triangle.toString());
    }
}
