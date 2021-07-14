package account

class CurrentAccount (pNumber: Int, pAgency: String): Account(pNumber, pAgency){
    override fun tax(): Double {
        return 0.50
    }
}