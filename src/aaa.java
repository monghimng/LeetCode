public class aaa{
    public static void main(String[] args){
        int[][] v = {
                {0,1,2},
                {3,4,5},
                {6,7,8}
        };
        new SpiralMatrix().spiralOrder(v).forEach(System.out::println);
    }
}