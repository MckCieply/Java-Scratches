
package classes1;

public class Classes1 {
    int num;
    String saidNumber;
    int[] ldzieci;
    public Classes1(int num, String saidNumber){
        this.num = num;
        this.saidNumber = saidNumber;
    }
    public void outNumber(){
        System.out.print("Number "+ this.num+" is "+ this.saidNumber);
    }
    public static void main(String[] args) {
        Classes1 num1 = new Classes1(12, "dwanascie");
        num1.outNumber();
    }
    
}

