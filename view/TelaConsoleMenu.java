import  java.util.Scanner ;
import  java.util.ArrayList ;

class  TelaConsoleMenu {

    Teclado do scanner =  novo  scanner ( sistema . In );
    Matrículas ArrayList < Atleta > =  new  ArrayList < Atleta > ();

    public  void  executar () {
      
      boolean sair =  false ;
      int op;

      // matriculas = loadAll (); para amanha ou quarta

      while ( ! sair) {

        Sistema . para fora . println ( " \ n MENU ****** " );
        Sistema . para fora . println ( " 1 [+] ATLETA " );            // ok
        Sistema . para fora . println ( " 2 [+] AVALIACAO " );         
        Sistema . para fora . println ( " 11 [>] LISTAGEM " );          // ok
        Sistema . para fora . println ( " 12 [>] CONSULTA ATLETA " );
        Sistema . para fora . println ( " 9 [X] ATLETA " );            // ok
        Sistema . para fora . println ( " 0 [X] SAIR " );              // ok
        Sistema . para fora . println ( " --------------- " );
        Sistema . para fora . imprimir ( " Opcao: _ " );
        op = teclado . nextInt ();

        if (op ==  1 ) {
          isso . incluirNovoAtleta ();
        }

        if (op ==  11 ) {
          isso . listarAtletas ();
        }

        if (op ==  9 ) {
          isso . removerAtleta ();
        }

        if (op ==  0 ) {
          // (DAO) saveAll (matriculas); // para amanha
          sair =  verdadeiro ;
        }

      }

      Sistema . para fora . println ( " fim, telaconsolemenu! " );

    }

    privado  void  incluirNovoAtleta () {
      Sistema . para fora . println ( " \ n Novo Atleta " );

      Sistema . para fora . print ( " nome_: " );
      Nome da string = teclado . Próximo();

      Sistema . para fora . print ( " idade_: " );
      int idade =   teclado . nextInt ();

      Atleta novo =  novo  Atleta ();
      novo . setNome (nome);
      novo . setIdade (idade);

      matrículas . adicionar (novo);

    }

    private  void  listarAtletas () {

      Sistema . para fora . println ( " \ n Listagem de Atletas: " );

      if (matrículas . tamanho () >  0 ) {
        int cont =  1 ;
        para ( Atleta atemp : matriculas) {
          Sistema . para fora . println (cont ++  +  " ) "  + atemp . getNome () +  " ( "  + atemp . getIdade () +  " ) " );
        }
      } else {
        Sistema . para fora . println ( " Nenhum atleta matriculado! " );
      }

    }



    private  void  removerAtleta () {

      Sistema . para fora . println ( " \ n Remover Atleta: " );

      // this.listarAtletas ();       

      Sistema . para fora . imprimir ( " selecione_: " );
      int posicao = teclado . nextInt ();

      matrículas . remover (posição - 1 );

      Sistema . para fora . println ( " remotada, ok! " );

    }


}
