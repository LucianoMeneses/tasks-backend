package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DataUtilsTest {
	
	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		LocalDate data = LocalDate.of(2030, 10, 16);
	   Assert.assertTrue(DateUtils.isEqualOrFutureDate(data));	
	}
	
	@Test
	public void deveRetornarFalseParaDatasPassadas() {
		LocalDate data = LocalDate.of(2010, 10, 16);
	   Assert.assertFalse(DateUtils.isEqualOrFutureDate(data));	
	}
	
	@Test
	public void deveRetornarTrueParaDataAtual() {
		LocalDate data = LocalDate.now();
	   Assert.assertTrue(DateUtils.isEqualOrFutureDate(data));	
	}

}
