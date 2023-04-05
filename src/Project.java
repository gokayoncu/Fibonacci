import  java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        int a,n1=0,n2=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz:");
        a= input.nextInt();

        for (int i=0;i<=a;i++){
            System.out.print(n1+" ");
            int total=n1+n2 ;
            n1=n2;
            n2=total;
        }
    }
}
