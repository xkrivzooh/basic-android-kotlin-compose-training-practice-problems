package ren.wenchao.tipcalculator


import org.junit.Assert.*
import org.junit.Test
import java.text.NumberFormat

class MainActivityKtTest {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }


}