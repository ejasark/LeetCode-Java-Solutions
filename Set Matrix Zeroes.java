class GFG 
{ 
    public static void modifyMatrix(int mat[ ][ ], int R, int C) 
    { 
        int row[ ]= new int [R]; 
        int col[ ]= new int [C]; 
        int i, j; 
      
        /* Initialize all values of row[] as 0 */
        for (i = 0; i < R; i++) 
        { 
        row[i] = 0; 
        } 
      
      
        /* Initialize all values of col[] as 0 */
        for (i = 0; i < C; i++) 
        { 
        col[i] = 0; 
        } 
      
      
        /* Store the rows and columns to be marked as 
        1 in row[] and col[] arrays respectively */
        for (i = 0; i < R; i++) 
        { 
            for (j = 0; j < C; j++) 
            { 
                if (mat[i][j] == 1) 
                { 
                    row[i] = 1; 
                    col[j] = 1; 
                } 
            } 
        } 
      
        /* Modify the input matrix mat[] using the 
        above constructed row[] and col[] arrays */
        for (i = 0; i < R; i++) 
        { 
            for (j = 0; j < C; j++) 
            { 
                if ( row[i] == 1 || col[j] == 1 ) 
                { 
                    mat[i][j] = 1; 
                } 
            } 
        } 
    } 
}
