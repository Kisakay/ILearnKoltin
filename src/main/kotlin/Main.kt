fun main() {
    val a:Int = 1000
    val b:String = "log message"
    val c:Double = 3.14
    val d:Long= 100_000_000_000_000
    val e:Boolean = false
    val f:Char = '\n'

    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
// [triangle, square, circle]

// Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
// [triangle, square, circle]
}