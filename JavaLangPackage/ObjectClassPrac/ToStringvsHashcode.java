package JavaLangPackage.ObjectClassPrac;


class ToStringDemo{
     int i;
    ToStringDemo(int i) {
        this.i=i;
    }
    @Override
    public String toString() {
        return "toString() OverRided";
    }

}
class HashCodeDemo{
int i;
HashCodeDemo(int i) {
    this.i=i;
}
@Override
public int hashCode() {
    return i;
}
@Override
public String toString() {
    return i+"" ;
}

}
public class ToStringvsHashcode {
    public static void main(String[] args) {
        ToStringDemo tsd1= new ToStringDemo(10);
        ToStringDemo tsd2= new ToStringDemo(100);

        System.out.println(tsd1);
        System.out.println(tsd2);

        HashCodeDemo hsd1= new HashCodeDemo(10);
        HashCodeDemo hsd2= new HashCodeDemo(100);

        System.out.println(hsd1);
        System.out.println(hsd2);


    }


}
