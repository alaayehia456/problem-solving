import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String [] args){

        Scanner s=new Scanner(System.in);

        int array=s.nextInt();
        int subArray=s.nextInt();
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();

        for(int i=0;i<array;i++){

            int num=s.nextInt();
            list.add(num);

        }
        for(int i=0;i<subArray;i++){

            int num=s.nextInt();
            list1.add(num);

        }

        int index=-1;
       for(int i=0;i<subArray;i++){

            int num=list1.get(i);
            int num2=list.indexOf(num);
            if(index<num2){
                index=num2;
            }else {
                System.out.println(("NO"));
                break;
            }

        if(i == subArray-1){
            System.out.print("YES");
        }



       }






    }

}
