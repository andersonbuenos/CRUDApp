package com.ses.crud.backend.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
public class VehicleDto {

    private Long      id;

    @NotNull
    private String brand;

    @NotNull
    private String model;

    @NotNull
    private String color;

    private int     year;
}
