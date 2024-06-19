public class Admission  extends hp
{
    private int count_sub;
    private student s;

    public Admission(student s)
    {
        this.s=s;
    }
    public int Admission_fees(student s,int c)
    {
        return c/1000+s.age*7;
    }
    public  void  print_recipt()
    {
        // print wla kaam karege 
    }
    public void save_database()
    {
        //data save karega

    }
}
