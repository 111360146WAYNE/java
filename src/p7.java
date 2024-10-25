import java.io.BufferReader; 
public class p7 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入整數");
        
        BufferReader br = new BufferReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if(num == 1){
            System.out.println("輸入的是1");
            System.out.println("選擇的是1");
        }
        System.out.println("結束處理");
    }
}
