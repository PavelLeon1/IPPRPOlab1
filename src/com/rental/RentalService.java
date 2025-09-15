package com.rental;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalService {
    private List<Apartment> apartments = new ArrayList<>();
    private List<Contract> contracts = new ArrayList<>();

    public void addApartment(Apartment apartment) {
        this.apartments.add(apartment);
    }

    public void addContract(Contract contract) {
        this.contracts.add(contract);
    }

    // Операция 1: поиск квартир по цене (дешевле или равно указанной)
    public List<Apartment> findApartmentsByPrice(double maxPrice) {
        return apartments.stream()
                .filter(apt -> apt.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    // Операция 2: фильтрация арендаторов по сроку договора (дольше или равно указанному)
    public List<Renter> filterRentersByContractTerm(int minTermInMonths) {
        return contracts.stream()
                .filter(c -> c.getTermInMonths() >= minTermInMonths)
                .map(Contract::getRenter)
                .distinct()
                .collect(Collectors.toList());
    }
}