import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {

        int[] arr = {15,12,788,1,-1,-778,2,0};

        int[] arrMin= new int[arr.length];     //Algoritmik olarak dusundugumuzde verdigimiz sayıdan dusuk olanları bir Array yaparız.
        int[] arrMax= new int[arr.length];     //Buyuk olan sayıları da baska bir Array.

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        int inp=input.nextInt();


        int a=0,b=0;


        for (int i=0;i< arr.length;i++){
            if (arr[i]>=inp){

                arrMax[a]=arr[i];           //Verilen sayidan buyuk olanlar icin olusturma sekli. a 0 dab baslayan index numarasi.
                a++;

            }
            if (arr[i]<=inp){

                arrMin[b]=arr[i];
                b++;
            }
        }
        int min=arrMax[0];
        int max=arrMin[0];


        for (int i:arrMax){
            if (i<min && i>inp){        // İsin en can alici noktasi eger verdigimiz sayidan buyuk olanlari bir Array yaptiysak ki yaptik.
                min=i;                  //En buyuklerin oldugu Array icerisinde ki en kucuk sayi bizim verdiğimiz sayiya buyuk en yakin sayi olur.
            }
        }

        for (int i:arrMin){
            if (i>max && i<inp){       //Ayni dusunme sekli ile dusunursen en kucuklerin arasından sectigimiz en buyuk sayi da kucuk en yakin sayi olur.
                max=i;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi:"+max);
        System.out.println("Girilen sayidan buyuk en yakin sayi:"+min);

    }
}
