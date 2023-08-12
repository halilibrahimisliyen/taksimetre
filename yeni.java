import java.util.Scanner;

public class yeni{

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        double acilisUcreti=10, minimumTutar, tutar,gidilenYol;

        System.out.println("Alınan mesafeyi giriniz: ");
        gidilenYol=input.nextDouble();

        tutar=acilisUcreti+gidilenYol*2.2;

        boolean durum1 = (tutar>20);
        String nihaiTutar=durum1? "Ödenecek Ücret "+tutar : "Ödenecek Ücret: 20 ";
        System.out.println(nihaiTutar);

        








    }


}