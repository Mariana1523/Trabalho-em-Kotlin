
fun parOuImpar(valor: Int): String = if (valor%2==1) {
        "Impar"
    } else {
        "Par"
    }
    fun main(){
       	var resposta = parOuImpar(7);
        println(resposta);
    }
