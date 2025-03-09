package com.belajartestng;

public class Calculator {
    // Penjumlahan
    public static int add(int a, int b) {
        return a + b;
    }

    // Pengurangan
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Perkalian
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Pembagian
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    // Modulus
    public static int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a % b;
    }

    // Menghitung BMI
    public static double bodyMassIndex(double weight, double height) {
        if (height == 0) {
            throw new ArithmeticException("Height cannot be zero");
        }
        return (weight / (height * height)) * 10000; // Untuk tinggi dalam cm
    }

    // Menentukan status BMI
    public static String bodyMassIndexStatus(double bmi) {
        if (bmi >= 40) {
            return "Obese";
        } else if (bmi >= 25.0) {
            return "Overweight";
        } else if (bmi >= 18.5) {
            return "Normal";
        } else {
            return "Underweight";
        }
    }
}

