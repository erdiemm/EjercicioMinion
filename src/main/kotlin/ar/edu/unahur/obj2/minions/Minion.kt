package ar.edu.unahur.obj2.minions

abstract class Minion() {
    var estamina = 0
    abstract fun agregarEstamina(valor: Int)
}

class Biciclopes(): Minion() {
    override fun agregarEstamina(valor: Int) = if (valor >=10){estamina = 10} else {estamina = valor}
}

class ciclopes(): Minion(){
    override fun agregarEstamina(valor: Int) {
        estamina = valor
    }

}