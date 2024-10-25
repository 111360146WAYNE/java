import java.io.BufferReader; 
public class p34 {
    public static void main(String[] args) throws IOException {
        System.out.println("請問要在第幾次處理結束迴圈呢?(1~10)");
        
        BufferReader br = new BufferReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        for(int i=1;i<=10;i++){
            if(i == res)
            continue;
            System.out.println("第"+i+"次的處理");
        }

    }
}
