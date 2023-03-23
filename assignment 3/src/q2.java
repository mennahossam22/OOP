import java.util.ArrayList;

public class q2 {
    public static int Max(ArrayList<Integer>list)
    {
        int max=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)>max)
            {
                max= list.get(i);
            }
        }
        return max;
    }
}
