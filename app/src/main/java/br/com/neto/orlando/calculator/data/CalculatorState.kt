package br.com.neto.orlando.calculator.data

import br.com.neto.orlando.calculator.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
