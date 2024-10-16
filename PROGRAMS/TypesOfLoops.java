public class TypesOfLoops {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Printing using For Loop :- ");
        for(i=0;i<3;i++)
        {
            System.out.println("Good Morning");
        }
        System.out.println("Printing using While Loop :- ");
        i=0; // info: Reset i
        while(i<3)
        {
            System.out.println("Good Evening");
            i++;
        }
        System.out.println("Printing using Do-While Loop :- ");
        i=0; // info: Reset i
        do
        {
            System.out.println("Good Night");
            i++;
        }while(i<3);
    }
}
