package com.perscholas.java_basics;

public class Main {

    public static void main(String[] args) {
        Students obj = new Students() ;// faisal --> object or instance
            obj.setName("Faisal");
            obj.setId(1);
            obj.setAge(32);
        System.out.println(obj.getName() + " is " + obj.getAge() + " years old " );

        Students obj2 = new Students() ;// Ahmed --> object or instance

            obj2.setName("Ahmed ");
            obj2.setId(2);
            obj2.setAge(30);
            System.out.println(obj2.getName() + " is " + obj2.getAge() + " years old " );
        System.out.println("=============> ");
            Cube cube1 = new Cube();
          System.out.println(cube1.getCubeVol());

          Cube cube2 = new Cube();
        System.out.println(cube2.getCubeVol());
    }
}
