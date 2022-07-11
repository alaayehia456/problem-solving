import java.util.*;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);

    int size=scanner.nextInt();

    List<Integer> integers=new ArrayList<>();
    for(int i=0;i<size;i++){

        int newNum=scanner.nextInt();
        integers.add(newNum);
    }
        Collections.sort(integers);
    System.out.println(integers.get(size-1));


    }



}
