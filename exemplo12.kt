
    fun throwException(): Nothing 
    {
    throw Exception("Exceção personalizada")
	}
    fun main()
	{
 	throwException()
    }
/*Sempre que uma função retorna Nothing, então irá lançar uma exceção */
