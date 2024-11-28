public class RtoI {
    public int romanToInt(String s) {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        int num =0;
        String[] splitedNumber = s.split("");
        for(int i = 0; i < splitedNumber.length; i++){
            switch(splitedNumber[i]){
                case "I":
                    num+=I;
                    break;
                case "V":
                    if(i == 0){
                        num+=V;
                        break;
                    }
                    else if(splitedNumber[i-1].equals("I")){
                        num+=(V-I)- I;
                        break;
                    }
                    else{
                        num+=V;
                        break;
                    }
                case "X":
                    if(i==0){
                        num+=X;
                        break;
                    }
                    else if(splitedNumber[i-1].equals("I")){
                        num+=(X-I)-I;
                        break;
                    }
                    else{
                        num+=X;
                        break;
                    }
                case "L":
                    if(i == 0){
                        num+=L;
                        break;
                    }
                    else if(splitedNumber[i-1].equals("X")){
                        num+=(L-X)-X;
                        break;
                    }
                    else{
                        num+=L;
                        break;
                    }
                case "C":
                    if(i==0){
                        num+=C;
                        break;
                    }
                    else if(splitedNumber[i-1].equals("X")){
                        num+=(C-X)-X;
                        break;
                    }
                    else{
                        num+=C;
                        break;
                    }
                case "D":
                    if(i==0){
                        num+=D;
                        break;
                    }
                    else if(splitedNumber[i-1].equals("C")){
                        num+=(D-C)-C;
                        break;
                    }
                    else{
                        num+=D;
                        break;
                    }
                case "M":
                    if(i==0){
                        num+=M;
                        break;
                    }
                    else if(splitedNumber[i-1].equals("C")){
                        num+=(M-C) - C;
                        break;
                    }
                    else{
                        num+=M;
                        break;
                    }

            }
        }

        return num;

    }

    public static void main(String[] args){
        RtoI r = new RtoI();
        System.out.println(r.romanToInt("VII"));

    }
}
