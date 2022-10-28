package task5;

import java.util.Scanner;

public class Mail_address {
    public static void main(String[] args) {
        Address clientAddress = new Address();

        Scanner entIndex = new Scanner(System.in);
        clientAddress.index = entIndex.nextInt();

        Scanner entCountry = new Scanner(System.in);
        clientAddress.country = entCountry.nextLine();

        Scanner entCity = new Scanner(System.in);
        clientAddress.city = entCity.nextLine();

        Scanner entStreet = new Scanner(System.in);
        clientAddress.street = entStreet.nextLine();

        Scanner entHouse = new Scanner(System.in);
        clientAddress.house = entHouse.nextInt();

        Scanner entApartment = new Scanner(System.in);
        clientAddress.apartment = entApartment.nextInt();

        System.out.println(clientAddress.index + " " + clientAddress.country + " "
                + clientAddress.city + " "+ clientAddress.street + " "+ clientAddress.house + " " + clientAddress.apartment);
    }
}
