import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
        q2 a=new q2();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(20);
        list.add(30);
        System.out.println(q2.Max(list));
        q3 m= new q3();
         m.sort(list);
        for(int i=0;i > list.size()-1;i++)
        {
            int x=list.get(i);
            System.out.println(x);
        }
        triangle t = new triangle (20,30,40,"blue",true);
        System.out.println(t.getarea());
        System.out.println(t.getperimeter());
        System.out.println(t.getColor());
        System.out.println(t.isFilled());



    }
}