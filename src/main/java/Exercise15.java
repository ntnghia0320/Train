import java.util.ArrayList;

public class Exercise15 {
    public int reverseBit(int n){
        ArrayList<Byte> listBit = new ArrayList<>();

        while(n > 0){
            listBit.add((byte) (n % 2));
            n /= 2;
        }

        int powNumber = listBit.size() - 1, result = 0;

        for(Byte i: listBit){
            result += i * Math.pow(2, powNumber);
            powNumber--;
        }

        return result;
    }
}
