package Oct.ex29102024_Array;

public class Array7_Object_RealExample {
    public static void main(String[] args) {
        //Array object for electronic

        edevice[] e = new edevice[3];
// Initialize the array elements
      e[0] = new edevice("Laptop");
      e[1] = new edevice("Mobile");
      e[2] = new edevice("TV");


        for(edevice obj: e)
        {
            System.out.println(obj.toString());
        }

    }
}
class edevice {

    private String device;

    public edevice(String device)
    {
        this.device = device;
    }

    public String getDevice()
    {
        return device;
    }

    public void setDevice(String device)
    {
        this.device = device;
    }
    @Override
    public String toString()
    {
        return "test{" + "device='" + device + '\'' + '}';
    }
}

