package sk.itsovy.school.subjects;

public class Math extends Subject {
    public Math(){

    }
    public int reverse(int number){
        int toReverse = 0;
        char[] prepared = Integer.toString(number).toCharArray();
        if(prepared[prepared.length-1] == '0'){
            return toReverse;
        }
        String toReturn = "";
        char[] reversedArr = reverseArr(prepared);
        boolean hasMinus = false;
        for (int i = 0; i < reversedArr.length; i++) {
            if(reversedArr[i] == '-'){
                hasMinus = true;
                continue;
            }
            toReturn += reversedArr[i] + "";
        }
        toReturn = hasMinus?"-"+toReturn:toReturn;
        return Integer.parseInt(toReturn);
    }
    private char[] reverseArr(char[] arr){
        char[] newArr = new char[arr.length];
        for(int i = 0; i < newArr.length; i++){
            newArr[i] = arr[arr.length-1-i];
        }
        return newArr;
    }
    public boolean isPrimeNumber(int number){
        if (number <= 1)
            return false;
        if (number <= 3)
            return true;
        if (number % 2 == 0 || number % 3 == 0)
            return false;
        for (int i = 5; i * i <= number; i = i + 6)
            if (number % i == 0 || number % (i + 2) == 0)
                return false;
        return true;
    }
}
