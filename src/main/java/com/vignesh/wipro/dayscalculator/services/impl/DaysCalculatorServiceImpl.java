package com.vignesh.wipro.dayscalculator.services.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Service;

import com.vignesh.wipro.dayscalculator.exceptions.DaysCalculatorExceptions;
import com.vignesh.wipro.dayscalculator.services.DaysCalculatorService;

import static com.vignesh.wipro.dayscalculator.constants.DaysCalculatorConstant.*;

@Service
public class DaysCalculatorServiceImpl implements DaysCalculatorService{
	
	@Override
	public long getDaysDifference(String startDate, String endDate) throws DaysCalculatorExceptions {
		try {
			DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate start = LocalDate.parse(startDate, dateformatter);
			LocalDate end = LocalDate.parse(endDate,dateformatter);
			if(start.isAfter(end)) {
				throw new DaysCalculatorExceptions(START_DATE_GREATER_ERROR);
			}
			return start.until(end,ChronoUnit.DAYS);
			
		} catch (DateTimeParseException e) {
			throw new DaysCalculatorExceptions(INVALID_DATE_FORMAT);
		}
	};
}
