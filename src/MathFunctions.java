public class MathFunctions {
    public static void main(String[] args) {
        int x= 10;
        int y= 20;
        int z=30;
        // 5xy + 8, xyz + x3
        System.out.println(Math.multiplyExact(5,Math.multiplyExact(x,y)) +8 );

        System.out.println(Math.multiplyExact(x,Math.multiplyExact(y,z))+Math.pow(x,3));

        //  x3 - y3 - 3xy (x - y)
        System.out.println(Math.pow(x,3)-Math.pow(y,3)-(Math.multiplyExact(Math.multiplyExact(3,Math.multiplyExact(x,y)),(x-y)))


        );


    }
}
