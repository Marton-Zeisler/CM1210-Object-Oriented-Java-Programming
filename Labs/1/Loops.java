import java.lang.Math.*;

class Loops{
    public static void main(String[] args) {
        for(int i=1; i<6; i++){
            System.out.println(i);
        }

        for(int i=1; i<16; i++){
            System.out.print(i + ", ");
        }

        System.out.println("\n");

        for(int i=15; i>0; i--){
            System.out.print(i + ", ");
        }

        System.out.println();

        for(int i=5; i<50; i+=5){
            System.out.print(i + ", ");
        }

        System.out.println();

        for(double i=1; i<21; i++){
            System.out.print(Math.sqrt(i) + ", ");
        }

        System.out.println();
    }
}