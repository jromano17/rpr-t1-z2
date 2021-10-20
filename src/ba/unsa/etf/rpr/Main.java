package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    static int sumaCifara(int x){
        int sumac = 0;
        while(x != 0){
            sumac = sumac + x % 10;
            x = x / 10;
        }
        return sumac;
    }
    public static void main(String[] args) {
        System.out.println("Unesite n:");
        Scanner ulaz=new Scanner(System.in);
        int n = ulaz.nextInt();
        int i;
        for(i=1;i<=n;i++){
            if(i % sumaCifara( i ) == 0) System.out.println( i );
        }
    }
}
