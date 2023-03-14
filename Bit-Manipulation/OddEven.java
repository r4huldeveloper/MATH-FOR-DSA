public class OddEven {
    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        System.out.println(oddEven.isOdd(5));
        System.out.println(oddEven.isOdd(8));
    }

    /* HERE WE USED AND OPERATION TO GET (N & 1) THEN IT WILL DEFINITELY,
       GIVE (1) AS A RESULT (IF N WILL BE SAME i.e. 1)
     */

    public boolean isOdd(int n){
        return ((n & 1) == 1);
    }
}
