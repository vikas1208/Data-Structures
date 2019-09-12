package backtracking;

class GFG1 
{ 
    // Java recursive function to solve tower of hanoi puzzle 
    static void towerOfHanoi(int n, char from_rod,  char aux_rod, char to_rod) 
    { 
        if (n == 1) 
        { 
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod); 
            return; 
        } 

        towerOfHanoi(n-1, from_rod, to_rod,aux_rod); 
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); 
        towerOfHanoi(n-1, aux_rod, from_rod,to_rod); 
    } 
      
    //  Driver method 
    public static void main(String args[]) 
    { 
        int n = 4; // Number of disks 
        towerOfHanoi(n, 'A', 'B', 'C');  // A, B and C are names of rods 
    } 
}
