package rusakov;

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
