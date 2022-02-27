// Java program to check quadrant 
import java.util.*; 
class assin3 { 
    // Function to check quadrant 
    static void quadrant(int x, int y) 
    { 
        if (x > 0 && y > 0) 
            System.out.println("lies in First quadrant"); 
        else if (x < 0 && y > 0) 
            System.out.println("lies in Second quadrant"); 
        else if (x < 0 && y < 0) 
            System.out.println("lies in Third quadrant"); 
        else if (x > 0 && y < 0) 
            System.out.println("lies in Fourth quadrant"); 
        else if (x == 0 && y > 0) 
            System.out.println("lies at positive y axis"); 
        else if (x == 0 && y < 0) 
            System.out.println("lies at negative y axis"); 
        else if (y == 0 && x < 0) 
            System.out.println("lies at negative x axis"); 
        else if (y == 0 && x > 0) 
            System.out.println("lies at positive x axis"); 
        else
            System.out.println("lies at origin"); 
    }      
    // Driver Code 
    public static void main(String[] args) 
    { 
        int x = 1, y = 1; 
        // Function Calling 
        quadrant(x, y); 
    } 
} 