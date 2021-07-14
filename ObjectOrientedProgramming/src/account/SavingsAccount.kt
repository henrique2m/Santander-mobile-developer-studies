package account

class SavingsAccount (pNumber: Int, pAgency: String): Account(pNumber, pAgency){
    override fun tax(): Double {
      return 0.0
    }
    override fun transfer(accountBackDestination: Account, value: Double) {
        super.transfer(accountBackDestination, value + tax())
    }

    override fun toString(): String {
        return "SavingsAccount(number=$number, agency='$agency')"
    }
}