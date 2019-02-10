import java.util.*;

class PrintStarRectangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter width: ");
        int width = input.nextInt();

        System.out.print("Enter height: ");
        int height = input.nextInt();

        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}