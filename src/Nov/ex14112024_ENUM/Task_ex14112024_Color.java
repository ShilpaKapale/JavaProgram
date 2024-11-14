package Nov.ex14112024_ENUM;

public class Task_ex14112024_Color {
    public static void main(String[] args) {

        System.out.println(Color.GREEN.getHexacode());
        if( Color.BLUE.getHexacode()== "#3377FF")
        {
            System.out.println("Color is Blue");
        }
    }
}

enum Color
{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexacode;

    Color(String hexacode) {
        this.hexacode = hexacode;
    }

    public String getHexacode() {
        return hexacode;
    }

    public void setHexacode(String hexacode) {
        this.hexacode = hexacode;
    }

}
