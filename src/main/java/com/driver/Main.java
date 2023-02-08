package com.driver;

public class Main {

    public static class Product{
        int x;
        int y;
        int z;
        public int product(int x,int y){
            this.x = x;
            this.y = y;

            return x;
        }
        public int product(int x,int y,int z){
            this.x = x;
            this.y = y;
            this.z = z;

            return z;
        }
        public double product(double x,double y){
            this.x = (int)x;
            this.y = (int)y;

            return y;
        }
    }

    public static void main(String[] args) {

        Product p = new Product();

        p.product(10,9);
        p.product(3,4,5);
        p.product(8.8,9.9);

    }

}