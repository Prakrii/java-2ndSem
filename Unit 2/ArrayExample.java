public class ArrayExample {
    public static void main(String[] args){
        int[] myArray;

        //instantiate the array
        myArray=new int[5];
        //initialize the array
        myArray[0]=10;
        myArray[1]=20;
        myArray[2]=30;
        myArray[3]=40;
        myArray[4]=50;
        myArray[1]=100;  //It will replace 20 with 100


        //print the array
        for (int i=0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}
