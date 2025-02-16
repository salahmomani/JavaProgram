package part7.Algorithms;

public class smallest {

    public static int smallest(int[] array){
            int sm=array[0];

            for (int n :array){
                if(n<sm)
                    sm=n;
            }
            return  sm;
    }
}
