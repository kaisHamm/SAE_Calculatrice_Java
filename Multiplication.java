public class Multiplication extends Operation
{
 /**
  * Constructeur d'initialisation champ à champ
  * @param operande1 (Expression)
  * @param operande2 (Expression)
  */
  public Multiplication(Expression operande1, Expression operande2)
  {
    super(operande1, operande2);
  }

 /**
  * Redéfinition
  * Retourne la résultat de la Multiplication courante
  * @return (int)
  */
  public int valeur()
  {
    return this.getOperande1().valeur() * this.getOperande2().valeur() ;
  }

 /**
  * Retourne la représentation de la Multiplication courante sous forme d'une chaîne de caractères
  * @return (String)
  */
  public String toString()
  {
    return  "(" + this.getOperande1() + " * " + this.getOperande2() + ")" ;
  }

}