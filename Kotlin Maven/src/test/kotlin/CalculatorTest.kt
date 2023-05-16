import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CalculatorTest {

    @Test
    fun add() {
        val calc = Calculator()
        assertEquals(10, calc.add(5,5))
    }

    @Test
    fun multiply() {
        val calc = Calculator()
        assertEquals(10, calc.multiply(5,2))
    }

}