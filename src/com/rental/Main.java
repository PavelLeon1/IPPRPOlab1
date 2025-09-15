package com.rental;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apartment apt1 = new Apartment(1, "ул. Ленина, 10", 30000);
        Apartment apt2 = new Apartment(2, "пр. Мира, 5", 45000);
        Apartment apt3 = new Apartment(3, "ул. Садовая, 1", 25000);

        Renter renter1 = new Renter(101, "Иван Иванов");
        Renter renter2 = new Renter(102, "Петр Петров");

        Contract c1 = new Contract(1, apt1, renter1, LocalDate.now(), 12);
        Contract c2 = new Contract(2, apt2, renter2, LocalDate.now(), 6);  

        // добавляем данные
        RentalService service = new RentalService();
        service.addApartment(apt1);
        service.addApartment(apt2);
        service.addApartment(apt3);
        service.addContract(c1);
        service.addContract(c2);

        // дешевле 35000
        System.out.println("Квартиры меньше 35000:");
        List<Apartment> foundApartments = service.findApartmentsByPrice(35000);
        foundApartments.forEach(System.out::println);

        System.out.println("\n");

        // дольше 10 месяцев
        System.out.println("Арендаторы с договором на 10+ месяцев:");
        List<Renter> filteredRenters = service.filterRentersByContractTerm(10);
        filteredRenters.forEach(System.out::println);
    }
}