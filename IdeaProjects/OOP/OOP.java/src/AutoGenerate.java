public class AutoGenerate {
    public  int autoGenerate(Object o){
        int i = 1;
        while (this != o){
            i++;
        }
        return i;
    }
}
