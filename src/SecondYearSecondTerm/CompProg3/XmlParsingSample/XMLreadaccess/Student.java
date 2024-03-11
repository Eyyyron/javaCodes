package XMLreadaccess;

public record Student(String id, String name, String course,
                      int yr, String[] phones) {
    public String toString() {
        String result = String.format("ID #  : %s%nName  : %s%nCourse: %s%nYear: %d",
                id, name, course, yr);
        if (phones != null) {
            result += "\nPhone/s:";
            for (String phone: phones) {
                result += "\n" + phone;
            }
        }
        return result;
    }
}
