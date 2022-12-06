public class Box {
    boolean[][] mat = new boolean[9][9];            // Creating Matrix to store results
    boolean[] cols = new boolean[9];                // Creating array to count columns
    int[] rows = new int[9];                        // Check the rows in which queen is inserted

    void show(){
        for(int v = 1 ; v < 9 ; v++){
            for(int j = 1 ; j < 9 ; j++){
                System.out.print("  " + mat[v][j]);
            }                                                                // to print answer on screen
            System.out.println();
        }
    }
}


//By  Gulshan Sharma 
// Roll No. 25597
// CSE - B