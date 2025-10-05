package org.example.task2;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 1; // значення за замовчуванням
            System.out.println("Некоректна довжина! Встановлено 1.");
        }
    }

    private void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
            System.out.println("Некоректна ширина! Встановлено 1.");
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
            System.out.println("Некоректна висота! Встановлено 1.");
        }
    }

    // Повна площа поверхні
    public double getSurfaceArea() {
        return 2 * (length * width + width * height + length * height);
    }

    // Площа бічної поверхні
    public double getLateralSurfaceArea() {
        return 2 * height * (length + width);
    }

    // Об’єм
    public double getVolume() {
        return length * width * height;
    }
}
