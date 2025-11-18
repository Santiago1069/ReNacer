package co.com.renacer.commons.base_types;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class Url {

    private final String value;

    public Url(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("La URL no puede estar vacía");
        }

        try {
            URL url = new URL(value);
            this.value = url.toString();
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("URL inválida: " + value);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Url url = (Url) o;
        return Objects.equals(value, url.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
