package co.com.renacer.commons.base_types;

import java.util.Objects;

public class Phone {
    private final String countryCode;
    private final String number;

    public Phone(String countryCode, String number) {
        if (!countryCode.matches("^\\+?\\d+$"))
            throw new IllegalArgumentException("Código de país inválido");

        if (!number.matches("^\\d{6,15}$"))
            throw new IllegalArgumentException("Número inválido");

        this.countryCode = countryCode.startsWith("+")
                ? countryCode
                : "+" + countryCode;
        this.number = number;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getNumber() {
        return number;
    }

    public String getValue() {
        return countryCode + number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(countryCode, phone.countryCode) && Objects.equals(number, phone.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, number);
    }
}