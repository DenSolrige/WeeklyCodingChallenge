public class Harshad {

    public static boolean isHarshad(int digitSum, int workingNum, int input){
        if(workingNum != 0){
            digitSum+=workingNum%10;
            return isHarshad(digitSum,workingNum/10,input);
        }else {
            return input%digitSum == 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(isHarshad(0,75,75));
        System.out.println(isHarshad(0,171,171));
        System.out.println(isHarshad(0,481,481));
        System.out.println(isHarshad(0,89,89));
        System.out.println(isHarshad(0,516,516));
        System.out.println(isHarshad(0,200,200));
    }
}
