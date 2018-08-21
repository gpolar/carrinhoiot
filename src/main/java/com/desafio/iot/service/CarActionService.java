package com.desafio.iot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.desafio.iot.domain.CarActionDomain;
import com.desafio.iot.entity.CarActionEntity;
import com.desafio.iot.exception.http.UnprocessableEntity;
import com.desafio.iot.repository.SocioTorcedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarActionService implements CarActionService {

    private final SocioTorcedorRepository repository;

    @Autowired
    CarActionService(SocioTorcedorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CarActionDomain> create(CarActionDomain carActionDomain) {


        if (Objects.isNull(carActionDomain)) {
            CarActionEntity carActionEntity = new CarActionEntity();
            carActionEntity.(socioTorcedor.getEmail());
            socio.setDataNascimento(socioTorcedor.getDataNascimento());
            socio.setNomeCompleto(socioTorcedor.getNomeCompleto());
            socio.setTime(socioTorcedor.getTime());
            repository.save(socio);
            return new ArrayList<CampanhaDomain>();
        }

        throw new UnprocessableEntity("Socio já registrado");

    }

    @Override
    public List<CarActionDomain> listar() {
        return repository.findAll().stream().map(x -> new CarActionDomain(x.getId(), x.getNomeCompleto(), x.getEmail(), x.getDataNascimento(), x.getTime())).collect(Collectors.toList());
    }


}
