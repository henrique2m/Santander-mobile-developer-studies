package client

import account.Account

class ClientLegal (
    val corporateName: String,
    pEdress: Eddress,
    pCnpj: String,
    pAccount: Account
) : Client(pEdress, pAccount){
    var cnpj: String = pCnpj
        private set(value){
            value.toUpperCase()
            field = value
        }
    override fun returnDataClient () {
        println("Cliente PJ: {${this.corporateName}, ${this.cnpj} / Conta: ${this.account}}")
    }
}