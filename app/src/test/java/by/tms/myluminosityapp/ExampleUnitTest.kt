package by.tms.myluminosityapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun check_buyUSDforBYN_is_correct() {
        val tradeClass = TradeClass()
        val usd = tradeClass.buyUSDforBYN(2.5, 1000.5)
        assertTrue(usd == 400.2)
    }
    @Test
    fun check_moneyDeposit_is_correct() {
        val tradeClass = TradeClass()
        val usd = tradeClass.moneyDeposit(250000.0, 0.1)
        assertTrue(usd == 275000.0)
    }
    @Test
    fun check_cashResult_is_correct() {
        val tradeClass = TradeClass()
        val usd = tradeClass.cashResult(1250.2)
        assertEquals("Ваш баланс равен 1250.2", usd)
    }

}
