public class THROW_THROWS {
    public static int divideNum(int m,int n)throws ArithmeticException{
        int div=m/n;
        return div;
    }

    public static void main(String[] args) {
        THROW_THROWS obj=new THROW_THROWS();
        try{
            System.out.println(obj.divideNum (10,0));
        }
        catch(ArithmeticException e){
            System.out.println("number cannot be displayed by 0");
        }
        System.out.println("code");
    }
}
