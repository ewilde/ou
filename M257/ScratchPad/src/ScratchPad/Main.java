/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ScratchPad;

/**
 *
 * @author EddieDesk
 */
public class Main {

    public static char[] methodA()
    {
      char[] alphas = {'s', 't', 'e', 'a', 'm'};
      char temp = alphas[0];
      int i = 0;
      while (i < alphas.length - 1)//1
      {
        alphas[i] = alphas[i+1]; //2
        i++;
      }
      alphas[alphas.length-1]=temp;
      return alphas;
    }
    public static  char methodB()
    {
      char [] alphas = {'s','a','u','s','a','g','e'};
      char first = alphas[0];
      int i;
      for (i= 1; i < alphas.length; i++) //3
      {
        if (alphas[i] < first) //4
        {
          first = alphas[i];
        }
      }

      System.out.println(i);
      return first;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cashValue = 238e-1;
        System.out.println(cashValue);

        int smallValue = 1;
        smallValue = (int)Double.MAX_VALUE;
        {
        System.out.println(smallValue);
        System.out.println(Double.MAX_VALUE);
        }

        String testString = "zsd";

        switch (testString.charAt(0))
        {
            case 'a':
                System.out.println("a character");
                break;
            default:
                System.out.println(testString.charAt(0));
                break;
        }

        boolean [] arrayC = new boolean [5];
int [] arrayA = {1, 2, 3, 4, 5};

        boolean x = true;
        Boolean y = false;

        int[] intItems = {1,2};
        int[][] multi = new int[2][10];

        multi[0][9] = 10;
        
        System.out.println(intItems.getClass().getSuperclass().getSimpleName());

        for (int i = 1; i <= 20; i++)	{
		System.out.println("Square of " + i + " = " +( i * i));
	}

        for (char ch = ('z'); ch >= ('a'); ch--)
        {
            System.out.println("Character of value " + (int)ch + " = " + ch);
        }

        System.out.println(methodA());
        System.out.println(methodB());

        int a = 1;

char b = 'a';

boolean c = false;

    System.out.println(b >= 'a');
    System.out.println(a < b);
    System.out.println(c = true);
    System.out.println(a + b > 0);
    System.out.println(a + b);

    ClassA sdo = new ClassA();
    sdo.doIt();

    int i = 1;
 int j = 0;

 if (i > 0)
 {
     j++;
     if (j >= 1)
     {
         i = j - 1;
     }
     else
     {
         j = j - 1;
     }
     i = j;
 }
 j++;

  System.out.println("i, j = " + i + ", " + j);
  String myString = "Help me!";
  System.out.println(myString.indexOf("me"));
    }
}

class ClassA
{
 int a = 0;
 int b = 10;

 public void doIt()
 {
    {
       int b = 11;
       a = 10;
       b = 20;
    }
    System.out.println("a, b = " + a + ", " + b);
 }
}
