package com.example.domain

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

internal class CalculatorTest2 {

    @CsvSource(
        delimiter = '=',
        value = [
            "1 + 2=3",
            "2 + 3=5",
        ]
    )
    //@Test
    //@DisplayName("{0}이면 {1}이다.")
    @ParameterizedTest(name = "{0}이면 {1}이다.")
    fun evaluate(expression: String, expected: Int) {
        println("expression : $expression, expected : $expected")
    }

    @ValueSource(strings = ["+", "-", "*", "/"])
    @ParameterizedTest(name = "{0}을 {0}보여준다.")
    fun test(rawOperator: String) {
        println(rawOperator)
    }
}