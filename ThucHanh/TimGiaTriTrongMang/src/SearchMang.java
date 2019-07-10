import java.util.Scanner;

public class SearchMang {
    public static void main(String[] args) {
        String[] name={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập Tên Cần Tìm Kiếm");
        String inputName=scanner.nextLine();
        boolean check=false;
        for(int i=0;i<name.length;i++){
            if(name[i].equals(inputName)){
                check=true;
                System.out.println("có tên đó trong danh sách "+inputName+" vị trí "+(i+1));
                break;
            }
        } if(!check){
            System.out.println("Không có tên đó trong danh sách ");
        }
    }
}
