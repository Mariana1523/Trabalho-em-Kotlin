fun main()
{
     class Alunas constructor(idade: Int, nome: String) 
     {
        var idade: Int;
        var nome: String;
		init
          {
            this.idade = idade  
            this.nome = nome
          }
     }
     var aluna1 = Alunas(20,"Mariana");
     var aluna2 = Alunas(20,"Marcelle");
     println("Alunas: "+aluna1.nome+"  "+aluna2.nome)
}
