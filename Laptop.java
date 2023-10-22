import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Laptop {
    String model;
    String color;
    int ram;
    int diskcapacity;
    String CPU;

    public static void main(String[] args) {
        System.out.println(List());
    }


    public Laptop(String model, String color, int ram, int diskcapacity, String CPU) {
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.diskcapacity = diskcapacity;
        this.CPU = CPU;
    }

    public String toString() {
        return "model = " +
                model + " colour = " +
                color + " ram = " +
                ram + " disk capacity = " + diskcapacity;
    }

    public boolean equals(Object laptop) {
        return this.model.equals(model)
                &&
                this.color.equals(color)
                &&
                this.ram == ram && this.diskcapacity == diskcapacity;
    }

    public int hashCode() {
        return (int) (this.model.hashCode() + this.color.hashCode() + this.ram + this.diskcapacity);
    }

    public static Set<Laptop> List() {
        Laptop laptop1 = new Laptop("Apple MacBook Air 13", "Black", 8, 256,"Apple M1");
        Laptop laptop2 = new Laptop("Thunderobot 911 X Wild Hunter G2", "White", 8, 512, "Intel Core i5 12450H 2");
        Laptop laptop3 = new Laptop("HONOR MagicBook X 14", "Black", 16, 256, "Intel Core i3 1115G4 ");

        Set<Laptop> base = new HashSet<>(List.of(laptop1, laptop2, laptop3));
        return base;
    }




}