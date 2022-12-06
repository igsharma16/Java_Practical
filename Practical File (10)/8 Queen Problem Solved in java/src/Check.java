import java.lang.Math;

public class Check {
    
    boolean pos(int i , int j , Box Matrix ){
        if(Matrix.cols[j] == false && !chk(Matrix, i , j) ){
            return true;                                                           // To check position 
        }
        return false;
    }
                                            // To check whether diagonally values are present or not

    boolean chk(Box Matrix , int k , int l){
        for(int v = 1 ; v < 9 ; v++){
            if(Matrix.cols[v] == true){
                if(Math.abs(l - v) == Math.abs(Matrix.rows[v] - k)){
                    return true;
                }
            }                                   
        }                                                       
        return false;
    }
}


//By  Gulshan Sharma 
// Roll No. 25597
// CSE - B