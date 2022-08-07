package lesson2;

public class Main {
    public static void main(String[] args)  {
    try {
        try {
            method(new String[][]{{"1","2","3","4"}, {"5", "6", "7", "8"},{"9","10","11","12"},{"13", "14", "15", "16" }});
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    } catch (MyArraySizeException e) {
        e.printStackTrace();
    }

}
    public static void method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if(arr.length !=4){
            throw new MyArraySizeException ("Недопустимая длина массива!");
        }
        int sum = 0;
        for(int i = 0; i < 4; i++){
            for(int j=0; j < 4; j++){
                try{
                arr[i][j] = String.valueOf(Integer.parseInt(arr[i][j]));
                sum = Integer.parseInt(sum +arr[i][j]);}
                catch(NumberFormatException e){
                    throw new MyArrayDataException ("It isn't number");
                }
            }
        }
    }

}
