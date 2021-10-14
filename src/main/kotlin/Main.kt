fun main(args: Array<String>) {
    alwaysThrowException()
}
fun alwaysThrowException(): Nothing {
    throw IllegalArgumentException()
}
