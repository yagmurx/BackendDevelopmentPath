package inheritance;

public class TeachingAssistant extends Academician {
    private String roomNum;

    public TeachingAssistant(String fullName, String phoneNum, String email, String department, String title, String roomNum) {
        super(fullName, phoneNum, email, department, title);
        this.roomNum = roomNum;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }
}
