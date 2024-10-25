import java.io.BufferReader; 
public class p15 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入整數");
        
        BufferReader br = new BufferReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        switch(num){
            case 1:
            {
                System.out.println("輸入的是1");
            }
            case 2:
            {
                System.out.println("輸入的是2");
            }
            default
            {
                System.out.println("請輸入1或2");
            }
        }
        
    }
}
