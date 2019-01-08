
public class SecondQusetion {
    static public String replaceSpace(StringBuffer str){
        if(str==null){
            return null;
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
           if(String.valueOf(str.charAt(i)).equals(" ")){
               sb.append("%20");
           } else{
               sb.append(str.charAt(i));
           }
        }
        return String.valueOf(sb);
    }
    public static void main(String[] args){

       String str="We are happy";
        String s=null;
        s= replaceSpace(new StringBuffer(str));
        System.out.println("life is hehe  "+s);
        return ;
    }

}
