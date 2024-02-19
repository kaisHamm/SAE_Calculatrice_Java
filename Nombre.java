public class Nombre extends Expression
{
  private int valeurNombre ; // Entier encapsulé


 /**
  * Constructeur
  * @param uneValeur (int) : entier permettant d'initialiser un correction_partie_1.Nombre
  */
  public Nombre(int uneValeur)
  {
    super() ;
    this.valeurNombre = uneValeur ;
  }


 /**
  * Redéfinition
  * Retourne la valeur courant de correction_partie_1.Nombre
  * @return
  */
  public int valeur()
  {
    return this.valeurNombre ;
  }

 /**
  * Retourne la représentation du Nombre courant sous forme d'une chaîne de caractères
  * @return (String)
  */
  public String toString()
  {
    // possible : 
    // return "" + this.valeurNombre ;
    return Integer.toString(this.valeurNombre) ;
  }
  
}