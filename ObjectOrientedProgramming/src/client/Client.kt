package client

import account.Account


abstract  class Client (
    var address: Eddress,
    var account: Account) {

    val segment:  Segment
        get() = if (account.getBalance() < 10.0){
            Segment.CLASSIC
        } else {
            Segment.VAN_GOGH
        }

    abstract fun returnDataClient()
}