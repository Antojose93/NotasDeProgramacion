import java.util.*; 
import java.io.*;

class Main {


  /*
  Dado una palabra 
  dayanaaaa
  1d6a1y1n
  
  */
  public static int contadorletras(String str, char s, int indice){
    int count = 0;
    for (int i=indice;i<str.length();i++){
      if(str.charAt(i) == s) count++;
      else break;
    }
    return count;
  }


  public static String RunLength(String str) {
    // code goes here
  StringBuilder decodificador = new StringBuilder();
  int contador = 0;
  char c;
  for (int i=0 ; i<str.length(); i++){
    c=str.charAt(i);
    contador = contadorletras(str , str.charAt(i) , i);
    decodificador.append(contador).append(c);
    i+= contador -1;
    
  }


    return decodificador.toString();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(RunLength(s.nextLine())); 

  }

}