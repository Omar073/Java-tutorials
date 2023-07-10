// 21- compareTo function

public class Test {
    public static void main(String[] args) throws Exception {
    
        Number x = new Integer (3);
        System.out.println(x.intValue());
        System.out.println(((Integer) x).compareTo (new Integer (4))); // 0
        System.out.println(((Integer) x).compareTo (new Integer (2))); // 1
        System.out.println(((Integer) x).compareTo (new Integer (3))); // -1
    
    }
}