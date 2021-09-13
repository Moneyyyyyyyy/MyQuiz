package com.test.zp.designpatterns;


/**
 * 工厂模式
 */
public class FactoryPattern {

    public static void main(String[] args) {
        Animal dog = new DogFactory().creatAnimal();
        Animal cat = new CatFactory().creatAnimal();
        dog.eat();
        dog.sleep();
        cat.sleep();
        cat.eat();
    }


    public abstract static class Animal {
        abstract void eat();
        abstract void sleep();
    }

    public static class Cat extends Animal{

        @Override
        void eat() {
            System.out.println("cat eat fish");
        }

        @Override
        void sleep() {
            System.out.println("cat sleep");
        }
    }

    public static class Dog extends Animal{

        @Override
        void eat() {
            System.out.println("dog eat meat");
        }

        @Override
        void sleep() {
            System.out.println("dog sleep");
        }
    }

    interface Factory{
        Animal creatAnimal();
    }

    public static class DogFactory implements Factory{

        @Override
        public Animal creatAnimal() {
            return new Dog();
        }
    }

    public static class CatFactory implements Factory{

        @Override
        public Animal creatAnimal() {
            return new Cat();
        }
    }

}
