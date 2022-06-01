/*
Student Id : 991657803
 */
package cardtrickice1;
import java.util.Scanner;
/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author Utsav Kunjadiya
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(Card.randomValue());//use a method to generate random *13
            c1.setSuits(Card.randomSuits());//random method suit 
            magicHand[i]=c1;
        }
        //step 2:take input 
         System.out.println("Enter Number");
        int indexNum=sc.nextInt();
        System.out.println("Choose any one of the suits 'diamond'\t'clubs'\t'spades\t'hearts' ");
        String indexSuites=sc.next();
        
        
        //step 3: match with array 
        boolean match =true;
        for(int i =0; i < magicHand.length;i++)
        {
            match = true;
            if((magicHand[i].getValue() == indexNum) && (magicHand[i].getSuits().equals(indexSuites)))
            {
                System.out.println(" Match Card is found.");
                break;
            }
            else
            {
                match = false;
            }
        }
        if(match == false)
        {
            System.out.println("Match Card not found");
        }
    }
    
}
