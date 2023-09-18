public class essentialInfo {

    private String name;
    private String email;
    private String phone;

    public void setInfo(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void introduceMyself() {
        System.out.println(name);
        System.out.println(email);
        System.out.println(phone);
    }
}

class Student extends essentialInfo {

    private String studentCard;

    public void setInfo(String name, String email, String phone, String studentCard) {
        super.setInfo(name, email, phone);
        this.studentCard = studentCard;
    }

    public void introduceMyself() {
        super.introduceMyself();
        System.out.println(studentCard);
    }
}

class Teacher extends essentialInfo {

    private String IDCard;
}
