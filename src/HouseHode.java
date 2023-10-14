import java.util.ArrayList;

public class HouseHode {
    private int idHouse;
    private String address;
    private ArrayList<Member> members;

    public HouseHode(int idHouse, String address) {
        this.idHouse = idHouse;
        this.address = address;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "HouseHode{" +
                "idHouse=" + idHouse +
                ", address='" + address + '\'' +
                ", members=" + members +
                '}';
    }
}
