package lesson6.HW;

public class MainClass {
     public static void main(String[] args) {

         Dog dog = new Dog("Мухтар", 400, 0.5, 10);
         Cat cat = new Cat("Барсик", 100, 2, 0);
         Dog dog1 = new Dog("Шарик", 200, 0.5, 10);

         Animals[] animals = {dog, cat, dog1};

         for (Animals animal : animals) {
             System.out.println(animal);
             animal.Run(300);
             animal.Jump(1.5);
             animal.Sail(5);
         }
     }

}
