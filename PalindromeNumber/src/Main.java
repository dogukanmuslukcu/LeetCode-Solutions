public class Main {

    public static void main(String[] args) {
        int x=121;
        int temp =x ;
        int reverseNumber = 0;
        if(x<0)
        {
            System.out.println(false);
        }
        while(x != 0)
        {
            reverseNumber = 10*reverseNumber + x%10;
            x /= 10;
        }
        if(temp == reverseNumber)
        {
            System.out.println(true );
        }
        else
            {
               System.out.println(false);
            }

        
    }
}
