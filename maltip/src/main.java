import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        for(int i=1;i<13;i++){
            System.out.println(num + " * " + i + " = " + num * i);

        }


    }
}
