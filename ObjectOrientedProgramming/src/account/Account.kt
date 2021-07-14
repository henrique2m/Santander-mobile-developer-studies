package account

abstract class Account (
    val number: Int,
    val agency: String,
   ) : FinancialMovement {

        private var _balance: Double = 0.0

        abstract fun tax() : Double

        fun haveBalance(value: Double) : Boolean {
            return (_balance >= value)
        }

        fun getBalance() : Double {
            return _balance
        }

        override fun withdraw(value: Double){
            if(haveBalance(value)){
                _balance -= value
                println("Saque -> Valor: $value")
            } else {
                println("Saque -> Não há saldo suficiente!")
            }
        }

        override fun deposit(value: Double){
            if(value > 0){
                _balance += value
                println("Depósito -> Valor: $value")
            } else {
                println("Depósito -> Informe um valor válido para o depósito.")
            }
        }

        override fun transfer(destinationBackAccount: Account, value: Double) {
            if(haveBalance(value)){
                this.withdraw(value)
                destinationBackAccount.deposit(value)
                println("""
                    Transferência -> Valor: $value
                    Conta origem: ${this.number} Saldo atual ${this.getBalance()}
                    Conta destino: ${destinationBackAccount.number} Saldo atual: ${destinationBackAccount.getBalance()}
                    
                """.trimIndent())
            }
        }

}