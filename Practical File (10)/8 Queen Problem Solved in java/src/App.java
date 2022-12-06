public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This is 8 Queen Problem Implemented in JAVA");


        System.out.println();

        Stack st = new Stack();
        Box Matrix = new Box();Matrix.cols[0] = true;
        Check ck = new Check();
        int j = 1 , i = 1;

        while(i < 9){
            int x = 8;                                              //By Gulshan Sharma 25597
        
            
            while(j < 9){
                if(ck.pos(i , j ,Matrix)){
                    
                    Matrix.mat[i][j] = true;                    //Insert values if position is correct
                   
                    Matrix.cols[j] = true;
                    Matrix.rows[j] = i;
                    st.push(j);
                    x = 7 ;j = 1;
                    break;
                }
                
                j++;
            }
            if(x == 8){
                
                j = st.pop() + 1;
                Matrix.cols[j-1] = false;                       //Backtracking involved here
                Matrix.mat[i-1][j-1] = false;
                i-= 2;

            }

            i++;
        }
        Matrix.show();

    }
}


//By  Gulshan Sharma 
// Roll No. 25597
// CSE - B