package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }

        if (!isBarking) {
            return false;
        }

        if (clock < 8 || clock >= 20) {
            return true;
        }

        return false;

    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if( 13 < firstAge && firstAge <= 19 || 13 < secondAge  && secondAge <= 19 || 13 < thirdAge && thirdAge <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        if(!isSummer){
            if(25 < temp && temp <= 35){
                return true;
            }
        }else{
            if(25 < temp && temp < 45){
                return true;
            }
        }
        return false;
    }

    public static double area(double width, double height) {
        if( width < 0 || height < 0){
            return -1;
        }
        double area = width * height;
        return area;

    }

    public static double area(double radius) {
        if ( radius < 0){
            return -1;
        }
        double area = radius * radius * Math.PI;
        return area;
    }
}
