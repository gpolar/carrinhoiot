package com.desafio.iot.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "car-action")
public class CarActionEntity {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String action;

    @Getter
    @Setter
    private Boolean used;

    @Getter
    @Setter
    private LocalDateTime registredDate;

}
