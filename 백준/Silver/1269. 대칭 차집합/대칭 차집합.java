import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;




public class Main {

    public static HashSet<Integer> inputSet(Scanner sc ,  int numElements){
       HashSet<Integer> set = new HashSet<>();
       for(int i = 0; i < numElements; i++){
           int element = sc.nextInt();
           set.add(element);
       }
       return set;
    }

    public static int getminusSection(HashSet<Integer> setA, HashSet<Integer> setB){
        int count = 0;
        for( int element : setB){
            if(setA.contains(element)){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int numB = sc.nextInt();



        HashSet<Integer> setA = inputSet(sc, numA);
        HashSet<Integer> setB = inputSet(sc, numB);

        int minusSection = getminusSection(setA, setB);

        int aMinusB_count =  setA.size() - minusSection;
        int bMinusA_count = setB.size() - minusSection;

        int result = aMinusB_count + bMinusA_count;

        System.out.print(result);



    }
}
