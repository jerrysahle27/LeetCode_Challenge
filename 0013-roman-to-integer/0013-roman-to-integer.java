
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            temp += s.charAt(i);
            if (i != s.length() - 1) {
                temp += s.charAt(i + 1);
                System.out.println(subValue(temp));
                if (subValue(temp) == 0) {
                    result += commonValue(Character.toString(temp.charAt(0)));
                } else {
                    result += subValue(temp);
                    i++;
                }
            } else {
                result += commonValue(temp);
            }
        }
        return result;
    }

    int commonValue(String s) {
        switch (s) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                return 0;

        }
    }

    int subValue(String s) {
        switch (s) {
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
            default:
                return 0;
        }
    }

}