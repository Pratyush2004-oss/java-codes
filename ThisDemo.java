
public class ThisDemo {
    private int empid;
    public void setData(int emp_id){
        empid = emp_id;
    }
    public int showData(){
        System.out.println(empid);
        return empid;
    }
    public static void main(String args []){
        ThisDemo T1 = new ThisDemo();
        T1.setData(500);
        T1.showData();
        
    }

}
