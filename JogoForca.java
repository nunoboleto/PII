
package jogoforca;

class JogoForca{

    char[] chave;
    char[] tentativa;
    String[] corpo={"cabeça", "tronco", "braço dir", "braço esq", "perna dir.", "perna esq"};
    int contador;

    JogoForca(String c){
      chave=c.toCharArray();
      tentativa = new char[chave.length];
        for(int i=0; i<tentativa.length; i++)
          tentativa[i]='_';

        contador = 0;
    }

    void mostra_chave(){
      for(int i=0;i<chave.length;i++)
        System.out.print (chave[i]+" ");

      System.out.println();
    }

    void mostra_tentativa(){
      for(int i=0;i<tentativa.length;i++)
        System.out.print(tentativa[i]+" ");

      System.out.println();
    }

    // retorna true se a chave tem o character c
    boolean  tem(char c){
      for(int i=0;i<chave.length;i++){
        if(chave[i]==c)
          return true;
      }
      return false;
    }
    //retorna true se o jogo acabou (adivinharam as letras ou acabaram as tentativas!)
    boolean acabou(){
      return false;
    }


    void joga(char c){
      if(tem(c)){
        for(int i=0;i<chave.length;i++){
          if(chave[i]==c)
            tentativa[i]=c;
        }
        mostra_tentativa();
      }
     /* else{
       // if(contador>=corpo.length){
         // System.out.println("PERDEU O JOGO");
        }*/ //Por indica��o dum estudante da �ltima fila
      else{
        System.out.println("Não tem "+ c +"'s. Perdeu o/a " + corpo[contador++]);
        if(contador==corpo.length)
          System.out.println("PERDEU O JOGO");
      }
    }

    char le_caracter() throws java.io.IOException{
      String s="";
      char c;
      while((c=(char)System.in.read() )!='\n')
        s+=c;
      return s.charAt(0);

    }
    void joga() throws java.io.IOException{
      while (contador<corpo.length){
        System.out.print("Digite uma letra:");
        joga(le_caracter());
        }



  }

  public static void main(String[] args) throws java.io.IOException{
    JogoForca j=new JogoForca("barco");
    j.joga();

  }

}
