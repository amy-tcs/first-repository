import java.util.Scannar

fun main(){
    val read = Scannar(System.in)

    println("Enter a first number: ")
    var a=read.nextInt()

    println("Enter a second number: ")
    var b=read.nextInt()

    var sum= a+b

    print("Addition= "+sum)
} 