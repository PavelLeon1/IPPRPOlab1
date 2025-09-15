package com.rental;

import java.time.LocalDate;

public class Contract {
    private int id;
    private Apartment apartment;
    private Renter renter;
    private LocalDate startDate;
    private int termInMonths; // cрок месяцах

    public Contract(int id, Apartment apartment, Renter renter, LocalDate startDate, int termInMonths) {
        this.id = id;
        this.apartment = apartment;
        this.renter = renter;
        this.startDate = startDate;
        this.termInMonths = termInMonths;
    }

    public Renter getRenter() {
        return renter;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    @Override
    public String toString() {
        return "Договор [ID=" + id + ", Срок=" + termInMonths + " мес., " + renter + ", " + apartment + "]";
    }
}