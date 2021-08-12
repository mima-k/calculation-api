package jp.co.netprotections.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import jp.co.netprotections.dto.ValueListRequestDto;
import jp.co.netprotections.dto.ValueListResponseDto;
import jp.co.netprotections.service.CalculationService;

@RestController
public class CalculationController {
	@Autowired
	private CalculationService calculationService;
	
	@RequestMapping(value = "/main", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ValueListResponseDto json(
			 ValueListRequestDto request) {
		System.out.println(calculationService.createResponse(request));
		return calculationService.createResponse(request);
	}
}
