



public class First_question {

    public static boolean find(int[][] array,int target){
        if(array==null){
            return false;
        }
        int row=0;
        int column=array[0].length-1;
        while(row<array.length&&column>=0){
            if(array[row][column]==target){
                return true;
            }
            if(array[row][column]>target){
                column--;
            }else{
                row++;
            }
        }
        return false;
    }

   public static void main(String[] args){

       int[][] arrary={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        if(find(arrary,13)){
            System.out.println("helllo world\n");
        }else{
            System.out.println("sorry ,no this number");
        }
       return ;
   }
}
