package account

interface FinancialMovement {
    fun withdraw(value: Double)

    fun deposit(value: Double)

    fun transfer(destinationBackAccount: Account, value: Double)

}