import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public  static void main(String [] arge){

        Scanner s=new Scanner(System.in);

        int size=s.nextInt();
        List<Integer> array=new ArrayList<>();

        for(int i=0;i<size;i++){
            int num=s.nextInt();
            array.add(num);
        }

        for(int i=0;i<size;i++){

            int num=array.get(i);
           long fac=1;
            for(int j=1;j<=num;j++){
                fac = fac * j;
            }

            System.out.println(fac);

        }




    }

}
