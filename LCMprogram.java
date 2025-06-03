public class LCMprogram {
   
        public int findGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        public int findLCM(int a, int b) {
            if (a == 0 || b ==0) {
                return 0;
            }
            return (a * b) / findGCD(a,b);
        }
        public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        LCMprogram lcmprogram = new LCMprogram();
        int lcm = lcmprogram.findLCM(num1, num2);
       
        System.out.println("LCM of " + num1 + " And " + num2 + " is : " + lcm );
    }
}