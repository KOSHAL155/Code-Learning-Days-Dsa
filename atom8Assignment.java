import java.util.ArrayList;

public class atom8Assignment {
    public  static  void main(String [] args){

        String s1 ="dcba";
        String s2= "edcb";
        String s3="decb";
        String res="";
        String final_res="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)<s2.charAt(i)){
                if(s1.charAt(i)<s3.charAt(i)){
                    res=res+s1.charAt(i);
                }else{
                    res=res+s3.charAt(i);
                }
            }else if(s2.charAt(i)<s1.charAt(i)){
                if(s2.charAt(i)<s3.charAt(i)){
                    res=res+s2.charAt(i);
                }else{
                    res=res+s3.charAt(i);
                }
            }

        }
        ArrayList<String> relation=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            String store="";
            store=""+s1.charAt(i)+s2.charAt(i)+s3.charAt(i);
            relation.add(store);
        }
        for(int j=0;j<res.length();j++) {
            char c=res.charAt(j);
            for (int i = 0; i < relation.size(); i++) {
                if(j==i){
                    continue;
                }
                if(relation.get(i).indexOf(c)!=-1){
                    c=res.charAt(i);
                }

            }
            final_res=final_res+c;
        }
        System.out.print(final_res);

    }


}
