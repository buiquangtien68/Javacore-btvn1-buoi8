import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập id nhà:");
        int idHouse=Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập địa chỉ nhà:");
        String address= scanner.nextLine();
        HouseHode houseHode=new HouseHode(idHouse,address);

        ArrayList<Member> members=new ArrayList<>();
        System.out.println("Mời bạn nhập số thành viên trong gia đình:");
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Mời bạn nhập id của thành viên thứ "+(i+1));
            int id=Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập tên của thành viên thứ "+(i+1));
            String name= scanner.nextLine();
            System.out.println("Mời bạn nhập ngày tháng năm sinh (dd/MM/yyyy) của thành viên thứ "+(i+1));
            String birthDate=scanner.nextLine();
            LocalDate dob=LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println("Mời bạn nhập nghề nghiệp của thành viên thứ "+(i+1));
            String job= scanner.nextLine();
            Member member=new Member(id,name,dob,job);
            members.add(member);
        }

        houseHode.setMembers(members);
        System.out.println(houseHode);

    }
}
