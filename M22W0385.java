import java.util.*;
public class M22W0385
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //scanner is using to receive strings and numbers entered from the keyboard.
        System.out.println("Enter the length of the cuboid: ");
        int length=sc.nextInt();
        //here we enter the length
        System.out.println("Enter the breadth of the cuboid: ");
        int breadth=sc.nextInt();
        //here we enter the breadth
        System.out.println("Enter the height of the cuboid: ");
        int height=sc.nextInt();
        //here we enter the height
        int surface_area=2*((length*breadth)+(breadth*height)+(height*length));
        //this is the formula of surface area of the cuboid
        System.out.println("The surface area of the cuboid is: "+surface_area);
    }
}