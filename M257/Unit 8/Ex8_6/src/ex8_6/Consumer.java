package ex8_6;

/**
 * Title: Activity 8.6 Consumer
 * Description: a consumer attempts to eat all the sweets in a sweet jar.
 *
 * Copyright:   (c) 2004, 2005, 2010
 * Company:     The Open University
 * @author M257 Course Team
 * @version 1.1 09/04/2004
 */
public class Consumer extends Thread
{
    private int id;
    private SweetJar sweetJar;

    public Consumer(int i, SweetJar sj)
    {
        id = i;
        sweetJar = sj;
    }

    public void run()
    {
        while (sweetJar.countSweets() > 0)
        {
            sweetJar.eatSweet(id);
        }
    }
}
