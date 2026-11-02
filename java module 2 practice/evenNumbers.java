public class evenNumbers {
    public static void main(String[] args) {
        int j = 1;
        int sum;
        for (int i = 0; i<100; i++){
            sum= i+j;
            if(sum%2==0){
                System.out.println(sum);
            }
            else{
                continue;
            }
        }
    }
    
}
