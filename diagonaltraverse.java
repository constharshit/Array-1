class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; int n = mat[0].length;
        int [] result = new int[m*n];
        int idx = 0;
        int i=0; int j=0;
        boolean dir = true; //up
        while(idx < result.length)
        {
            result[idx] = mat[i][j];
            idx++;
            if(dir)
            {
                //up
                if( i==0 && j != n-1)
                {
                    j++; dir = false;
                }
                else if(j==n-1)
                {
                    i++; dir = false;
                }
                else {
                    i--;j++;
                }
            }
            else {
                if(j==0 && i != m-1)
                {
                    i++;dir = true;
                }
                else if(i == m-1)
                {
                    j++; dir = true;
                }
                else {
                    j--;i++;
                }

            }

        }
        return result;
    }
}