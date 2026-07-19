package corejava;

import java.time.LocalDate;

public class JavaTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 2, 3);//LocalDate.now();



    }
    /*lamdaExpression l = new lamdaExpression() {
        @Override
        public int add(int a, int b) {
            return 0;
        }
    };

    lamdaExpression l2 = new lamdaExpression() {
        @Override
        public int add(int a, int b){
            return 21;
        }
    };

    LambdaExpression l3=
    @Override
    public int add(int p, int q){
        return 0;
    };*/

    interface LamdaExpression{
        int add(int a, int b);
    }
}
