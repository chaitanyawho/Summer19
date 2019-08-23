import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FixedPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        int c = 0;
        for(int i = 0; i<n ; i++) {
            arr.add(sc.nextInt());
            if(arr.get(i)==i){
                c++;
            }
        }
        outer: for(int i = 0; i<n-1; i++){
            if(arr.get(i)!=i){
                for(int j = i+1; j<n ; j++){
                    if(arr.get(j)!=j){
                        if(arr.get(j)==i&&arr.get(i)==j){
                            c+=2;
                            Collections.swap(arr, i, j);
                            break outer;
                        }
                    }
                }
                for(int j = i+1; j<n ; j++){
                    if(arr.get(j)!=j){
                        if(arr.get(j)==i || arr.get(i) == j){
                            c+=1;
                            Collections.swap(arr,i,j);
                            break outer;
                        }
                    }
                }

            }
        }
        System.out.println(arr+"p="+c);//final list and fixed pts

    }
}
