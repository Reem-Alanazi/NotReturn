fun main(args: Array<String>) {

    returnTypeAsVoidSuccess()
    unitReturnTypeForNonMeaningfulReturns()

}
fun unitReturnTypeForNonMeaningfulReturns(): Unit {
    println("No meaningful return")
}

fun returnTypeAsVoidSuccess(): Void? {
    println("Function can have Void as return type")
    return null
}