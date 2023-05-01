import java.io.*;
// non-generic super-class
class NonGen {
    int n;
    NonGen(int i) { n = i; }
    int getval() { return n; }
}
// generic class sub-class
class Gen<T> extends NonGen {
    T obj;
    Gen(T o1, int i)
    {
        super(i);
        obj = o1;
    }
    T getobj() { return obj; }
}
 
class GFG {
    public static void main(String[] args)
    {
 
        Gen<String> w = new Gen<String>("Hello", 2021);
 
        System.out.println(w.getobj() + " " + w.getval());
    }
}
 