package by.tms.myluminosityapp

class TradeClass {

    fun buyUSDforBYN(usdCourse: Double, byn: Double): Double {
        return byn / usdCourse
    }

    fun moneyDeposit(money: Double, yearPercent: Double) = money.plus(money.times(yearPercent))


    fun cashResult(balance: Double): String = "Ваш баланс равен $balance"


}