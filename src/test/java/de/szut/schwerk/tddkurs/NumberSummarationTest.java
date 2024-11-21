package de.szut.schwerk.tddkurs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class NumberSummarationTest {

	@Test
	public void given3And5WhenSumThen12() {
		NumberSummaration ns = new NumberSummaration();
		assertThat(ns.sum(3, 5)).isEqualTo(12);
	}
}
