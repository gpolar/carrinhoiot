package com.desafio.iot.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.desafio.iot.convert.ParseDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

@Data
public class CarActionDomain implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String action;
    private Boolean used;
    private LocalDateTime registredDate;

}
