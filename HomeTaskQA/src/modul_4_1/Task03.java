package modul_4_1;

public class Task03 {

public static void main(String[] args) {
	for(int arm_num = 10 ; arm_num < 1_000_000 ; arm_num++)
    {
        String[] data = String.valueOf(arm_num).split("(?<=.)");
        int length = String.valueOf(arm_num).length();

        int arm_t_num = 0;

        int ary[] = new int[length];

        for(int i = 0 ; i < length ; i++)
        {
            ary[i] = Integer.parseInt(data[i]);

            for(int x = 0 ; x < length-1 ; x++)
            {
                ary[i] = ary[i] * Integer.parseInt(data[i]);
            }

            arm_t_num+=ary[i];
        }

        if(arm_num == arm_t_num)
        {
            System.out.println(arm_num);
        }
    }
		
	}

}
