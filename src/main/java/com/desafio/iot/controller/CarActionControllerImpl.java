package com.desafio.iot.controller;

import java.util.List;

import com.desafio.iot.domain.CarActionDomain;
import com.desafio.iot.service.CarActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/action-car")
@Api(basePath = "/action-car", value = "Ação Car", description = "Crud de Action car", produces = "application/json")
public class CarActionControllerImpl {

	
	private final CarActionService carActionService;
		
	@Autowired
	CarActionControllerImpl(CarActionService carActionService) {
		this.carActionService = carActionService;
	}

	@PostMapping
	@ApiOperation(value = "Adicionar Ação no carrinho", notes = "Adicionar Ação")
    @ApiResponses(value = {
    		@ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 201, message = "Ação Cadastrada") })
	public void adicionar(@RequestBody CarActionDomain carActionDomain){
		carActionService.create(carActionDomain);
	}

	@GetMapping
	@ApiOperation(value = "Lista Ações não Executadas", notes = "Lista Ações não esxecutadas")
    @ApiResponses(value = {
    		@ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 201, message = "Lista Ações não executadas") })
	public List<CarActionDomain> listar(){
		return carActionService.listar();
	}

}
