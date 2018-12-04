package rusakov;
// Drawing a staircase structure - given the required height, output a staircase as shown in the example
// Given n = 3, the output should be:
// #
// ##
// ###
public class Task2 {

    public String  Task2(int num){
        String str2;
        str2 = "";
        for (int i = 1; i <= num ; i = i + 1) {
            str2 = str2 + "#";
            System.out.println(str2);
        }
        return str2;
    }
}
