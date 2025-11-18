package co.com.renacer.commons.base_types;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class Aggregate {
    @NotNull
    protected LocalDateTime creationDate;
    @NotNull
    protected LocalDateTime lastUpdateDate;
}
