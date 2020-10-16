class  TestAtleta {

  public  void  testNome () throws  Exception {

  }

  public  void  testIdade () throws  Exception {

    Atleta atleta =  novo  Atleta ();
    int idade;

    idade =  10 ;
    atleta . setIdade (idade);
    if (atleta . getIdade () ! = idade)
      lançar  novo  Exception ( " [erro] falha manipulando IDADE valor "  + idade);

    idade =  99999 ;
    atleta . setIdade (idade);
    if (atleta . getIdade () ! = idade)
      Sistema . para fora . println ( " [erro] falha manipulando IDADE valor "  + idade);

    idade =  - 9 ;
    atleta . setIdade (idade);
    if (atleta . getIdade () ! = idade)
      Sistema . para fora . println ( " [erro] falha manipulando IDADE valor "  + idade);

    idade =  0 ;
    atleta . setIdade (idade);
    if (atleta . getIdade () ! = idade)
      Sistema . para fora . println ( " [erro] falha manipulando IDADE valor "  + idade);

  }

}
