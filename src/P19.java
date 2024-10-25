import java.io.BufferReader; 
public class p19 {
    public static void main(String[] args) throws IOException {
        System.out.println("請問你是男生嗎?");
        System.out.println("請輸入Y或N");
        
        BufferReader br = new BufferReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char letter = str.charAt(0);

        int (letter == 'Y'||letter == 'y'){
            System.out.println("你是男生阿!");
        }
        else if(letter == 'N'||letter == 'n'){
            System.out.println("你是女生阿!");
        }
        else{
            System.out.println("請輸入或N");
        }

        
    }
}
