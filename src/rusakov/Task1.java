package rusakov;

public class Task1 {
    public String result;
    public String calc(String str){
        boolean flag = true;
        for (int i = 0; i <= (str.length() / 2) - 1; i = i + 1) {
            System.out.print(str.charAt(i));
            System.out.print("--");
            System.out.println(str.charAt(str.length() - 1 - i));
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                flag = flag;
            } else {flag = flag & false;}
        }
        if (flag) str = "Polindrom"; else str =  "Non polindrom";
        return str;
    }
}
