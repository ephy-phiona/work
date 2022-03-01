fun main(){
  remainder(60,2)
    remainder(10,3)
    add(10,20,30,40)
    var x=product(16,2)
    println(x)
    instruction("work hard for money")
    instruction("She is a leader")
    instruction("Achieve your goals babygurl")
    subtract(40,20)
}
fun remainder(a: Int,b:Int){
    var remainder=a%b
    println(remainder)
}
fun add(a: Int,b: Int,c: Int,d: Int){
    var sum=a+b+c+d
    println(sum)
}
fun product(a: Int,b: Int):Int{
    var product=a*b
    return product
}
fun instruction(firstName: String){
    println("$firstName")
}
fun subtract(a: Int,b: Int){
    var subtract=a-b
    println(subtract)
}
