import java.util.Stack;

public class Main {
    public class DecimalToBinaryExample{
        public void convertBinary(int num){
            Stack <Integer>stack = new Stack<Integer>();
            while (num!=0){
                //thực hiện phép chia lấy phần dư cho 2.
             int d = num%2;
//             them vao stack
                stack.push(d);
                num/=2;
            }
            while (!(stack.isEmpty())){
                System.out.println(stack.pop());
            }
        }
        public void main(String[] args){
            int decimalNumber = 123456789;
            System.out.println("he nhi phan cua " + decimalNumber +"la :");
            new DecimalToBinaryExample().convertBinary(decimalNumber);
        }
    }




}