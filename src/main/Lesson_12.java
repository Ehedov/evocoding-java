package main;

import java.util.Scanner;

public class Lesson_12 {
    // task 1
   /* public static void main(String[] args) {
        int n=0;
        for(int i=2;i<=100;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    n++;
                }
            }
            if(n==1){
                System.out.println(i);
            }
            n=0;
        }
    }
}*/
    //task 2;
    /*public static void main(String[] args) {
        int a=0,b=1,sonraki=0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.println(a);
                continue;
            }
            if(i==2){
                System.out.println(b);
                continue;
            }
            sonraki=a+b;
            a=b;
            b=sonraki;
            System.out.println(sonraki);

        }
    }*/
    //task 3
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=1;i<=10;i++){
            int k=n*i;
            System.out.println(n+" * "+ i+" = "+k);
        }
    }*/

  //task 4
   /* public static void main(String[] args) {
        int cut=0,tek=0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
                cut+=i;
            }
            else if(i%2!=0){
                tek+=i;
            }
        }
        System.out.println("tek : "+ tek+ " ve cut : "+cut);
    }*/

    //task 5
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=7;
        for(int i=0;i<10;){
            int n= scanner.nextInt();
            if(n>a){
                System.out.println("secilmis reqemden boyukdur");
            }
            else if(n<a){
                System.out.println("secilmis reqemden kicikdir");
            }
            else{
                System.out.println("secilmis reqemi tapdiniz");
                break;
            }

        }
    }*/

}
