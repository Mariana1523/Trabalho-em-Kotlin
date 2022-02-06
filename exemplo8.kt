fun main()
{
     class Alunas 
     {
        var idade: Int;
        var nome: String;
        constructor(idade: Int, nome: String) 
          {
            this.idade = idade  
            this.nome = nome
          }
     }
     var aluna1 = Alunas(20,"Mariana");
     var aluna2 = Alunas(20,"Marcelle");
     println("Alunas: "+aluna1.nome+" e "+aluna2.nome)
}
