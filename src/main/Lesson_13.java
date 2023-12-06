package main;

import java.util.Scanner;

public class Lesson_13 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n= scanner.nextInt();
            int [] myArray = new int[n];
            for(int i=0;i<n;i++){
                myArray[i]= scanner.nextInt();
            }
            //sual 1 massivdeki sade ededlerin sayi
//        int k=0,a=0;
//        for(int i=0;i<n;i++){
//            for(int j=1;j<=myArray[i];j++){
//                if(myArray[i]%j==0){
//                    k++;
//                }
//            }
//
//            if(k==2){
//                a++;
//            }
//            k=0;
//        }
//        System.out.println(a);

            //sual 2 7e qaliqsiz bolunen ededlerin sayi
//        int k=0;
//        for(int i=0;i<n;i++){
//            if(myArray[i]%7==0){
//                k++;
//            }
//        }
//        System.out.println(k);

            //sual 3 massivin en kicik cut ve en boyuk tek ededlerini tap
//        int min=0;
//        int max=0;
//        for(int i=0;i<n;i++){
//            if(myArray[i]%2==0){
//                min=myArray[i];
//                break;
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(myArray[i]%2!=0){
//                max=myArray[i];
//                break;
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(myArray[i]%2==0){
//                if(myArray[i]<min){
//                    min=myArray[i];
//                }
//
//            }
//            else if(myArray[i]%2!=0){
//                if(max<myArray[i]){
//                    max = myArray[i];
//                }
//            }
//        }
//        System.out.println("en kicik cut eded : "+min);
//        System.out.println("en boyuk tek eded : "+max);

            //sual 4 tek indexde durmus elementleri 0la evez et
//        for(int i=0;i<n;i++){
//            if(i%2!=0){
//                myArray[i]=0;
//            }
//        }
//        for(int i=0;i<n;i++){
//            System.out.println("index : "+i+" deyer : "+ myArray[i]+" ");
//        }

            //sual 5
//       int[] myArray1= new int[n];
//        int k=0,a=1;
//        myArray1[0]=myArray[0];
//        for(int i=1;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(myArray[i]==myArray1[j]){
//                    k++;
//                }
//            }
//            if(k==0){
//                myArray1[a]=myArray[i];
//                a++;
//
//            }
//            k=0;
//
//        }
//        for(int i=0;i<n;i++){
//            System.out.println(myArray1[i]+ " ");
//        }
//        for(int i=0;i<n;i++){
//            System.out.println(myArray1+" ");
//        }
            //sual 6 positive case neqative case`
//        int k=myArray[0];
//        int a=1;
//        for(int i=0;i<n;i++){
//            if(k<myArray[i]){
//                k=myArray[i];
//                a++;
//            }
//        }
//        if(a==n){
//            System.out.println("positive case");
//        }
//        else{
//            System.out.println("negative case");
//        }


            //sual 7 palindrom
//        int a=0;
//        int k=0;
//        for(int i=0;i<n;i++){
//            if(myArray[i]==myArray[n-(i+1)]){
//                a++;
//            }
//            else{
//                break;
//            }
//        }
//        if(n%2==0){
//            k=n/2;
//        }
//        else if(n%2!=0){
//            k=n/2;
//            k=k+1;
//        }
//        if(a==k){
//            System.out.println("polindromdur");
//        }
//        else{
//            System.out.println("sehvdir");
//        }

            // sual 8
//        int[] myArray2 = new int [n];
//        for(int i=0;i<n;i++){
//            myArray2[i]= scanner.nextInt();
//        }
//        int k=0;
//        for(int i=0;i<n;i++){
//            if(myArray[i]==myArray2[i]){
//                k++;
//
//            }
//        }
//        if(k==n){
//            System.out.println("ust uste dusur");
//        }
//        else{
//            System.out.println("ust uste dusmur");
//        }





        }
    }

