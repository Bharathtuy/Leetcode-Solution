class Solution {
    public int countBattleships(char[][] board) {
        int ans =   0  ;
        
        for( int i = 0 ; i < board.length ; i++){
            for( int j = 0 ;  j < board[0].length ; j++){
                if( i == 0 ){
                    
                    if(board[i][j]=='X' ){
                        if(ans==0){
                            ans++;
                            continue;
                        }
                         if(j-1>=0 && board[i][j-1]!='.'){
                            System.out.println("n"+i+" "+j);
                        continue;}
                        // else if ( j+1<board[0].length && board[i][j+1]!='.'){
                        //     System.out.println("0"+i+" "+j);
                        //     continue;}
                        else ans++;
                    }

                }
                else {
                    if(board[i][j]=='X' ){
                         if(ans==0){
                            ans++;
                            continue;
                        }
                        if(i-1>=0 && board[i-1][j]!='.'){
                            System.out.println("h"+i+" "+j);
                            continue;
                        }
                        // else if(i+1<board.length && board[i+1][j]!='.'){
                        //     System.out.println("m"+ i + " "+j);
                        //         continue;
                        // }
                        else if(j-1>=0 && board[i][j-1]!='.'){
                            System.out.println("n"+i+" "+j);
                        continue;}
                        // else if ( j+1<board[0].length && board[i][j+1]!='.'){
                        //     System.out.println("0"+i+" "+j);
                        //     continue;}
                        else ans++;
                    }
                }
            }
            }
        
        return ans;
    }
}