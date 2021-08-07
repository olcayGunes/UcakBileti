import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance;
        byte age, typeOfTrip;
        double pricePerKilometer = 0.10, childrenDiscountRate = 0.5, teenDiscountRate = 0.1,
                olderDiscountRate = 0.3, roundTripDiscountRate = 0.2, discountAmount, totalPrice;

        System.out.print("Gideceğiniz Mesafeyi Giriniz(km): ");
        distance = input.nextInt();

        System.out.print("Yaş: ");
        age=input.nextByte();

        System.out.print("1. Tek Yön\n2. Gidiş-Dönüş\nYolculuk Tipini Seçiniz: ");
        typeOfTrip = input.nextByte();

        if (distance>0){

        totalPrice = distance*pricePerKilometer;

        if (age>0 && age<12){
            discountAmount= totalPrice*childrenDiscountRate;
            totalPrice=totalPrice-discountAmount;
            switch (typeOfTrip){
                case 1:
                    totalPrice=totalPrice;
                    break;
                case 2:
                    discountAmount=totalPrice*roundTripDiscountRate;
                    totalPrice=(totalPrice-discountAmount)*2;
                    break;
                default:
                    System.out.println("Hatalı Seçim Yaptınız!!!");
            }
        }
        else if (age>=12 && age<=24){
            discountAmount= totalPrice*teenDiscountRate;
            totalPrice=totalPrice-discountAmount;
            switch (typeOfTrip){
                case 1:
                    totalPrice=totalPrice;
                    break;
                case 2:
                    discountAmount=totalPrice*roundTripDiscountRate;
                    totalPrice=(totalPrice-discountAmount)*2;
                    break;
                default:
                    System.out.println("Hatalı Seçim Yaptınız!!!");
            }
        }
        else if (age>65){
            discountAmount= totalPrice*olderDiscountRate;
            totalPrice=totalPrice-discountAmount;
            switch (typeOfTrip){
                case 1:
                    totalPrice=totalPrice;
                    break;
                case 2:
                    discountAmount=totalPrice*roundTripDiscountRate;
                    totalPrice=(totalPrice-discountAmount)*2;
                    break;
                default:
                    System.out.println("Hatalı Seçim Yaptınız!!!");
            }
        }
        else{
            switch (typeOfTrip){
                case 1:
                    totalPrice=totalPrice;
                    break;
                case 2:
                    discountAmount=totalPrice*roundTripDiscountRate;
                    totalPrice=(totalPrice-discountAmount)*2;
                    break;
                default:
                    System.out.println("Hatalı Seçim Yaptınız!!!");
            }
        }
        System.out.println("Toplam Ödemeniz Gereken Tutar: "+totalPrice);
        }
        else{
            System.out.println("Mesafe Verisi Pozitif Bir Değer Olmalıdır!!!");
        }
    }
}