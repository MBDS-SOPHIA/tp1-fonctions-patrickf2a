// Fonction qui affiche les x premiers nombres pairs ou impairs

fun pairsImpairs(x:Int) {
    for (i in 1..x) {
        if (i % 2 == 0) {
            println("$i est pair")
        } else {
            println("$i est impair")
        }
    }
}

pairsImpairs(10)

// Fonction qui affiche les x premiers nombres de la suite de Fibonacci

fun fib(x: Int) {
    var a = 0
    var b = 1
    var c: Int
    for (i in 1..x) {
        println(a)
        c = a + b
        a = b
        b = c
    }
}
fib(10)

// Fonction qui calcule le factoriel d’un nombre x, utiliser 10 par défaut si aucun nombre n’est spécifié.

fun factoriel(x: Int = 10): Int {
    var result = 1
    for (i in 1..x) {
        result *= i
    }
    return result
}

println(factoriel(5))

// Fonction qui affiche les x premiers nombres premiers

fun premiers(x: Int) {
    var i = 2
    var j: Int
    var isPrime: Boolean
    while (i <= x) {
        isPrime = true
        j = 2
        while (j <= i / 2) {
            if (i % j == 0) {
                isPrime = false
                break
            }
            j++
        }
        if (isPrime) {
            println(i)
        }
        i++
    }
}

premiers(25)