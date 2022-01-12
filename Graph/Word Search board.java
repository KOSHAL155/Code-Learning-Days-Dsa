public class Solution {
    public int exist(ArrayList<String> A, String B) {
        for(int i=0;i<A.size();i++){
        if(A.get(i).contains(B)){
            return 1;
        }}
        
        if(B==""){
            return 1;
        }
        int row=A.size();
        if(row==0){
            return 0;
        }
        int column=A.get(0).length();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(A.get(i).charAt(j)==B.charAt(0)){
                    if(search_dfs(i,j,0,A,B,row,column))
                    return 1;
                }
            }
        }
        return 0;
    }
    int dx[]={1,-1,0,0};
     int dy[]={0,0,1,-1};
    public boolean search_dfs(int x,int y,int id,ArrayList<String> a,String b,int row,int column){
        if(id==b.length()-1){
            return true;
        }
        id++;

        for(int i=0;i<4;i++){
            int newX=x+dx[i];
            int newY=y+dy[i];
            if(newX>=0&&newY>=0&&newX<row&&newY<column&&a.get(newX).charAt(newY)==b.charAt(id)){
                if(search_dfs(newX,newY,id,a,b,row,column)){
                    return true;
                }
            }
        }
        return false;
    }
}
