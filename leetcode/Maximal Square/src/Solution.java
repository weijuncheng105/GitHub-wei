// 参考 https://discuss.leetcode.com/topic/20801/extremely-simple-java-solution
public class Solution {

	
	 // dp(i, j) represents the length of the square 
	  // whose lower-right corner is located at (i, j)
	  // dp(i, j) = min{ dp(i-1, j-1), dp(i-1, j), dp(i, j-1) }
	
    public int maximalSquare(char[][] matrix) {
    	//有问题;
    	/*
        if(matrix==null||matrix.length==0||matrix[0].length==0)
        	return 0;
    	int help[][] = new int[matrix.length][matrix[0].length];
    	int maxsidelength = 0;
    	for(int i = 0;i<help.length;i++){
    		//第一列赋值;
    		help[i][0] = matrix[i][0]-'0';
    		maxsidelength = Math.max(maxsidelength, help[i][0]);
    	}
    	
    	for(int j = 0;j<matrix[0].length;j++){
    		//第一行赋值;
    		help[0][j] = matrix[0][j]-'0';
    		maxsidelength = Math.max(maxsidelength, help[0][j]);
    	}
    	
    	for(int i = 1;i<help.length;i++)
    		for(int j = 1;j<help[0].length;j++){
    			if(matrix[i-1][j-1]=='0'){
    				help[i][j] = (matrix[i][j]=='0')?0:1;
    				maxsidelength = Math.max(maxsidelength, help[i][j]);
    			}
    			else{
    				if(help[i-1][j-1]==help[i-1][j]&&help[i-1][j]==help[i][j-1]){
    					help[i][j] = help[i-1][j-1]+1;
    				}
    				else{
    					help[i][j] = Math.min(Math.min(help[i-1][j-1], help[i][j-1]),help[i-1][j]);
    				}
    				maxsidelength = Math.max(maxsidelength, help[i][j]);
    			}
    			
    		}
    	return maxsidelength*maxsidelength;
    	*/
    	
    	if(matrix.length == 0) return 0;
        int m = matrix.length, n = matrix[0].length, result = 0;
        //相当于外围加一层过渡
        int[][] b = new int[m+1][n+1];
        for (int i = 1 ; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(matrix[i-1][j-1] == '1') {
                	
                    b[i][j] = Math.min(Math.min(b[i][j-1] , b[i-1][j-1]), b[i-1][j]) + 1;
                    result = Math.max(b[i][j], result); // update result
                }
            }
        }
        return result*result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char matrix[][] = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(new Solution().maximalSquare(matrix));
	}

}
