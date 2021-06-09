public class Demo {
    public int sum(int x, int y){
        return x+y;
    }

    public int sub(int x, int y){
        return x-y;
    }

    public int multiple(int x, int y){
        return x*y;
    }

    public int max(int x, int y, int z){
        if(x > y && x > z){
            return x;
        }

        if(y > z){
            return y;
        }

        return z;
    }
}