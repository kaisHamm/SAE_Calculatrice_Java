public class Division extends Operation
{
 /**
  * Constructeur d'initialisation champ à champ
  * @param operande1 (Expression)
  * @param operande2 (Expression)
  */
  public Division(Expression operande1, Expression operande2) throws ArithmeticException
  {
    super(operande1, operande2);

   /**
    * Le diviseur ne doit pas être nul
    */
    if (this.getOperande2().valeur()==0)
      throw new ArithmeticException("Diviseur nul !");
  }

 /**
  * Redéfinition
  * Retourne la résultat de la Division courante
  * @return (int)
  */
  public int valeur()
  {
    return this.getOperande1().valeur() / this.getOperande2().valeur() ;
  }


 /**
  * Retourne la représentation de l'Addition courante sous forme d'une chaîne de caractères
  * @return (String)
  */
  public String toString()
  {
    return  "(" + this.getOperande1() + " / " + this.getOperande2() + ")" ;
  }

}
