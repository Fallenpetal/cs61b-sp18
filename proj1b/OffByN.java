public class OffByN implements CharacterComparator{
    private int distance;

    public OffByN(int N){
        distance = N;
    }

    public boolean equalChars(char x, char y){
        if(x - y == -distance || x - y == distance){
            return true;
        }
        else {
            return false;
        }
    }

}
